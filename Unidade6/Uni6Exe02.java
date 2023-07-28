package Unidade6;

// Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média.

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] vetor = new double[12];
        lerValores(vetor);
        double media = calcularMedia(vetor);
        imprimirValoresMaioresQueMedia(vetor, media);
    }

    public static void lerValores(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os 12 valores:");
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = teclado.nextDouble();
        teclado.close();
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor)
            soma += valor;
        return soma / vetor.length;
    }

    public static void imprimirValoresMaioresQueMedia(double[] vetor, double media) {
        System.out.println("Valores maiores que a média:");
        for (double valor : vetor) {
            if (valor > media)
                System.out.println(valor);
        }
    }
}