package Unidade5;

//Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

//1, 2, 3, 4 = voto para o respectivo candidato;
//5 = voto nulo;
//6 = voto em branco.

//Elabore um programa que calcule e escreva:
//> total de votos para cada candidato;
//> total de votos nulos;
//> total de votos em branco;
//> percentual dos votos em branco e nulos sobre o total.

//> Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. Para interromper a operação, o usuário poderá fornecer o número 0.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int TotaldVotos = 0;
        double votosnulos = 0;
        double votosembranco = 0;
        int voto = 7;

        while (voto!=0) {
            System.out.println("Informe pra quem foi o voto: ");
            voto = teclado.nextInt();
            if (voto == 1) {
                candidato1++;
                TotaldVotos++;
            } else if (voto == 2) {
                candidato2++;
                TotaldVotos++;
            } else if (voto == 3) {
                candidato3++;
                TotaldVotos++;
            } else if (voto == 4) {
                candidato4++;
                TotaldVotos++;
            } else if (voto == 5) {
                votosnulos++;
                TotaldVotos++;
            } else if (voto == 6) {
                votosembranco++;
                TotaldVotos++;
            } else if(voto!=1||voto!=2||voto!=3||voto!=4||voto!=5||voto!=6) {
                System.out.println("Opção incorretada");
                System.out.println();
            } 

        }

        System.out.println("Total de votos do cadidato 1: " + candidato1);
        System.out.println("Total de votos do cadidato 2: " + candidato2);
        System.out.println("Total de votos do cadidato 3: " + candidato3);
        System.out.println("Total de votos do cadidato 4: " + candidato4);
        System.out.println();

        System.out.println("Total de votos nulos:" + votosnulos);
        System.out.println();
        System.out.println("Total de votos de votos em branco:" + votosembranco);
        System.out.println();

        System.out.println("Porcentagem de votos nulos: " + df_2.format(votosnulos/TotaldVotos*100) + " %");
        System.out.println("Porcentagem de votos em branco: " + df_2.format(votosembranco/TotaldVotos*100) + " %");

        System.out.println(TotaldVotos);

        teclado.close();
    }

}