import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HtmlBuilder {
    public static void main(String[] args) {
        HtmlDocument document = HtmlDocument.builder()
                .head(
                        HtmlHead.builder()
                                .meta("author", "kiki")
                                .mata(StandardCharsets.UTF_8)
                                .title("hello world")
                                .build()
                )
                .body(
                        HtmlBody.builder()
                                .element(
                                        HeadlineElement.builder()
                                                .size(1)
                                                .style("color:blue;text-align:center")
                                                .innerText("Hello World")
                                                .build()
                                )
                                .element(
                                        ParagraphElement.builder()
                                                .id("p-1")
                                                .style("color:yellow")
                                                .innerText("this is a web page")
                                                .build()
                                )
                                .element(
                                        DivElement.builder()
                                                .element(
                                                        HeadlineElement.builder()
                                                                .size(2)
                                                                .clas("my-headline")
                                                                .innerText("This is headline")
                                                                .build()
                                                )
                                                .element(
                                                        DivElement.builder()
                                                                .element(
                                                                        ParagraphElement.builder()
                                                                                .id("p-2")
                                                                                .clas("my-paragraph")
                                                                                .innerText("This is paragraph")
                                                                                .build()
                                                                )
                                                                .build()
                                                )
                                                .build()
                                )
                                .build()
                )
                .build();

        try {
            FileWriter myWriter = new FileWriter("hello.html");
            myWriter.write(document.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

//            String answer = Files.readString(Path.of("trueHello.html"));
//            assert answer.equals(document.toString());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
