package Unidade5;

//Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
//Escreva os nomes dos alunos que tem 18 anos;
//Escreva a quantidade de alunos que tem idade acima de 20 anos.

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_dealunos = teclado.nextInt();
        int alunos_sub20 = 0;
        for (int i =1 ; i <=numero_dealunos; i ++) {
            String nome = teclado.next();
            int idade = teclado.nextInt();

            if(idade==18){
            System.out.println(nome);

            }else if (idade==20)
            alunos_sub20 +=1;   

        } 

        System.out.println(alunos_sub20);

        teclado.close();
    }    
}