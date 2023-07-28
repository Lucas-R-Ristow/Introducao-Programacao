package Unidade5;

//Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i =1 ; i <=20; i ++) {
            int numero = teclado.nextInt();
            if(numero%2==0)
            System.out.println("PAR");
            else 
            System.out.println("ÍMPAR");

        } 
        teclado.close();
    }    
}
