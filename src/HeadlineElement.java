public class HeadlineElement extends Element{
    //public String innerText;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Element.Builder{
        //private String innerText;
//        public Builder innerText(String innerText) {
//            this.innerText = innerText;
//            return this;
//        }
        @Override
        public HeadlineElement build() {
            return new HeadlineElement(this);
        }
    }

    private HeadlineElement(Builder builder) {
        super(builder);
        //this.innerText = builder.innerText;
    }

    public String toString() {
        return super.toString();
    }
}
