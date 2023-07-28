package Unidade5;

//Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

//> Escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
//> Determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5exe14{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        int mercadorias10 = 0;
        int mercadorias20 = 0;
        int mercadorias21 = 0;
        double valortotal = 0;
        double lucrototal = 0;

        for (int i =1 ; i <=20; i ++) {

            System.out.println("Informe o nome da mercadoria: ");
            teclado.next();
            System.out.println("Informe o preço de compra da mercadoria: ");
            double PC = teclado.nextDouble();
            System.out.println("Informe o preço de venda da mercadoria: ");
            double PV = teclado.nextDouble();

            valortotal += PC; 
            lucrototal += PV-PC;


            if(((PV - PC) / PV * 100 )<10){
            mercadorias10 +=1;

            }if( ((PV - PC) / PV * 100 ) <=20 && ((PV - PC) / PV * 100 ) >= 10 ){
            mercadorias20 +=1;

            }if(((PV - PC) / PV * 100 ) > 20 ){
                mercadorias21 +=1;   
            }; 

        } 

        System.out.println("O número de mercadorias com menos de 10% de lucro foi de: "+mercadorias10);
        System.out.println("O número de mercadorias com 10% a 20% foi de: "+mercadorias20);
        System.out.println("O número de mercadorias com mais de 20% de lucro foi de: "+mercadorias21);
        System.out.println("O valor total da compra foi de: "+ df2.format(valortotal));
        System.out.println("O lucro total foi de: "+ df2.format(lucrototal));

        teclado.close();
    }    
}