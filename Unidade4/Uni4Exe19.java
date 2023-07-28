package Unidade4;

//Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

//0, se os dois valores forem zero
//1, se os dois valores forem positivos
//2, se x for positivo e y, negativo
//3, se os dois valores forem negativos
//4, se x for negativo e y, positivo

import java.util.Scanner;
    
public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o valor de x: ");
        int x = teclado.nextInt();
        System.out.print("Informe o valor de y: ");
        int y = teclado.nextInt();

        if(y==0&&x==0)
        System.out.println("O ponto pertence ao quadrante 0");

        if(y>0&&x>0)
        System.out.println("O ponto pertence ao quadrante 1");

        if(y<0&&x>0)
        System.out.println("O ponto pertence ao quadrante 2");

        if(y<0&&x<0)
        System.out.println("O ponto pertence ao quadrante 3");

        if(y>0&&x<0)
        System.out.println("O ponto pertence ao quadrante 4");

        teclado.close();
    }
}