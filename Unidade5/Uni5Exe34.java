package Unidade5;

//Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

//R$ 7,50 por diária, caso o número de diárias seja menor que 15;
//R$ 6,50 por diária, caso o número de diárias seja igual a 15;
//R$ 5,00 por diária, caso o número de diárias seja maior que 15.

//Descreva um algoritmo que apresente as seguintes opções ao recepcionista:
//(1) encerrar a conta de um hóspede;
//(2) verificar número de contas encerradas;
//(3) sair.

//Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). Caso a opção escolhida seja a terceira finalize a execução do algoritmo.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe34 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int hopedesTotais = 0; 
        double total_a_pagar =0;
        int dias =0;
        int entrada = 1;

        while(entrada!=3){
            System.out.println("Selecione uma entrada:");
            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.out.println("(3) sair");
            System.out.print("Entrada: ");
            entrada = teclado.nextInt();
            switch(entrada){
            case 1:
                System.out.println("Informe o nome do hóspede: ");
                String nome = teclado.next();
                hopedesTotais ++;
                System.out.print("informe quantos dias ele permaneceu no hotel: ");
                dias = teclado.nextInt();
                if(dias<15){
                    total_a_pagar = dias*7.5;
                    System.out.println("Hóspede: " + nome);
                    System.out.println("O total a ser pago é de: R$ " + df_2.format(total_a_pagar));
                    System.out.println();

                }if(dias==15){
                    total_a_pagar = dias*6.5;
                    System.out.println("Hóspede: " + nome);
                    System.out.println("O total a ser pago é de: R$ " + df_2.format(total_a_pagar));
                    System.out.println();

                }if(dias>15){
                    total_a_pagar = dias*5;
                    System.out.println("Hóspede: " + nome);
                    System.out.println("O total a ser pago é de: R$ " + df_2.format(total_a_pagar));
                    System.out.println();

                }

    
    
            case 2:
                System.out.println("O número de contas encerradas é de: " + hopedesTotais);
                System.out.println();
    
            case 3:
    
            break;
               default:
               System.out.println("ENTRADA INVÁLIDA");
            


            }

        }
        teclado.close();
    }
}