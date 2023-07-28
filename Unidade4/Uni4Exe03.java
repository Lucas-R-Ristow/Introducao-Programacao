package Unidade4;

//Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

import java.util.Scanner;
	
public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int valor1 = teclado.nextInt();
        System.out.print("Insira o segundo número: ");
        int valor2 = teclado.nextInt();

        if (valor1>valor2)
            System.out.println("O maior número é: "+valor1);
        else
            System.out.println("O maior número é: "+valor2);

        teclado.close();
    }
}
