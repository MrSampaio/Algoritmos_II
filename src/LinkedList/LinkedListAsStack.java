package LinkedList;
import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String[] args) {
        Deque<String> historico = new LinkedList<>();

        historico.push("Pagina 1");
        historico.push("Pagina 2");
        historico.push("Pagina 3");

        System.out.println("A quantidade de paginas eh: " + historico.size());

        if(historico.isEmpty()){
            System.out.println("O historico esta vazio");
        } else{
            System.out.println("O historico contem paginas");
        }

        System.out.println("Voltando para a ultima pagina acessada: " + historico.pop());

        System.out.println("Nova pagina no topo da pilha: " + historico.peek());
    }
}
