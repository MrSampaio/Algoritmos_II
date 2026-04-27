package Stacks;

import java.util.Stack;

public class GetElements {
    public static void main(String[] args) {
        Stack<Integer> notas = new Stack<>();

        notas.push(7);
        notas.push(8);
        notas.push(5);
        notas.push(10);

        System.out.println("A pilha completa eh: " + notas);

        System.out.println("A basa da pilha de notas eh: " + notas.firstElement());
        System.out.println("O topo da pilha de notas eh: " + notas.lastElement());

        System.out.println("A nota no indice 1 da pilha eh: " + notas.get(1));
        System.out.println("A nota no indice 1 sendo buscada com elementAt eh: " + notas.elementAt(1));
    }
}
