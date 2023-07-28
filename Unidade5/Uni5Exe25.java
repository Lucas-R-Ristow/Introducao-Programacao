package Unidade5;

//Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:
// > Um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
// > O jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int pontosD = 0; 
        int pontosE = 0;
        int vencedor = 1;
        String entrada = "0";

        while(pontosD!=vencedor||pontosE!=vencedor){
            System.out.print("informe quem pontuou: ");
            entrada = teclado.next().toUpperCase();
            if(entrada.equals("E")){
                pontosE ++;
                if(pontosE>=21&&(pontosE-pontosD)>=2){
                    vencedor = pontosE;
                    System.out.println("O vendecor da partida foi o jogador E");
    
                }else if(pontosD>=21&&(pontosD-pontosE)>=2){
                    vencedor = pontosD;
                    System.out.println("O vendecor da partida foi o jogador D");
    
                }
            }else if(entrada.equals("D")){
                pontosD ++;
                if(pontosE>=4&&pontosE-pontosD==2){
                    vencedor = pontosE;
                    System.out.println("O vendecor da partida foi o jogador E");
    
                }else if(pontosD>=4&&pontosD-pontosE==2){
                    vencedor = pontosD;
                    System.out.println("O vendecor da partida foi o jogador D");
    
                }
    
            }
        }

        teclado.close();
    }
}