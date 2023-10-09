package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {
        // 1)Creare 3 studenti a piacere
        final Student paoloRossi = new Student(0, "Paolo", "Rossi", "password", 2010);
        final Student marioVerdi = new Student(1, "Mario", "Verdi", "password", 2012);
        final Student fabioBianchi = new Student(2, "Fabio", "Bianchi", "password", 2013);
        // 2)Creare 2 docenti a piacere
        final Professor profGinoPaoli = new Professor(0, "Gino", "Paoli", "password");
        final Professor profFilippoGaruti = new Professor(1, "Filippo", "Garuti", "password");
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        final ExamRoom examRoom1 = new ExamRoom(100, "ExamRoom 1", false, false);
        final ExamRoom examRoom2 = new ExamRoom(80, "ExamRoom 2", false, false);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        final Exam exam1 = new Exam(0, 10, "OOP", profGinoPaoli, examRoom1);
        final Exam exam2 = new Exam(1, 2, "OS", profFilippoGaruti, examRoom2);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam1.registerStudent(paoloRossi);
        exam1.registerStudent(marioVerdi);
        exam1.registerStudent(fabioBianchi);
        exam2.registerStudent(paoloRossi);
        exam2.registerStudent(marioVerdi);
        exam2.registerStudent(fabioBianchi);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam1);
        System.out.println(exam2);
    }
}
