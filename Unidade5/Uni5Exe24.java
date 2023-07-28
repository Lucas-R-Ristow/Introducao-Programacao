package Unidade5;

//Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Inforne o limite de pesca diário (em Kg): ");
        double limite = teclado.nextDouble();
        double peso_total = 0;

        while(peso_total<limite){
            System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            String entrada = teclado.next().toUpperCase();

            while(entrada.equals("SIM") && entrada!="NÃO" && peso_total<limite){
                System.out.println("informe o peso do peixe em Kg: ");
                double peso_peixe = teclado.nextDouble();
                peso_total += peso_peixe;
                System.out.println("O peso total pescado até o momento foi de: " + df_2.format(peso_total) + "Kg.");
                System.out.println();
                System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                entrada = teclado.next().toUpperCase();
    
            }
        }
        teclado.close();
    }
}