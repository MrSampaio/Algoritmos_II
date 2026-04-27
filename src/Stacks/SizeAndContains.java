package Stacks;
import java.util.Deque;
import java.util.ArrayDeque;

public class SizeAndContains {
    public static void main(String[] args) {
        Deque<String> tarefas = new ArrayDeque<>();

        tarefas.push("Lavar a louça");
        tarefas.push("Tirar o lixo");
        tarefas.push("Varrer a casa");
        tarefas.push("Ir ao mercado");

        System.out.println("A quantidade de tarefas na lista eh: " + tarefas.size());

        if(tarefas.contains("Estudar Java")){
            System.out.println("Voce precisa estudar Java!!!!!!");
        } else{
            System.out.println("Voce ja estudou Java hoje, parabens.");
        }

        while(!tarefas.isEmpty()){
            if(tarefas.size() == 1){
                System.out.println("Sua ultima tarefa eh: " + tarefas.pop());
            } else{
                System.out.println("Voce precisa " + tarefas.pop());
            }

        }
    }
}
