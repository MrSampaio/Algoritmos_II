package LinkedList;

import java.util.*;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<String> pacientes = new LinkedList<>();

        pacientes.offer("Ricardo");
        pacientes.offer("Paulo");
        pacientes.offer("Ana");

        System.out.println("O proximo paciente a ser atendido eh: " + pacientes.peek());

        System.out.println("Pegando o proximo paciente a ser atendido (mas com element()): " + pacientes.element());

        System.out.println("Removendo o paciente apos ser atendido: " + pacientes.poll());

        Deque<String> pacientesDeque = new LinkedList<>();

        pacientesDeque.add("Ricardo");
        pacientesDeque.add("Paulo");
        pacientesDeque.add("Milena");

        pacientesDeque.addFirst("Isaura");

        System.out.println("Agora, o primeiro paciente eh: " + pacientesDeque.getFirst());
        System.out.println("O ultimo paciente eh: " + pacientesDeque.getLast());

        System.out.println("Paciente atendido: " + pacientesDeque.removeFirst());
        System.out.println("Ultimo paciente do dia atendido: " + pacientesDeque.removeLast());

        pacientesDeque.clear();

        System.out.println(pacientesDeque);
    }
}
