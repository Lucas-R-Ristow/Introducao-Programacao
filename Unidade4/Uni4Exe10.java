package Unidade4;

//Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.

import java.util.Scanner;
	
public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a idade do Marquinhos: ");
        int Marquinhos = teclado.nextInt();
        System.out.print("Informe a idade do Zezinho: ");
        int Zezinho = teclado.nextInt();
        System.out.print("Informe a idade da Luluzinha: ");
        int Luluzinha = teclado.nextInt();

        if (Marquinhos<Zezinho&&Marquinhos<Luluzinha){
            System.out.println("O caçula é o Marquinhos.");}

        if (Zezinho<Marquinhos&&Zezinho<Luluzinha){
            System.out.println("O caçula é o Zezinho.");}
            
        if (Luluzinha<Marquinhos&&Luluzinha<Zezinho) 
            System.out.println("A caçula é a Luluzinha.");
    

        teclado.close();
    }
}