package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ContainsAndIndex {
    public static void main(String[] args) {
        List<String> carrinho = new ArrayList<>();

        carrinho.add("Banana");
        carrinho.add("Maçã");
        carrinho.add("Uva");
        carrinho.add("Maçã");
        carrinho.add("Pera");

        System.out.println("A primeira vez que a palavra 'maçã' aparece eh: " + carrinho.indexOf("Maçã"));
        System.out.println("A ultima vez que a palavra 'maçã' aparece eh: " + carrinho.lastIndexOf("Maçã"));

        if(carrinho.contains("Uva")){
            System.out.println("O item uva esta no carrinho.");
        } else{
            System.out.println("O item uva nao esta no carrinho.");
        }

        List<String> frutasEssenciais = new ArrayList<>();

        frutasEssenciais.add("Banana");
        frutasEssenciais.add("Maçã");

        if(carrinho.containsAll(frutasEssenciais)){
            System.out.println("O carrinho contem todas as frutas indispensaveis.");
        } else {
            System.out.println("O carrinho nao possui todas as frutas essenciais");
        }

        carrinho.set(4, "Abacaxi");

        System.out.println("O item no indice 2 eh: " + carrinho.get(2));
    }
}
