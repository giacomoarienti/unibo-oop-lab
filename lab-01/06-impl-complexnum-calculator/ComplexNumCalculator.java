class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = new ComplexNum();
        lastRes.build(0, 0);
    }

    ComplexNum add(ComplexNum a, ComplexNum b) {
        this.lastRes = new ComplexNum();
        this.lastRes.im = a.im;
        this.lastRes.re = a.re;

        this.lastRes.add(b);

        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum sub(ComplexNum a, ComplexNum b) {
        this.lastRes = new ComplexNum();
        this.lastRes.im = a.im;
        this.lastRes.re = a.re;

        this.lastRes.sub(b);

        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum mul(ComplexNum a, ComplexNum b) {
        this.lastRes = new ComplexNum();
        this.lastRes.im = a.im;
        this.lastRes.re = a.re;

        this.lastRes.mul(b);

        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum div(ComplexNum a, ComplexNum b) {
        this.lastRes = new ComplexNum();
        this.lastRes.im = a.im;
        this.lastRes.re = a.re;

        this.lastRes.div(b);

        this.nOpDone++;
        return this.lastRes;
    }
}
