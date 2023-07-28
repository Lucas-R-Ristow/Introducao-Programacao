package Unidade3;
//Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
//X centena(s)  Y dezena(s) K unidade(s)  
//Exemplo, se for submetido o número 384, o programa deverá exibir:
//3 centena(s)  8 dezena(s) 4 unidade(s)  

import java.util.Scanner;

public class Uni3Exe15 {

    public static void main(String[] args) {       
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe um número entre 0 e 999: ");
    int n = teclado.nextInt();
    while (n < 0 || n > 999) {
        System.out.println("O valor deve estar entre 0 e 999.");
        System.out.println("Informe um número entre 0 e 999: ");
        n = teclado.nextInt();
    }
  
    int cent = n / 100;
    int dez = (n%100)/10;
    int uni = ((n%100)%10)/1;

    System.out.println(cent + " centenas, " + dez + " dezenas e " + uni + " unidades.");
    teclado.close();
  }
}