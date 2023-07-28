package Unidade4;

//Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.

import java.util.Scanner;
    
public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o valor da parcela: ");
        double valor = teclado.nextDouble();
        System.out.print("Informe o dia do pagamento: ");
        int diap = teclado.nextInt();

        if(diap>0&&diap<32)
        if (diap>0&&diap<=10)
            System.out.println("O valor a ser pago pela parcela este mês é de: R$ "+valor*90/100);
        else
            if(diap>10)
            System.out.println("O valor a ser pago pela parcela este mês é de: R$ "+(valor+(valor*2/100*(diap-10))));

        teclado.close();
    }
}