package Unidade4;

//O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

//IMC=\frac{Massa}{Altura^2}

//Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

//IMC	Classificação
//< 18.5	Magreza
//18.5 - 24.9	Saudável
//25.0 - 29.9	Sobrepeso
//30.0 - 34.9	Obesidade Grau I
//35.0 - 39.9	Obesidade Grau II (severa)
//>= 40.0	Obesidade Grau III (mórbida)

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a sua altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Informe seu peso: ");
        double peso = teclado.nextDouble();
        System.out.print("Informe seu nome: ");
        String nome = teclado.next();

        double IMC = peso/(altura*altura);

        if(IMC<18.5)
        System.out.println(nome+" seu indidíce de massa corporal indica MAGREZA, procure uma academia e se alimente melhor.");

        if(IMC>=18.5&&IMC<=24.9)
        System.out.println(nome+" parabéns, seu indidíce de massa corporal indica que você está SAUDÁVEL.");


        if(IMC>=25&&IMC<=29.9)
        System.out.println(nome+" seu indidíce de massa corporal indica SOBREPESO.");

        if(IMC>=30&&IMC<=34.9)
        System.out.println(nome+" seu indidíce de massa corporal indica OBESIDADE de grau I.");

        if(IMC>=35&&IMC<=39.9)
        System.out.println(nome+" seu indidíce de massa corporal indica OBESIDADE de grau II.");

        if(IMC>40)
        System.out.println(nome+" ATENÇÃO, seu indidíce de massa corporal indica OBESIDADE MORBIDA, procure um médico.");

        teclado.close();
    }
}