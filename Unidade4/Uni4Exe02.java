package Unidade4;

//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.

import java.util.Scanner;
	
public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro maior do que 0: ");
        int valor = teclado.nextInt();
       
        while(valor<=0) {
            System.out.println("O valor deve ser maior que 0.");
            System.out.println("Entre com um valor inteiro MAIOR do que 0: ");
            valor = teclado.nextInt();
        }

        if (valor % 2 == 0)
            System.out.println("Número é par");
        else
            System.out.println("Número é ímpar");

        teclado.close();
    }
}