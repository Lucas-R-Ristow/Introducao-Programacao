package Prova2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LucasRomaoRistow_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df0 = new DecimalFormat("0");

        double Chapa_1 = 0;
        double Chapa_2 = 0;
        double nulos = 0;
        int TotaldVotos = 0;
        int voto = 5;
        double vencedor = 0;

        while (voto!=0) {
            System.out.println("Informe pra quem foi o voto: ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                Chapa_1++;
                TotaldVotos++;
                    break;
                case 2: 
                Chapa_2++;
                TotaldVotos++;
                    break;

                case 3: 
                nulos++;
                TotaldVotos++;
                    break;

                case 0:
                    break;
            
                default:
                System.out.println("Opção incorreta");
                    break;
            }
                        
            
            if (Chapa_1 > vencedor) {
                vencedor = Chapa_1;
            } else if (Chapa_2 > vencedor) {
                vencedor = Chapa_2;
            } else if (nulos > vencedor) {
                vencedor = nulos;
            }

        }

        System.out.println("Total de votos da Chapa 1 : " + df0.format(Chapa_1));
        System.out.println("Total de votos Chapa 2 : " + df0.format(Chapa_2));
        System.out.println("Total de votos Nulos : " + df0.format(nulos));
        System.out.println();
        System.out.println("Porcentagem de votos Chapa 1 : " + df0.format(Chapa_1/TotaldVotos*100) + " %");
        System.out.println("Porcentagem de votos Chapa 2 : " + df0.format(Chapa_2/TotaldVotos*100) + " %");
        System.out.println("Porcentagem de votos Nulos : " + df0.format(nulos/TotaldVotos * 100) + " %");
        System.out.println();

        if(Chapa_1==Chapa_2){
            System.out.println("EMPATE NA VOTAÇÃO.");
        }else if (vencedor == Chapa_1) {
            System.out.println("Chapa vencedora: Chapa 1.");
        }else if (vencedor == Chapa_2) {
            System.out.println("Chapa vencedora: Chapa 2.");
        }

        teclado.close();
    }

}