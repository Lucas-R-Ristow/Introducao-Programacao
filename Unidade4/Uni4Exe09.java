package Unidade4;

//Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.

import java.util.Scanner;
	
public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o maior número: ");
        int x= teclado.nextInt();
        System.out.print("Informe o menor número: ");
        int y= teclado.nextInt();


        if (x%y==0) 

            System.out.println("Os números são multiplos entre sí.");
        else
            System.out.println("Os números não são multiplos entre sí.");
        

        teclado.close();
    }
}