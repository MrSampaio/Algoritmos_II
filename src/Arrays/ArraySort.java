package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExibirArray {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int[] listaNumeros = {5, 12, 2, 6, 40};

        System.out.println("Esse eh o array nao ordenado: " + Arrays.toString(listaNumeros));

        Arrays.sort(listaNumeros);
        System.out.println("Esse eh o array ordenado: " + Arrays.toString(listaNumeros));

        System.out.println("Informe um numero que deseja consultar no array: ");
        int numeroBuscado = scr.nextInt();

        int pesquisa = Arrays.binarySearch(listaNumeros, numeroBuscado);

        if(pesquisa >= 0){
            System.out.println("O numero " + numeroBuscado + " foi encontrado na posicao " + pesquisa + " do array!");
        } else{
            System.out.println("O numero " + numeroBuscado + " NAO foi encontrado no array! A posicao de insercao seria: " + pesquisa);
        }



    }
}
