package Unidade4;

//Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. Considerando que o sistema apresenta 3 cursos disponíveis (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título que o aluno vai receber caso opte por aquele curso. As titulações são respectivamente: "Bacharel em Ciência da Computação", "Licenciado em Computação" e "Bacharel em Sistemas de Informação".

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu Curso: ");
        System.out.println("Digite '1' para Ciências da Computação, '2' para Licenciatura da Computação e '3' para Sistemas da Informação.");
        int Curso = teclado.nextInt();
        System.out.print("Informe seu nome: ");
        String nome = teclado.next();

        if(Curso==1)
        System.out.println(nome+" sua titulação ao final do curso será de Bacharel em Ciência da Computação.");

        if(Curso==2)
        System.out.println(nome+" sua titulação ao final do curso será Licenciado em Computação.");

        if(Curso==3)
        System.out.println(nome+" sua titulação ao final do curso será de Bacharel em Sistemas de Informação.");
         else 
         System.out.println("Entrada Inválida.");

        teclado.close();
    }
}