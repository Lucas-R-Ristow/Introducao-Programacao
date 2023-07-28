package Unidade5;

//Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.

import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int anoatual = 1995;
        double salário = 2000, aumento = 1.5;

        while(anoatual<2023){
        anoatual ++;
        salário = salário + (salário*aumento/100);
        aumento = aumento*2;

        }

        System.out.println(salário);

        teclado.close();

    }

}
