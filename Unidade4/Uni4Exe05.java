package Unidade4;

//Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.

import java.util.Scanner;
	
public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("A cor é Azul?: ");
        String resposta = teclado.next();

        if (resposta.equals("Sim")||resposta.equals("sim"))
            System.out.println("Sim, a cor é Azul");
        else
            System.out.println("Não.");

        teclado.close();
    }
}