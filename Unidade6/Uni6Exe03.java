package Unidade6;

//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni6Exe03 {
    public static void main(String[] args) {
        double[] vetor = new double[12];
        lerValores(vetor);
        VETORimparPAR(vetor);
    }

    public static void lerValores(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os 12 valores:");
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = teclado.nextDouble();
        teclado.close();
    }

    public static double VETORimparPAR(double[] vetor) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        double soma = 0;
        for (double valor : vetor)
        if(valor%2==0){
            valor = valor*1.02;
            System.out.println(df2.format(valor));
        }else{
            valor = valor*1.05;
            System.out.println(df2.format(valor));
        }
        return soma / vetor.length;
    }

}