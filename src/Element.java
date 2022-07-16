public class Element {
    //public Element element;
    public Integer size;
    public String id;
    public String style;
    public String clas;
    public String innerText;



    public static class Builder {
        //private Element element;
        private Integer size;
        private String id;
        protected String style;
        private String clas;
        private String innerText;

        public static Builder builder() {
            return new Builder();
        }

        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder style(String style) {
            this.style = style;
            return this;
        }

        public Builder clas(String clas) {
            this.clas = clas;
            return this;
        }

        public Builder innerText(String innerText) {
            this.innerText = innerText;
            return this;
        }

        public Element build() {
            return new Element(this);
        }
    }

    public Element(Builder builder) {
        //this.element = builder.element;
        this.size = builder.size;
        this.id = builder.id;
        this.style = builder.style;
        this.clas = builder.clas;
        this.innerText = builder.innerText;
    }

    public String toString() {
        String res = " ";
        if (size != null)
            res = res + " <h" + this.size;
        else if (id != null)
            res = res + "<p id=" + '"' + this.id + '"';

        if (clas != null) {
            res = res + " class=" + '"' + this.clas + '"' + ">";
        }
        else if (style != null) {
            res = res + " style=" +  '"' + this.style + '"' + ">";
        } else {
            if (size != null || id != null)
                res = res + ">";
        }

        if (innerText != null)
            res = res + this.innerText;

        if (size != null)
            res = res + "</h" + this.size + ">" + '\n';
        else if (id != null)
            res = res + "</p>" + '\n';

        return res;
    }
}
