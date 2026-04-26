package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class RemoveReplaceAndForEach {
    public static void main(String[] args) {
        List<Double> salarios = new ArrayList<>();

        salarios.add(2500.00);
        salarios.add(1200.00);
        salarios.add(3000.00);
        salarios.add(800.00);
        salarios.add(5000.00);

        salarios.removeIf(salario -> salario < 1000.00);

        salarios.replaceAll(salario -> salario * 1.10);

        salarios.sort(Comparator.naturalOrder());

        salarios.forEach(salario -> System.out.println(salario));

    }
}
