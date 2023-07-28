package Unidade5;

//Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int ninteiro = teclado.nextInt();
        double maior = 0;
        double menor = 0;
        for (int i =1 ; i <=ninteiro; i ++) {
        double nreal = teclado.nextDouble();
        if(i==1){
        maior = ninteiro;
        menor = ninteiro;
        }else if(nreal>maior){
            maior = nreal;
        }if(nreal<menor){
            menor = nreal;
        }
        } 
        System.out.println(maior + " e " + menor);
        teclado.close();
    }    
}
