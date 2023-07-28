package Unidade4;

//Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de dependentes do contribuinte. A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 pagam 15% de imposto.

import java.util.Scanner;
	
public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a renda anual: ");
        double renda = teclado.nextDouble();
        System.out.print("Informe o número de dependentes: ");
        double dependents = teclado.nextDouble();
        Double rendalq = renda-renda*dependents*2/100;

        if (rendalq<2000)
        System.out.println("O Imposto de renda está isento.");
    
else
        if (rendalq>2000&&rendalq<5000.01){
            System.out.println("O valor a pagar pelo Imposto de Renda é de: R$ "+rendalq*5/100);}
            
        else
             if (renda>5000&&rendalq<10000.01){
                System.out.println("O valor a pagar pelo Imposto de Renda é de: R$ "+rendalq*1/10);}

                else
                 if(rendalq>10000)
                 System.out.println("O valor a pagar pelo Imposto de Renda é de: R$ "+rendalq*15/100);

        teclado.close();
    }
}