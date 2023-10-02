package it.unibo.arrays;

class MyCircularArray {
    private static final int DEF_SIZE = 10;

    int[] array;
    int counter;

    MyCircularArray() {
        this(DEF_SIZE);
    }

    MyCircularArray(int size) {
        this.array = new int[size];
        this.counter = 0;
    }

    void add(final int elem) {
        this.array[counter % this.array.length] = elem;
        this.counter++;
    }

    void reset() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = 0;
        }
        this.counter = 0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray array = new MyCircularArray();

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }
        array.printArray();

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        for (int i = 11; i <= 15; i++) {
            array.add(i);
        }
        array.printArray();

        // 4) Invocare il metodo reset
        array.reset();

        // 5) Stampare il contenuto dell'array circolare
        array.printArray();

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        array.add(2);
        array.add(5);
        array.add(8);

        array.printArray();
    }
}
