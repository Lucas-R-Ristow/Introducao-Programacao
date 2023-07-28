package Unidade4;

//Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.

import java.util.Scanner;
	
public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número(maior que zero): ");
        double n = teclado.nextDouble();
        int ni= (int) n;
        if (n/ni <=1)
            System.out.println("O número não possui casas decimais");
        else
            System.out.println("O número possui casas decimais");

        teclado.close();
    }
}