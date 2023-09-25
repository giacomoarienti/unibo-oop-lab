class Student {
    // È buona pratica mettere i campi in testa alla classe
    String name;
    String surname;
    int id;
    int matriculationYear;

    void build(String nome, String cognome, int matricola, int annoDiImmatricolazione) {
        this.name = nome;
        this.surname = cognome;
        this.id = matricola;
        this.matriculationYear = annoDiImmatricolazione;
    }

    void printStudentInfo() {
        System.out.println("Nome: " + this.name + " " + this.surname);
        System.out.println("Matricola: " + this.id);
        System.out.println("Anno di immatricolazione: " + this.matriculationYear);
    }
}
