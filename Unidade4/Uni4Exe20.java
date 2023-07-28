package Unidade4;

//Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:

//media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7

//A atribuição dos conceitos obedece à tabela abaixo:

//media     	conceito
//>= 9.0	        A
//>= 7.5 e < 9.0	B
//>= 6.0 e < 7.5	C
//>= 4.0 e < 6.0	D
//< 4.0	            E

//O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.

import java.util.Scanner;
import java.text.DecimalFormat;

    
public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        
        System.out.print("Informe a nota da prova 1: ");
        double p1 = teclado.nextDouble();
        System.out.print("Informe a nota da prova 2: ");
        double p2 = teclado.nextDouble();
        System.out.print("Informe a nota da prova 3: ");
        double p3 = teclado.nextDouble();
        System.out.print("Informe a nota da média dos exercícios: ");
        double exerc = teclado.nextDouble();

        double media = (p1+p2*2+p3*3+exerc)/7;



        if(media>=9)
        System.out.println("APROVADO, parabéns sua média foi: "+df_1.format(media)+" (A)");

        if(media<9&&media>=7.5)
        System.out.println("APROVADO, parabéns sua média foi: "+df_1.format(media)+" (B)");

        if(media<7.5&&media>=6)
        System.out.println("APROVADO, parabéns sua média foi: "+df_1.format(media)+" (C)");

        if(media<6&&media>=4)
        System.out.println("REPROVADO, sua média foi: "+df_1.format(media)+" (D)");

        if(media<4)
        System.out.println("REPROVADO, sua média foi: "+df_1.format(media)+" (E)");


        teclado.close();
    }
}