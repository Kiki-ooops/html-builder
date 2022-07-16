import java.util.ArrayList;
import java.util.List;

public class DivElement extends Element{
    public Element element;
    //public List<Element> list;
    public static Builder builder() {
        HtmlBody.builder().list.add("  <div>" + '\n');
        return new Builder();
    }

    public static class Builder extends Element.Builder{
        private Element element;
        //private static List<Element> list = new ArrayList<>();

        public Builder element(Element element) {
            this.element = element;
            HtmlBody.builder().element(element);
            //list.add(element);
            return this;
        }

        @Override
        public DivElement build() {
            HtmlBody.builder().list.add("  </div>" + '\n');
            return new DivElement(this);
        }

    }
    public DivElement(Builder builder) {
        super(builder);
        element = builder.element;
        //HtmlBody.builder().element(builder);
        //list = builder.list;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
