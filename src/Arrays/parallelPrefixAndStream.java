package Arrays;
import java.util.Arrays;

public class parallelPrefixAndStream {
    public static void main(String[] args) {
        int[] vendas = {100, 200, 150, 300};

        Arrays.parallelPrefix(vendas, Integer::sum);

        System.out.println("Array apos parallelPrefix: " + Arrays.toString(vendas));

        double mediaArray = Arrays.stream(vendas).average().orElse(0.0);

        System.out.println("A media dos valores do array eh: " + mediaArray);
    }
}
