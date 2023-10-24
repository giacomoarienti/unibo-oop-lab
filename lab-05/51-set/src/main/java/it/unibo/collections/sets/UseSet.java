package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    private static boolean isCollectionEven(final Collection<String> coll) {
        for(final var el: coll) {
            if(Integer.parseInt(el) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Collection<String> tree = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for(int i = 0; i <= ELEMS; i++) {
            tree.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(tree);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        final var it = tree.iterator();
        while(it.hasNext()) {
            if(Integer.valueOf(it.next()) % 3 == 0) {
                it.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        System.out.print("[");
        for(final String el : tree) {
            System.out.print(el + ",");
        }
        System.out.println("]");
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        System.out.println("even: " + isCollectionEven(tree));
    }
}
