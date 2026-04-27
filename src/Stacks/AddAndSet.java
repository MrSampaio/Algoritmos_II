package Stacks;
import java.util.Stack;

public class AddAndSet {
    public static void main(String[] args) {
        Stack<String> pratos = new Stack<>();

        pratos.add("Prato azul");
        pratos.add("Prato branco");
        pratos.add("Prato laranja");
        pratos.add("Prato roxo");

        pratos.add(2, "Prato preto");

        System.out.println("Pilha com valor inserido aleatoriamente: " + pratos);

        pratos.set(1, "Prato quebrado");

    }
}
