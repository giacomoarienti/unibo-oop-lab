class TestStudent {

    public static void main(String[] args) {
        Student someone = new Student();
        someone.build("Alex", "Balducci", 1015, 2019);
        someone.printStudentInfo();
        System.out.println();

        Student someone2 = new Student();
        someone2.build("Angel", "Bianchi", 1016, 2018);
        someone2.printStudentInfo();
        System.out.println();

        Student someone3 = new Student();
        someone3.build("Andrea", "Bracci", 1017, 2017);
        someone3.printStudentInfo();
        System.out.println();
    }
}
