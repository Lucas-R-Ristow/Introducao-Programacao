package Unidade6;

//Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        lerValores(vetor1, vetor2);
        calcularVetor3(vetor3, vetor1, vetor2);
        ImprimirValores(vetor2, vetor1, vetor3);
    }



    public static void lerValores(int[] vetor1, int[] vetor2) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os 10 valores do vetor1:");
        for (int i = 0; i <10; i++){
            vetor1[i] = teclado.nextInt();
        } System.out.println("Digite os 10 valores do vetor2:");
        for (int i = 0; i <10; i++){
            vetor2[i] = teclado.nextInt();
        }
        teclado.close();
    }

    private static void calcularVetor3(int[] vetor3, int[] vetor1, int[] vetor2) {
        for (int i = 0; i <10; i++)
        vetor3[i] = vetor1[i]+vetor2[i];
    }

    private static void ImprimirValores(int[] vetor2, int[] vetor1, int[] vetor3) {
        System.out.print("Vetor1: ");
        for (int i = 0; i <10; i++){
            System.out.print(vetor1[i]+"; ");
        } System.out.println();

        System.out.print("Vetor2: ");
        for (int i = 0; i <10; i++){
            System.out.print(vetor2[i]+"; ");
        } System.out.println();

        System.out.print("Vetor3: ");
        for (int i = 0; i <10; i++){
            System.out.print(vetor3[i]+"; ");
        } System.out.println();

    }

}