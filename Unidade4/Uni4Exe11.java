package Unidade4;

//Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

import java.util.Scanner;
	
public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a data de nascimento do(a) primeiro(a) filho(a): ");
        String Filho1 = teclado.next();
        System.out.print("Informe a data de nascimento do(a) segundo(a) filho(a): ");
        String Filho2 = teclado.next();
        System.out.print("Informe a data de nascimento do(a) terceiro(a) filho(a): ");
        String Filho3 = teclado.next();

        if (Filho1.equals(Filho3)&&Filho1.equals(Filho2)&&Filho2.equals(Filho3)){
            System.out.println("Eles são Trigêmeos.");}
            
        else    
             if (Filho1.equals(Filho3)||Filho1.equals(Filho2)||Filho2.equals(Filho3)){
                System.out.println("Eles são Gêmeos.");}

        else 
         System.out.println("Eles são apenas irmãos.");

        teclado.close();
    }
}
