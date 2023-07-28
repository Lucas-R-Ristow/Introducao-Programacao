package Unidade5;

//Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência. A leitura deve ser finalizada quando for informado canal 0.

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int canal = 1;
        double telepectadoresTotais = 0;
        double telepectadoresCanal4 = 0;
        double telepectadoresCanal5 = 0;
        double telepectadoresCanal9 = 0;
        double telepectadoresCanal12 = 0;

        while(canal!=0){
            System.out.println("Informe o número do canal assistido: ");
            canal = teclado.nextInt(); 
            if(canal == 4 ){
                System.out.println("Infrome quantas pessoas estavam assistindo ao canal: ");
                telepectadoresCanal4 += teclado.nextInt();
                telepectadoresTotais += telepectadoresCanal4; 
            }else if(canal == 5 ){
                System.out.println("Infrome quantas pessoas estavam assistindo ao canal: ");
                telepectadoresCanal5 += teclado.nextInt();
                telepectadoresTotais += telepectadoresCanal5; 
            }else if(canal == 9 ){
                System.out.println("Infrome quantas pessoas estavam assistindo ao canal: ");
                telepectadoresCanal9 += teclado.nextInt();
                telepectadoresTotais += telepectadoresCanal9; 
            }else if(canal == 12 ){
                System.out.println("Infrome quantas pessoas estavam assistindo ao canal: ");
                telepectadoresCanal12 += teclado.nextInt();
                telepectadoresTotais += telepectadoresCanal12; 
            }

        }

        System.out.println("o percentual de audiência da emissora 4 foi de: " + (int) (telepectadoresCanal4/telepectadoresTotais*100) + "%");
        System.out.println("o percentual de audiência da emissora 5 foi de: " + (int) (telepectadoresCanal5/telepectadoresTotais*100) + "%");
        System.out.println("o percentual de audiência da emissora 9 foi de: " + (int) (telepectadoresCanal9/telepectadoresTotais*100) + "%");
        System.out.println("o percentual de audiência da emissora 12 foi de: " + (int) (telepectadoresCanal12/telepectadoresTotais*100) + "%");

        teclado.close();

    }

}