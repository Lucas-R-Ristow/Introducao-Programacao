package Prova2;

import java.util.Scanner;
import java.util.Arrays;

public class LucasRomaoRistow_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        int N = teclado.nextInt();
        int[] vetor1 = new int[N];
        int[] vetor2 = new int[N];
        int[] vetor3 = new int[N];

        lerValores(vetor1, vetor2, N);
        calcularVetor3(vetor3, vetor1, vetor2, N);
        ordernarVetor3(vetor3);
        ImprimirValores(vetor2, vetor1, vetor3, N);

        teclado.close();

    }

    public static void lerValores(int[] vetor1, int[] vetor2, int N) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os valores do vetor1:");
        for (int i = 0; i <N; i++){
            vetor1[i] = teclado.nextInt();
        } System.out.println("Digite os valores do vetor2:");
        for (int i = 0; i <N; i++){
            vetor2[i] = teclado.nextInt();
        }
        teclado.close();
    }

    public static void calcularVetor3(int[] vetor3, int[] vetor1, int[] vetor2, int N) {
        for (int i = 0; i <N; i++)
        vetor3[i] = vetor1[i]+vetor2[i];
    }

        private static void ordernarVetor3(int[] vetor3) {
            Arrays.sort(vetor3);
    }

    public static void ImprimirValores(int[] vetor2, int[] vetor1, int[] vetor3, int N) {
        System.out.print("Vetor1[");
        for (int i = 0; i <N; i++){
            System.out.print(vetor1[i]+",");
        } System.out.print("]");
        System.out.println();

        System.out.print("Vetor2[");
        for (int i = 0; i <N; i++){
            System.out.print(vetor2[i]+",");
        } System.out.print("]");
         System.out.println();

        System.out.print("Vetor3[");
        for (int i = 0; i <N; i++){
            System.out.print(vetor3[i]+",");
        } System.out.print("]");
         System.out.println();

    }

}
