package Unidade5;

//Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        double altuturat=0;

        for (int i =1 ; i <=20; i ++) {
        double altura = teclado.nextDouble();
        altuturat +=altura;

        } 

        System.out.println("A média das alturas é: "+df_2.format(altuturat/20));
        teclado.close();
    }    
}
