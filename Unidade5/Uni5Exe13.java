package Unidade5;

//Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:

//A quilometragem obtida por litro de combustível em cada parada;
//A quilometragem média obtida por litro de combustível em toda a viagem.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe o número de paradas para abastecimento: ");
        int numeroAbastecimentos = teclado.nextInt();
        double kmporparada = 0;
        double combustivelComprado = 0;
        double kmTotal=0, combTotal=0; 

        for(int parada=1; parada <= numeroAbastecimentos; parada++){
            
            System.out.println("Informe os km marcados");
            kmporparada = teclado.nextDouble();
            System.out.println("Informe a quantidade de combustível comprado");
            combustivelComprado = teclado.nextDouble();
            kmTotal+=kmporparada;
            combTotal+=combustivelComprado;
            System.out.println("Parada "+parada);
            System.out.println("Quilometragem por litro nessa parada: "+kmporparada/combustivelComprado);
            
        }

        System.out.println("Quilometragem média por litro em toda a viagem: "+ df_2.format(kmTotal/combTotal));


        teclado.close();
    }
}