package m4.s09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class AsNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = aNavSet();
        System.out.println(ns);

        //Ritorna il valore che vale 11 o quello più alto più vicino
        System.out.println("Eleven or more: " + ns.ceiling(11));
        //Ritorna zero e se non lo trova prende il più vicino andando in negativo
        System.out.println("Zero or less: " + ns.floor(0));

        //Ritorna il valore più grande di -1 e più vicino ad esso
        System.out.println("More than -1: " + ns.higher(-1));
        //Ritorna il valore più piccolo di -1 e più vicino ad esso
        System.out.println("Less than -1: " + ns.lower(-1));

        //Viene tolto il primo elemento - rimane come variabile locale
        System.out.println("Poll the first element: " + ns.pollFirst());
        //Viene tolto l'ultimo elemento - rimane come variabile locale
        System.out.println("Poll the last element: " + ns.pollLast());

        //Iterazione - è possibile in entrambe le direzioni
        System.out.println("Print the set in descending order");
        Iterator<Integer> it = ns.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Cambia l'ordine degli elementi nel set
        System.out.println("The set in descending order: " + ns.descendingSet());
    }

    //NabigableSet - ha dei metodi in più rispetto a SortedSet
    private static NavigableSet<Integer> aNavSet() {
        return new TreeSet<Integer>(Arrays.asList(5, -3, -1, 12, 27, 5));
    }
}
