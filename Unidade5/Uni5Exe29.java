package Unidade5;

//Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor solicitado. 
//Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.

import java.util.Scanner;

public class Uni5Exe29 {

public static void main(String[] args) {         
    Scanner teclado = new Scanner(System.in);
    int notas20 =0, notas10 =0, notas5 = 0, notas2 =0, notas1 =0;
    System.out.println("Informe o valor: ");
    double valor = teclado.nextDouble();
 

  notas20 = (int) valor/20; 
  notas10 = (int) (valor%20)/10;
  notas5 = (int) ((valor%20)%10)/5;
  notas2 = (int) (((valor%20)%10)%5)/2;  
  notas1 = (int) ((((valor%20)%10)%5)/2)/1;

  System.out.println("NOTAS: " );
  System.out.println(notas20 +" nota(s) de R$ 20.00");
  System.out.println(notas10 +" nota(s) de R$ 10.00");
  System.out.println(notas5 +" nota(s) de R$ 5.00");
  System.out.println(notas2 +" nota(s) de R$ 2.00");
  System.out.println(notas1 +" nota(s) de R$ 1.00");


    teclado.close();
  }
}
