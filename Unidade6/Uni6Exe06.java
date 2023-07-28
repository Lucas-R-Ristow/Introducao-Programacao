package Unidade6;

//Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        int N = teclado.nextInt();
        double[] vetor = new double[N];
        double valor = 0;
        int existe = 0;

        for(int i=0; i <N; i ++){
            System.out.print("infrome os valores presentes no vetor: ");
            vetor[i] = teclado.nextDouble();
        }

        System.out.print("Informe o valor real: ");
        valor = teclado.nextDouble();

        for(int i=0; i <N; i ++){
            if(vetor[i]==valor){
                existe ++;
            }
        }

        if(existe==0){
            System.out.println("O valor não está presente no vetor.");
        }else if(existe>0){
            System.out.println("O valor está presente no vetor.");
        }
        
        teclado.close();
    }
}