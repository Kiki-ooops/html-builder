public class ParagraphElement extends Element{

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Element.Builder{

        @Override
        public ParagraphElement build() {
            return new ParagraphElement(this);
        }
    }

    public ParagraphElement(Builder builder) {
        super(builder);
    }
    public String toString() {
        return " " + super.toString();
    }

}
