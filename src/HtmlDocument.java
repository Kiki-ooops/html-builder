public class HtmlDocument {
    private HtmlHead head;
    private HtmlBody body;
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private HtmlHead head;
        private HtmlBody body;

        public Builder head(HtmlHead head) {
            this.head = head;
            return this;
        }

        public Builder body(HtmlBody body) {
            this.body = body;
            return this;
        }

        public HtmlDocument build() {
            return new HtmlDocument(this);
        }
    }

    private HtmlDocument(Builder builder) {
        head = builder.head;
        body = builder.body;
    }

    public String toString() {
        return head.toString() + " \n" + body.toString();
    }
}
