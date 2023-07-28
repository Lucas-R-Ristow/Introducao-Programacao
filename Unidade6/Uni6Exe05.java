package Unidade6;

//Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

//Gosta de música sertaneja?
//Gosta de futebol?
//Gosta de seriados?
//Gosta de redes sociais?
//Gosta da Oktoberfest?

//A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

//Se ambos deram a mesma resposta soma-se 3 pontos ao índice;
//Se um respondeu IND e o outro SIM ou NÃO soma-se 1;
//Se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.

//Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade. Por fim, escreva a afinidade considerando os seguintes intervalos:

//Afinidade     Mensagem
//15	        “Casem!
//10 a 14	    “Vocês têm muita coisa em comum!”
//5 a 9	        “Talvez não dê certo :(”
//0 a 4	        “Vale um encontro.”
//-1 a -9	    “Melhor não perder tempo”
//-10	        “Vocês se odeiam!”

import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] pessoa1 = new String[5];
        String[] pessoa2 = new String[5];
        int afinidade = 0; 

        System.out.println("A pessoa 1 respode, as respostas devem ser: 'SIM', 'NÃO' ou 'IND'(indiferente).");
        for(int i =0; i < 5; i++){
            if(i==0){
                System.out.println("Gosta de música sertaneja?");
                pessoa1[i] = teclado.nextLine().toUpperCase();
            } else if(i==1){
                System.out.println("Gosta de futebol?");
                pessoa1[i] = teclado.nextLine().toUpperCase();
            } else  if(i==2){
                System.out.println("Gosta de seriados?");
                pessoa1[i] = teclado.nextLine().toUpperCase();
            } else  if(i==3){
                System.out.println("Gosta de redes sociais?");
                pessoa1[i] = teclado.nextLine().toUpperCase();
            } else  if(i==4){
                System.out.println("Gosta da Oktoberfest?");
                pessoa1[i] = teclado.nextLine().toUpperCase();
            }
        }

        System.out.println("A pessoa 2 respode, as respostas devem ser: 'SIM', 'NÃO' ou 'IND'(indiferente).");
        for(int i =0; i < 5; i++){
            if(i==0){
                System.out.println("Gosta de música sertaneja?");
                pessoa2[i] = teclado.nextLine().toUpperCase();
            } else if(i==1){
                System.out.println("Gosta de futebol?");
                pessoa2[i] = teclado.nextLine().toUpperCase();
            } else  if(i==2){
                System.out.println("Gosta de seriados?");
                pessoa2[i] = teclado.nextLine().toUpperCase();
            } else  if(i==3){
                System.out.println("Gosta de redes sociais?");
                pessoa2[i] = teclado.nextLine().toUpperCase();
            } else  if(i==4){
                System.out.println("Gosta da Oktoberfest?");
                pessoa2[i] = teclado.nextLine().toUpperCase();
            }
        }

        for(int i =0; i < 5; i++){
            if(pessoa1[i].equals(pessoa2[i])){
                afinidade ++;
                afinidade ++;
                afinidade ++;
            }else if(pessoa1[i].equals("SIM")&&pessoa2[i].equals("NÃO") || pessoa1[i].equals("NÃO")&&pessoa2[i].equals("SIM")){
                afinidade --;
                afinidade --;
            }else
            afinidade ++; 
        }

        if(afinidade>=15){
            System.out.println("CASEM!");
        }else if(afinidade>=10&&afinidade<=14){
            System.out.println("Vocês têm muita coisa em comum!");
        }else if(afinidade>=5&&afinidade<=9){
            System.out.println("Talvez não dê certo :(");
        }else if(afinidade>=0&&afinidade<=4){
            System.out.println("Vale um encontro.");
        }else if(afinidade>=-9&&afinidade<=-1){
            System.out.println("Melhor não perder tempo");
        }else if(afinidade<=(-10)){
            System.out.println("Vocês se odeiam!");
        }

        teclado.close();
    }

}