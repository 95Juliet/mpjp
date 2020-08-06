package m4.s08;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = aSortedSet();
        System.out.println(sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println(sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }

    //TreeSet - set che usa una struttura ad albero (ordinata) -> ordina autonomamente i dati
    private static SortedSet<Integer> aSortedSet() {
        return new TreeSet<Integer>(Arrays.asList(12, 18, -5, -2233));
    }

}

//Il costo delle operazioni è logaritrmico

/*
[ 1 3 45 18]

      18
   3     45
1 
    
 */
