package Arrays;
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[][] matriz = {{2, 5, 5}, {4, 10, 9}};

        System.out.println("A matriz impressa corretamente eh: " + Arrays.deepToString(matriz));

        int[][] copyMatriz = new int[2][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                copyMatriz[i][j] = matriz[i][j];
            }
        }

        System.out.println("A matriz copiada ficou assim: " + Arrays.deepToString(copyMatriz));

        if(Arrays.deepEquals(matriz, copyMatriz)){
            System.out.println("As matrizes sao iguais!");
        } else{
            System.out.println("As matrizes sao diferentes");
        }
    }
}
