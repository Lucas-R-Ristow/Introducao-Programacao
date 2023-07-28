package Unidade5;

//Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a massa do material radioativo");
        double material = teclado.nextDouble();
        int tempo = 0;

        while(material>=0.0005){
        material = (material/2) ;
        tempo +=1;

        }
        if(tempo == 1){
            System.out.println("A massa inicial era de: " + (material*2) +"Kg");
            System.out.println("A massa inicial era de: " + material +"Kg");
            System.out.println("O tempo nescessário foi de: " + (tempo*50) + "s.");
        }else{
            System.out.println("A massa inicial era de: " + (material*Math.pow(2, tempo)) +"Kg");
            System.out.println("A massa inicial era de: " + material +"Kg");
            System.out.println("O tempo nescessário foi de: " + (tempo*50) + "s.");
        }


        teclado.close();

    }

}