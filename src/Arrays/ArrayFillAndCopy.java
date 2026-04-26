package Arrays;
import java.util.Arrays;

public class ArrayFillAndCopy {
    public static void main(String[] args){
        double[] notas = new double[10];

        Arrays.fill(notas, 5.5);

        double[] copyNotas0To3 = Arrays.copyOfRange(notas, 0, 3);
        double[] copyNotas4To7 = Arrays.copyOfRange(notas, 4, 8);

        System.out.println("Os 3 primeiros valores do vetor sao: " + Arrays.toString(copyNotas0To3));
        System.out.println("Os elementos com indice de 4 a 7 sao: " + Arrays.toString(copyNotas4To7));

    }

}
