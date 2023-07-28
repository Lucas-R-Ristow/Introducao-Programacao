package Unidade5;

//Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:

//número	decomposição
//180	        2
//90	        2
//45	        3
//15	        3
//5	            5
//1

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o número");
        int numero = teclado.nextInt();
        while(numero!=1){
            if(numero%2==0){
                System.out.println(numero +" | "+ "2");
                numero = numero/2;
            } else if(numero%3==0){
                System.out.println(numero +" | "+ "3");
                numero = numero/3;
            } else if(numero%5==0){
                System.out.println(numero +" | "+ "5");
                numero = numero/5;
            } else if(numero%7==0){
                System.out.println(numero +" | "+ "7");
                numero = numero/7;
            } else if(numero%11==0){
                System.out.println(numero +" | "+ "11");
                numero = numero/11;
            }else if(numero%13==0){
                System.out.println(numero +" | "+ "13");
                numero = numero/13;
            } else if(numero%17==0){
                System.out.println(numero +" | "+ "17");
                numero = numero/17;
            } else if(numero%19==0){
                System.out.println(numero +" | "+ "19");
                numero = numero/19;
            } else if(numero%23==0){
                System.out.println(numero +" | "+ "23");
                numero = numero/23;
            }
        }
            System.out.println("1" +" | "+ "");


        teclado.close();

    }

}
    
