package Unidade5;

//Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double valor = 0.1;
        double total_recebido_pela_loja = 0;
        double valor_da_compra = 0;

        while(valor!=0){
            System.out.println("Informe o valor da compra: ");
            valor = teclado.nextDouble(); 
            if(valor!=0){
                
                if(valor>500||valor==500){
                    valor_da_compra = valor*0.8;
                    total_recebido_pela_loja += valor; 
                    System.out.println("O valor da compra foi de: R$ " + df_2.format(valor_da_compra));
    
                }if(valor<500){
                    valor_da_compra = valor*0.85;
                    total_recebido_pela_loja += valor; 
                    System.out.println("O valor da compra foi de: R$ " + df_2.format(valor_da_compra));
                }
    
            }
        }

        System.out.println("O total recebido pela loja foi de : R$ "+ df_2.format(total_recebido_pela_loja));

        teclado.close();
    }
}
