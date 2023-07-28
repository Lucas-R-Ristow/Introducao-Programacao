package Unidade4;

//Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.

import java.util.Scanner;
	
public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe seu Sexo (Utilizando 'M', 'F' ou 'I'): ");
        String sexo = teclado.next();

        if (sexo.equals("M")){
            System.out.println("O sexo é masculino");}
        else
        if (sexo.equals("F")){
            System.out.println("O sexo é feminino");}
        else
        if (sexo.equals("I")) 
            System.out.println("Não Informado");
        else
            System.out.println("Entrada Incorreta.");

        teclado.close();
    }
}