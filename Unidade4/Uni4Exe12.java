package Unidade4;

//Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

//1.O comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
//2.Um triângulo equilátero tem três lados iguais
//3.Um triângulo isóscele tem dois lados iguais e um diferente
//4.Um triângulo escaleno tem três lados diferentes

import java.util.Scanner;
	
public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o valor 1: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Informe o valor 2: ");
        double valor2 = teclado.nextDouble();
        System.out.print("Informe o valor 3: ");
        double valor3 = teclado.nextDouble();

        if (valor1<valor2+valor3&&valor2<valor1+valor3&&valor3<valor1+valor2)
        
        if (valor1==valor2&&valor2==valor3){
            System.out.println("O triângulo é Equilátero.");}
            
        else    
             if (valor1==valor2||valor1==valor3||valor2==valor3){
                System.out.println("O triângulo é Isósceles.");}

        else 
         System.out.println("É um triângulo Escaleno.");

        teclado.close();
    }
}