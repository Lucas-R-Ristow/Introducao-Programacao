package Unidade4;

//Dado um caractere indicando uma opção, escreva um algoritmo para:

//se opção = ‘T’: calcular a área de um triângulo de base b e altura h
//se opção = ‘Q’: calcular a área de um quadrado de lado l
//se opção = ‘R’: calcular a área de um retângulo de base b e altura h
//se opção = ‘C’: calcular a área de um círculo de raio r

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

            System.out.println("T: Calcular a área de um triângulo de base b e altura h. ");
            System.out.println("Q: Calcular a área de um quadrado de lado l. ");
            System.out.println("R: Calcular a área de um retângulo de base b e altura h. ");
            System.out.println("C: Calcular a área de um círculo de raio r. ");
             String opçao = teclado.next();
             
        if(opçao.equals("T")||opçao.equals("Q")||opçao.equals("R")||opçao.equals("C")){}else
        
            switch(opçao){
            case "T":
            System.out.println("Informe a base e altura do triângulo.");
            System.out.print("Base: ");
            double base = teclado.nextDouble();
            System.out.print("Altura: ");
            double altura = teclado.nextDouble();
            double triangulo = (base*altura)/2;
            System.out.println("A base do triângulo é "+base+"*"+altura+"/2. = "+triangulo); 

            case "Q":
            System.out.print("Informe o lado: ");
            double lado = teclado.nextDouble();
            double quadrado = lado*lado;
            System.out.print("A área do quadrado é : "+lado+"*"+lado+" = "+quadrado);

            case "R":
            System.out.println("Informe a base e altura do retângulo.");
            System.out.print("Base: ");
            double b = teclado.nextDouble();
            System.out.print("Altura: ");
            double h = teclado.nextDouble();
            double retângulo = b*h;
            System.out.println("A base do retângulo é "+b+"*"+h+" = "+retângulo); 

            case "C":
            System.out.print("Informe o raio: ");
            double raio = teclado.nextDouble();
            double circulo = Math.PI*raio*raio;
            System.out.print("A área do circulo é : PI*"+raio+"^2"+ " = "+circulo);
        break;
           default:
           System.out.println("ENTRADA INVÁLIDA");
        
            teclado.close();

        
    }
}
}
