package Arrays;
import java.util.Arrays;
import java.util.List;

public class ListAndAsList {
    public static void main(String[] args) {
        String[] cidades = {"Sao Paulo", "Rio de Janeiro", "Curitiba"};
        List<String> cidadesLista = (Arrays.asList(cidades));

        cidadesLista.set(0, "Sorocaba");

        // cidadesLista.add("sei la");
        // essa operacao nao eh suportada porque uma lista criada a partir de um vetor possui seu tamanho estatico.

        System.out.println(cidades[0]);
        System.out.println(Arrays.toString(cidades));

    }
}
