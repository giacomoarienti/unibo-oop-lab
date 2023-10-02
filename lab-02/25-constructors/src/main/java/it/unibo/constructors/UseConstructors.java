package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013
        Student s1 = new Student(1014, "Mario", "Rossi", 2013);
        s1.printStudentInfo();

        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010
        Student s2 = new Student(1018, "Luca", "Bianchi", 2010);
        s2.printStudentInfo();

        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012
        Student s3 = new Student(1019, "Peppino", "Vitiello", 2012);
        s3.printStudentInfo();

        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013
        Student s4 = new Student(1020, "Luca", "Verdi", 2013);
        s4.printStudentInfo();

        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe
        Train t1 = new Train(100, 200);
        t1.printTrainInfo();

        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe
        Train t2 = new Train(50, 1050);
        t2.printTrainInfo();

        // 7) Creare un treno con 500 posti, tutti di seconda classe
        Train t3 = new Train(0, 500);
        t3.printTrainInfo();

        // 8) Creare un treno con numero di posti di default
        Train t4 = new Train();

        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        t4.printTrainInfo();
    }
}
