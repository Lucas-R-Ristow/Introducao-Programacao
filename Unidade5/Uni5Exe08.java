package Unidade5;

//Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

//Escreva o menor valor negativo;
//Escreva a média dos números positivos.

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            
        int ndvezes = teclado.nextInt();
        double maior = 0;
        double menor = 0;
        for (int i =1 ; i <=ndvezes; i ++) {
        int nint = teclado.nextInt();
        if(i==1){
        maior = nint;
        menor = nint;
        }else if(nint>maior){
            maior = nint;
        }if(nint<menor){
            menor = nint;
        }
    } 
        System.out.println(maior + " e " + menor);
        teclado.close();
    }    
}
    