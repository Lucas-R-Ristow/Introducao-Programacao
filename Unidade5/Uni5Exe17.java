package Unidade5;

//Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

// O número de inscrição e a altura do atleta mais alto;
// O número de inscrição e a altura do atleta mais baixo;
// A altura média do grupo de atletas.

// A leitura deve ser finalizada ao digitar 0 para o número de inscrição.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double inscrição = 0.1;
        double altura = 0;
        double alturatotal = 0; 
        int atletas =0;
        double maisalto =0; 
        double maisaltoN = 0;
        double maisbaixo = 5;
        double maisbaixoN = 0;

        while(inscrição!=0){
            System.out.println("Informe o número de inscrição do aluno: ");
            inscrição = teclado.nextInt(); 
            if(inscrição!=0){
                System.out.println("Infrome a altura do atleta: ");
                altura = teclado.nextDouble();
                atletas ++;
                alturatotal +=altura; 
            }if(altura>maisalto){
                maisalto = altura;
                maisaltoN = inscrição;
            }if(altura<maisbaixo){
                maisbaixo = altura;
                maisbaixoN = inscrição;
            }
            System.out.println("O atleta mais alto é o de número: "+maisaltoN + " com " + maisalto+" metros de altura.");
            System.out.println("O atleta mais baixo é o de número: "+maisbaixoN + " com " + maisbaixo+" metros de altura.");
            System.out.println("A altura média dos atletas é de: "+ df_2.format(alturatotal/atletas) + "metros." );
        }

        teclado.close();

    }

}