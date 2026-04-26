package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class EnsureCapacityAndTrimToSize {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>(1000);

        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Pedro");

        if(funcionarios.isEmpty()){
            System.out.println("A lista de funcionarios esta vazia!");
        } else{
            int tamanhoLista = funcionarios.size();

            System.out.println("A lista de funcionarios possui " + tamanhoLista + " registros");

            ArrayList<String> funcionariosTrim = new ArrayList<>(funcionarios);
            funcionariosTrim.trimToSize();
        }
    }
}
