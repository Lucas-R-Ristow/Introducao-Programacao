package Unidade4;

///Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.

import java.util.Scanner;
	
public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a letra: ");
        String letra = teclado.next();
       
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")
        ||letra.equals("u")||letra.equals("A")||letra.equals("E")||letra.equals("I")
        ||letra.equals("O")||letra.equals("U")) 

            System.out.println("A letra é uma Vogal.");
        else
            System.out.println("A letra NÃO é uma Vogal.");
        

        teclado.close();
    }
}