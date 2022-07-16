import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class HtmlHead {
    private String title;
    //public String author;
    //public String kiki;
    public Charset utf8;
    public List<String> mata;

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String title;
        private Charset utf8;
        //private String author;
        //private String kiki;
        private List<String> mata = new ArrayList<>();

        public Builder mata(Charset utf8) {
            this.utf8 = utf8;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder meta(String str1, String str2) {
            mata.add(str1);
            mata.add(str2);
            return this;
        }

        public HtmlHead build() {
            return new HtmlHead(this);
        }

    }
    public HtmlHead(Builder builder) {
        title = builder.title;
        //author = builder.author;
        //kiki = builder.kiki;
        utf8 = builder.utf8;
        mata = builder.mata;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < mata.size(); i+=2) {
            res = res + "<meta name= " + '"' + mata.get(i) + '"' + " content = " + '"' + mata.get(i + 1) + '"' + ">" + '\n';
        }
        return  "<!DOCTYPE html>" + '\n' +
                "<html lang=\"en\">" + '\n' +
                "<head>"  + '\n' +
                res +
                "<meta charset=\"" + this.utf8 + "\">" + '\n' +
                "<title>" + this.title + "</title>" + '\n' +
                "</head>"  + '\n';
    }
}
