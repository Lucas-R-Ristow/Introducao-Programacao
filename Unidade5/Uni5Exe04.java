package Unidade5;

//Descreva um algoritmo para calcular o valor de S dado por:
// 3/2 + 5/6 + 7/12 + 9/20 + 11/30 ...
//Considere os 20 primeiros termos da série.

import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n =3;
        int d = 2;
        double sm =0;
        int aux = 4;
        for (int i =1 ; i <=20; i ++) {
        sm += (double)n/d;
        n +=2;
        d+=aux;
        aux +=2;

        } 
        System.out.println(sm);

        teclado.close();
    }    
}
