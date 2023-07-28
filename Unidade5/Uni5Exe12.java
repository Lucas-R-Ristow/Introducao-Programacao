package Unidade5;

//Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
//	1
//	1	3
//	4	5	6
//	7	8	9	10 ...

import java.util.Scanner;

public class Uni5Exe12{
	public static void main(String[] args)
	{
    Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();

		int i, j, k = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(k + " ");

				k++;
			}

			System.out.println();
		}
	}

}
