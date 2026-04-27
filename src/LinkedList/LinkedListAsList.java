package LinkedList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListAsList {
    public static void main(String[] args) {
        List<String> produtos = new LinkedList<>();


        produtos.add("Monitor");
        produtos.add("Processador");
        produtos.add("Cooler");
        produtos.add("Notebook");

        produtos.add(1, "Placa de video");

        produtos.set(2, "Teclado");

        System.out.println("O valor agora inserido no indice 2 eh: " + produtos.get(2));

        System.out.println("O notebook esta na posicao " + produtos.indexOf("Notebook") + " da lista");

        if(produtos.contains("Monitor")){
            System.out.println("Temos monitor no estoque");

            produtos.remove("Monitor");

        } else{
            System.out.println("Nao temos monitores no estoque");
        }


    }
}
