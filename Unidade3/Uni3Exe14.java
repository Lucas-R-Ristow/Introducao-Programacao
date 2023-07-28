package Unidade3;
//Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe14 {

    public static void main(String[] args) {         
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe a distância percorrida (em Km): ");
    double d = teclado.nextDouble();
    System.out.print("Informe tempo do decorrido (em horas): ");
    double t = teclado.nextDouble();
    
    double v = d/t;
    double c = d/12;
    
    System.out.println("Velocidade média do percurso: " + df_2.format(v) + "km/h");
    System.out.println("Foram gastos: " + df_2.format(c) + " litros de combustível");
 
    teclado.close();
  }
}