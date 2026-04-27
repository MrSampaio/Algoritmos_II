package Stacks;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class PushAndPop {
    public static void main(String[] args) {
        Stack<String> livros = new Stack<>();

        livros.push("Python");
        livros.push("Java");
        livros.push("JavaScript");

        System.out.println("O livro no topo da pilha eh: " + livros.peek());

        System.out.println("O livro Java esta na posicao " + livros.search("Java") + " da pilha");

        while(!livros.isEmpty()){
            System.out.println(livros.pop());
        }
    }
}
