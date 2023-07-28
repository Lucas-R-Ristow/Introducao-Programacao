package Unidade5;

//Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do sexo (sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' e sexo = 'f' para feminino) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        
        System.out.println("Informe o sexo do indivíduo (use 'M' para masculino e 'F' para feminino): ");
        String Sexo = teclado.next().toUpperCase();
        int homens =0;
        int mulheres = 0;
        double alturaM = 0.0001;
        double alturaF = 0.0001;


        while(alturaF !=0 || alturaM !=0){
         if(Sexo.equals("M")){
            homens ++;
            System.out.println("informe a altura do homem: ");
            alturaM += teclado.nextDouble();
            if(mulheres>0){            
            System.out.println("A média de alutura das mulheres é de: " + df_2.format(alturaF/mulheres));}
            System.out.println("A média de alutura do grupo é de: " + df_2.format((alturaF+alturaM)/(homens+mulheres)));


            System.out.println("Informe o sexo do indivíduo (use 'M' para masculino e 'F' para feminino ou '0' para sair.): ");
            Sexo = teclado.next().toUpperCase();

        }if(Sexo.equals("F"))
            mulheres ++;
            System.out.println("informe a altura da mulher: ");
            alturaF += teclado.nextDouble();

            System.out.println("A média de alutura das mulheres é de: " + df_2.format(alturaF/mulheres));
            System.out.println("A média de alutura do grupo é de: " + df_2.format((alturaF+alturaM)/(homens+mulheres)));


            System.out.println("Informe o sexo do indivíduo (use 'M' para masculino e 'F' para feminino): ");
            Sexo = teclado.next().toUpperCase();
        }

        teclado.close();

    }

}
