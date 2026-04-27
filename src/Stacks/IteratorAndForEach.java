package Stacks;
import java.util.Arrays;
import java.util.Stack;
import java.util.Iterator;

public class IteratorAndForEach {
    public static void main(String[] args) {
        Stack<Double> caixa = new Stack<>();

        caixa.push(10.5);
        caixa.push(20.0);
        caixa.push(50.0);

        Iterator<Double> iterador = caixa.iterator();

        while(iterador.hasNext()){
            Double atual = iterador.next();
            System.out.println(atual);
        }

        caixa.forEach(dinheiro -> System.out.println(dinheiro));

        caixa.toArray(new Double[0]);

        System.out.println(caixa.toString());

    }
}
