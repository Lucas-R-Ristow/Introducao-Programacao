package Unidade4;

//Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
//Dica: criar variáveis intermediárias para contar a quantidade de "boas".

import java.util.Scanner;
    
public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    
        System.out.print("Informe a priemira carta: ");
        int carta1 = teclado.nextInt();
        System.out.print("Informe a segunda carta: ");
        int carta2 = teclado.nextInt();
        System.out.print("Informe a terceira carta: ");
        int carta3 = teclado.nextInt();
        int Qcartasboas = 0;

        if (carta1==1||carta1==2||carta1==3)
            Qcartasboas+=1;

        if (carta2==1||carta2==2||carta2==3)
            Qcartasboas=Qcartasboas+1;

        if (carta3==1||carta3==2||carta3==3)
            Qcartasboas++;

        if (Qcartasboas==1)
        System.out.println("TRUCO");
        if (Qcartasboas==2)
        System.out.println("SEIS");
        if (Qcartasboas==3)
        System.out.println("NOVE");

        else
        teclado.close();
    }
}