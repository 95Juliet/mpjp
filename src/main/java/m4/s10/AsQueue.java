package m4.s10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = aQueue();
        System.out.println(q);

        if (q.offer(18)) {
            System.out.println("18 has been added");
        }

        //Ritorna il primo elemento o un'eccezione se la queue è vuota
        System.out.println("The first element in queue (or throws): " + q.element());
        //Ritorna il primo elemento o null se la queue è vuota
        System.out.println("Again, the first element (or null): " + q.peek());

        System.out.println("Remove (or throws): " + q.remove());
        //Rimuove il primo elemento o restituisce null se la queue è vuota
        System.out.println("Poll (or null): " + q.poll());
    }

    private static Queue<Integer> aQueue() {
        return new LinkedList<>(Arrays.asList(5, -3, -1, 12, 27, 5));
    }
}
