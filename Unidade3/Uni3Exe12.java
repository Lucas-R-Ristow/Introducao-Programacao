package Unidade3;
//Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe12 {

    public static void main(String[] args) {      
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.print("Informe o nome do funcionário: ");
    String nome = teclado.next();
    System.out.print("Informe a quantidade de horas trabalhadas: ");
    double hrs = teclado.nextDouble();
    System.out.print("Informe o número de dependentes: ");
    double dpn = teclado.nextDouble();

    double sb = (hrs*10)+(60*dpn);
    double sl = ((hrs*10)*0.915) + ((60*dpn)*0.95);
    
    System.out.println("Funcionário: " + (nome));
    System.out.println("Salário bruto: " + df_2.format(sb));
    System.out.println("Salário líquido: " + df_2.format(sl));
    teclado.close();
  }
}
