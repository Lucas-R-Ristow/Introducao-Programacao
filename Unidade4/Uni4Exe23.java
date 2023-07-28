package Unidade4;

//Escreva um algoritmo que leia um número inteiro positivo representando um determinado mês do ano e escreva o mês por extenso. 
//Para valores maiores do que 12 informe que o valor não é válido.

import java.util.Scanner;

public class Uni4Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número do mês: ");
        int mes = teclado.nextInt();

        if(mes==1)
        System.out.println("Janeiro.");
        if(mes==2)
        System.out.println("Fevereiro.");
        if(mes==3)
        System.out.println("Março.");
        if(mes==4)
        System.out.println("Abril.");
        if(mes==5)
        System.out.println("Maio.");
        if(mes==6)
        System.out.println("Junho.");
        if(mes==7)
        System.out.println("Julho.");
        if(mes==8)
        System.out.println("Agosto.");
        if(mes==9)
        System.out.println("Setembro.");
        if(mes==10)
        System.out.println("Outubro.");
        if(mes==11)
        System.out.println("Novembro.");
        if(mes==12)
        System.out.println("Dezembro.");

        if(mes<=0||mes>=13) 
         System.out.println("O valor não é válido.");

        teclado.close();
    }
}