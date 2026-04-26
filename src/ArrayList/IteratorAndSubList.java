package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndSubList {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("1. Lista original: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer atual = it.next();
            if (atual % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("2. Lista após remover pares: " + numeros);

        System.out.print("3. Números na ordem reversa: ");

        ListIterator<Integer> listIt = numeros.listIterator(numeros.size());
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();

        List<Integer> sublista = numeros.subList(0, 2);
        System.out.println("4. Sublista gerada subList(0, 2): " + sublista);

        sublista.set(0, 99);
        System.out.println("5. Sublista após definir o primeiro elemento como 99: " + sublista);
        System.out.println("-> Lista ORIGINAL após a alteração na sublista: " + numeros);
    }
}