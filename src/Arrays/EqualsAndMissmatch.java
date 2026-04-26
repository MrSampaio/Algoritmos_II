package Arrays;

import java.util.Arrays;

public class EqualsAndMissmatch {
    public static void main(String[] args) {
        char[] vetorA = {'J', 'A', 'V', 'A'};
        char[] vetorB = {'J', 'A', 'V', 'A'};
        char[] vetorC = {'J', 'A', 'V', 'E'};

        if(Arrays.equals(vetorA, vetorB)){
            System.out.println("Os vetores A e B sao iguais!");
        } else{
            System.out.println("Os vetores A e B sao diferentes!");
        }

        if(Arrays.equals(vetorA, vetorC)){
            System.out.println("Os vetores A e C sao iguais!");
        } else{
            System.out.println("Os vetores A e C sao diferentes!");

            int indiceDiferente = Arrays.mismatch(vetorA, vetorC);
            System.out.println("O vetores A e C comecam a ficar diferentes no indice " + indiceDiferente);
        }


    }
}
