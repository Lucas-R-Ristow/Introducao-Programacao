package Unidade6;

//Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.

import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        double[] vetor = new double[10];
        lerValores(vetor);
        ImprimirValores(vetor);
    }

    public static void lerValores(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os 10 valores:");
        for (int i = vetor.length-1; i >= 0; i--)
            vetor[i] = teclado.nextDouble();
        teclado.close();
    }

    public static void ImprimirValores(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("VALORES:");
        System.out.println();
        for (double valor : vetor)
        System.out.println(valor);
        teclado.close();
    }
}