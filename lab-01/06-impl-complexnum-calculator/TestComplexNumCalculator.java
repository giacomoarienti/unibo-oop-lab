class TestComplexNumCalculator {
  public static void main(String[] args) {
    /*
     * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
     * tra numeri complessi:
     *
     * - add(1+2i, 2+3i) = 3+5i
     *
     * - sub(4+5i, 6+7i) = -2-2i
     *
     * - mul(8+2i, 3-i) = 26 - 2i
     *
     * - ... altre a piacere
     *
     * 2) Verificare il corretto valore dei campi nOpDone, lastRes
     *
     * 3) Fare altre prove con operazioni a piacere
     */
    ComplexNumCalculator calc = new ComplexNumCalculator();
    calc.build();

    ComplexNum a = new ComplexNum();
    ComplexNum b = new ComplexNum();

    a.build(1, 2);
    b.build(2, 3);
    System.out.println("add(1+2i, 2+3i) = " + calc.add(a, b).toStringRep());

    a.build(4, 5);
    b.build(6, 7);
    System.out.println("sub(4+5i, 6+7i) = " + calc.sub(a, b).toStringRep());

    a.build(8, 2);
    b.build(3, -1);
    System.out.println("mul(8+2i, 3-i) = " + calc.mul(a, b).toStringRep());

    a.build(4, 3);
    b.build(1, 2);
    System.out.println("div(4+3i, 1+2i) = " + calc.div(a, b).toStringRep());

    System.out.println("npOpDone = " + calc.nOpDone + " lastRes = " + calc.lastRes.toStringRep());
  }
}
