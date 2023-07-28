package Unidade4;

//Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
//Escolha uma opção:
//1 - Soma de dois números.
//2 - Diferença entre dois números.
//3 - Produto entre dois números.
//4 - Divisão entre dois números (o denominador não pode ser zero).

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe primeiro valor: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Informe segundo valor: ");
        double valor2 = teclado.nextDouble();

            System.out.println("Opção 1: Soma dos dois números. ");
            System.out.println("Opção 2: Diferença entre os dois números. ");
            System.out.println("Opção 3: Produto entre os doi números. ");
            System.out.println("Opção 4: Divisão entre dois números. ");

            int opçao = teclado.nextInt();
        
            if (opçao==1)
            System.out.println(valor1+valor2);
        else
            if (opçao==2)
            System.out.println(valor1-valor2);
            else
                if (opçao==3)
            System.out.println(valor1*valor2);
                else 
                    if(opçao==4&&valor2!=0)
                System.out.println(valor1/valor2);
                    else 

                System.out.println("Opção inválida.");

        teclado.close();
    }
}