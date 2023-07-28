package Unidade4;

//Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.

import java.util.Scanner;
    
public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    
        System.out.print("Informe o dia: ");
        int dia = teclado.nextInt();
        System.out.print("Informe o mês: ");
        int mes = teclado.nextInt();
        System.out.print("Informe o ano: ");
        int ano = teclado.nextInt();

        if (dia>0&&dia<32&&mes>0&&mes<13&&ano>0){ 
            if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                System.out.print("Resposta Válida");
            }else{ 
                 if(mes!=2&&dia<31){
                 System.out.print("Resposta Válida");
                 }else{ 
                     if(mes==2&&dia<29){
                        System.out.print("Resposta Válida");
                     }else{
                         if(dia==29&&ano%4==0&&!(ano%100==0&&ano%400!=0)){
                            System.out.print("Resposta Válida");

                         }else{
                            System.out.print("Resposta Inválida");
                         }        
        
                     }            
                 }
            }
        }else{
            System.out.print("Resposta Inválida");
        }

        teclado.close();
    }
}