public class Calculator {
    int nOpDone;
    double lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;
    }

    double add(double a, double b) {
        nOpDone++;
        lastRes = a + b;
        return lastRes;
    }

    double sub(double a, double b) {
        nOpDone++;
        lastRes = a - b;
        return lastRes;
    }

    double mul(double a, double b) {
        nOpDone++;
        lastRes = a * b;
        return lastRes;
    }

    double div(double a, double b) {
        nOpDone++;
        lastRes = a / b;
        return lastRes;
    }
}
