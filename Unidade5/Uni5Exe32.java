package Unidade5;

//Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.

//Exemplo: p = 3 n = 31

//  D	S	T	Q	Q	S	S
//          1	2	3	4	5
//  6	7	8	9	10	11	12
//  13	14	15	16	17	18	19
//  20	21	22	23	24	25	26
//  27	28	29	30	31

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o dia da semana em que cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado):");
        int primeiroDia = teclado.nextInt();

        System.out.println("Digite o número de dias que o mês possui:");
        int diasNoMes = teclado.nextInt();

        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};

        for (String dia : diasDaSemana) {

            System.out.print(dia + " ");
        }

        System.out.println();

        for (int i = 1; i < primeiroDia; i++) {

            System.out.print("    ");
        }

        for (int i = 1; i <= diasNoMes; i++) {

            System.out.printf("%3d ", i);

            if ((i + primeiroDia - 1) % 7 == 0) {

                System.out.println();
            }
        }

        teclado.close();
    }
}