class ComplexNum {
    double re;
    double im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        return this.re == num.re && this.im == num.im;
    }

    void add(ComplexNum num) {
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {
        String num = "";

        if (this.re != 0.0) {
            num += this.re;
        }

        if (this.im != 0.0) {
            if (this.im > 0)
                num += "+";

            if (this.im == -1)
                num += "-i";
            else {
                num += this.im;
            }
            num += "i";
        }

        return num;
    }
}