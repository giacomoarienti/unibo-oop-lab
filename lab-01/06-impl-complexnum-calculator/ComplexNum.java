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

    void sub(ComplexNum num) {
        this.re -= num.re;
        this.im -= num.im;
    }

    void mul(ComplexNum num) {
        double re = this.re;
        this.re = this.re * num.re - (this.im * num.im);
        this.im = this.im * num.re + (re * num.im);
    }

    void div(ComplexNum num) {
        double re = this.re;
        double den = num.re * num.re + num.im * num.im;

        this.re = (this.re * num.re + this.im * num.im) / den;
        this.im = (this.im * num.re - (re * num.im)) / den;
    }

    String toStringRep() {
        String num = "";

        if (this.re != 0.0) {
            num += this.re;
        }

        if (this.im != 0.0) {
            if (this.im > 0) {
                num += "+";
            }

            if (this.im == -1) {
                num += "-";
            } else {
                num += this.im;
            }
            num += "i";
        }

        return num;
    }
}