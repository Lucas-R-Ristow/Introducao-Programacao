package Unidade4;

//Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.

import java.util.Scanner;
    
public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    
        System.out.print("Informe a idade do homem mais velho: ");
        int homemv = teclado.nextInt();
        System.out.print("Informe a idade do homem mais novo: ");
        int homemn = teclado.nextInt();
        System.out.print("Informe a idade da mulher mais velha: ");
        int mulherv = teclado.nextInt();
        System.out.print("Informe a idade da mulher mais nova: ");
        int mulhern = teclado.nextInt();

         if (homemv>homemn&&mulherv>mulhern)
         System.out.println("A soma das idades entre o homem mais velho e a mulher mais nova é: "+(homemv+mulhern));
         if (homemv>homemn&&mulherv>mulhern)
         System.out.println("O produto das idades entre o homem mais velho e a mulher mais nova é: "+(homemn*mulherv));
          

        else
        System.out.println("As informaçãos inseridas estão incoerentes com aquilo que foi pedido.");

     teclado.close();
 }
}
