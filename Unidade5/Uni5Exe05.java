package Unidade5;

// Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
// 8,10,16,18,32,34...
// O valor n deve ser lido e deve ser maior do que 2.

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nl = 8;

        System.out.println("Infomre o n");
        int n = teclado.nextInt();

        while(n<2){
            System.out.println("o valor de n não pode ser inferior a 2");
            n = teclado.nextInt();
        }

        for (int i =1 ; i <=n; i ++) {
        
            if(nl%8==0){
        System.out.println( nl );
        nl +=2;
        
        }else{
        System.out.println(nl);
        nl = (nl-2)*2;
        }

        } 

        teclado.close();
    }    
}