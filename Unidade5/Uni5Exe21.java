package Unidade5;

//Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico

public class Uni5Exe21 {
    public static void main(String[] args){
        double Chico = 1.5;
        double Zé = 1.1;
        int tempo = 0;
        double aumentoC = 0;
        double aumentoZ = 0;

        while(aumentoZ<1.23){
        tempo ++;
        aumentoC += 0.02;
        aumentoZ += 0.03;
        Zé = Zé + aumentoZ;
        Chico = Chico + aumentoC;
        }

        System.out.println("Serão nescessários " + tempo + " anos para Zé ser maior que Chico.");

    }

}