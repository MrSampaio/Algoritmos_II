package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class RemoveAndClone {
    public static void main(String[] args) {
        List<Integer> ativos = new ArrayList<>();

        ativos.add(10);
        ativos.add(20);
        ativos.add(30);

        List<Integer> novos = new ArrayList<>();

        novos.add(40);
        novos.add(50);

        ArrayList<Integer> ativosArrayList = (ArrayList<Integer>) ((ArrayList<Integer>) ativos).clone();
        System.out.println("Lista clonada: " + ativosArrayList);

        ativosArrayList.toArray(new Integer[0]);

        List<Integer> remover = new ArrayList<>();

        remover.add(10);
        remover.add(50);
        ativos.removeAll(remover);

        List<Integer> reter = new ArrayList<>();

        reter.add(20);

        ativos.retainAll(reter);

        System.out.println("A lista de ativos apos as operacoes contem: " + ativos);

        ativos.clear();

    }
}
