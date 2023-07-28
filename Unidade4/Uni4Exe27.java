package Unidade4;

//As tarifas de um estacionamento são as seguintes:

//1° e 2° hora - R$ 5,00 cada
//3° e 4° hora - R$ 7,50 cada
//5° hora e seguintes - R$ 10,00 cada

//O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.

import java.util.Scanner;
 
public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a hora da entrada: ");
        int horac = teclado.nextInt();
        System.out.print("Informe os minutos da entrada: ");
        int minc = teclado.nextInt();
        System.out.print("Informe a hora da sáida: ");
        int horas = teclado.nextInt();
        System.out.print("Informe os minutos da sáida: ");
        int mins = teclado.nextInt();

        if(horac>=0&&horac<24&&horas>=0&&horas<24&&minc>=0&&minc<60&&mins>=0&&mins<60)


            if (horas-horac==0&&mins-minc<30)
            System.out.println("Não é nescessário pagar pelo estacionamneto.");
        else
        if (horas-horac==0&&mins-minc>=30)
            System.out.println("O valor a pagar pelo estacionamneto é de R$ 5");
        else
            if (horas-horac>=1&&horas-horac<=2&&mins-minc<30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ "+(-5*(horac-horas)));
            else 
            if (horas-horac==1&&mins-minc>=30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ 10");
            else 


            if (horas-horac>=1&&horas-horac<=2&&mins-minc>=30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ "+(7.5+(-7.5*(horac-horas))));
            else 


            if (horas-horac>2&&horas-horac<=4&&mins-minc<30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ "+(-7.5*(horac-horas)));
            else     
            if (horas-horac==3&&mins-minc>=30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ 30");
            else
            if (horas-horac>2&&horas-horac<=4&&mins-minc>=30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ "+(10+(-10*(horac-horas))));
            else


            if (horas-horac>=5&&mins-minc<30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ "+((-10*(horac-horas))));
            if (horas-horac>=5&&mins-minc>=30)
            System.out.println("O valor a pagar pelo estacionamento é de: R$ "+(10+(-10*(horac-horas))));



        teclado.close();
    }
}

