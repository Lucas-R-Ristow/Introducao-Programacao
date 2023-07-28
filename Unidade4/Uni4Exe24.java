package Unidade4;

//Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

//se opção = 1, escreva os 3 valores em ordem crescente
//se opção = 2, escreva os 3 valores em ordem decrescente
//se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe primeiro valor: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Informe segundo valor: ");
        double valor2 = teclado.nextDouble();
        System.out.print("Informe terceiro valor: ");
        double valor3 = teclado.nextDouble();

        double maior = 0;
        double menor = 0;
        double meio = 0;
      
        if (valor1>valor2&&valor1>valor3)
            maior = valor1;
            else if (valor2>valor1&&valor2>valor3)
            maior = valor2;
            else if(valor3>valor1&&valor3>valor2)
            maior = valor3;
        
            if (valor1<valor2&&valor1<valor3)
            menor = valor1;
            else if (valor2<valor1&&valor2<valor3)
            menor = valor2;
            else if(valor3<valor1&&valor3<valor2)
            menor = valor3;

            if (valor1!=maior&&valor1!=menor)
            meio = valor1;
            else if (valor2!=maior&&valor2!=menor)
            meio = valor2;
            else if(valor3!=maior&&valor3!=menor)
            meio = valor3;
        
            System.out.println("Opção 1: escreve os valores em ordem crescente ");
            System.out.println("Opção 2: escreve os valores em ordem decrescente ");
            System.out.println("Opção 3: escreve os valores de forma que o maior valor fique no meio ");
            int opçao = teclado.nextInt();
        
            if (opçao==1)
            System.out.println(menor+", "+meio+", "+maior+".");
        else
            if (opçao==2)
            System.out.println(maior+", "+meio+", "+menor+".");
            else
                if (opçao==3)
            System.out.println(menor+", "+maior+", "+meio+".");
                else
                System.out.println("Opção inválida.");

        teclado.close();
    }
}