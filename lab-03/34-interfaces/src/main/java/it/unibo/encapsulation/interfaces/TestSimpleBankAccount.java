package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        final AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        final AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        final SimpleBankAccount sb1 = new SimpleBankAccount(andreaRossi.getUserID(), 0);
        final SimpleBankAccount sb2 = new SimpleBankAccount(alexBianchi.getUserID(), 0);

        // 4) Effettuare una serie di depositi e prelievi
        sb1.deposit(andreaRossi.getUserID(), 100);
        sb1.depositFromATM(andreaRossi.getUserID(), 50);
        sb1.withdraw(andreaRossi.getUserID(), 20);

        sb2.withdraw(alexBianchi.getUserID(), 10);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println("ID: " + sb1.getId() + " Balance: " + sb1.getBalance());
        System.out.println("ID: " + sb2.getId() + " Balance: " + sb2.getBalance() + "\n");

        // 6) Provare a prelevare fornendo un id utente sbagliato
        sb1.withdraw(alexBianchi.getUserID(), 10);

        // 7) Controllare nuovamente l'ammontare
        System.out.println("ID: " + sb1.getId() + " Balance: " + sb1.getBalance());
    }
}
