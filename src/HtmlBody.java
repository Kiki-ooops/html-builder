import java.util.ArrayList;
import java.util.List;

public class HtmlBody extends Element {
    public static Element element;
    public List<String> list;

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder extends Element.Builder{
        private Element element;
        static List<String> list = new ArrayList<>();

        public Builder element(Element element) {
            this.element = element;
            list.add(element.toString());
            return this;
        }

        public HtmlBody build() {
            return new HtmlBody(this);
        }
    }
    public HtmlBody(Builder builder) {
        super(builder);
        element = builder.element;
        list = builder.list;
    }

    public String toString() {
        String res = "";
        for (String str: list) {
            res = res + str;
        }
       return "<body>"  + '\n' +
               res +
               "<body>"  + '\n'+
               "<html>" + '\n';
    }
}
