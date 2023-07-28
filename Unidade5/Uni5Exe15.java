package Unidade5;

//Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        String aluno = teclado.next();

        while(!aluno.equals("fim")){
            double N1 = teclado.nextDouble();
            double N2 = teclado.nextDouble();
            System.out.println("Média: "+((N1+N2)/2));
            System.out.println("Informe o nome do aluno, (ou 'fim' para sair ): ");
            aluno = teclado.next();
        }

        teclado.close();

    }

}