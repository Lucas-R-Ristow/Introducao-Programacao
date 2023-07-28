package Unidade4;

//Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.

import java.util.Scanner;
    
public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = teclado.next();
        System.out.print("Informe a quantidade de meses que o funcionário foi admitido: ");
        int meses = teclado.nextInt();

        if (meses<=12)
            System.out.println(nome+", a empresa lhe consedera 5% de reajuste salárial.");

        if (meses>12&&meses<49)
            System.out.println(nome+", a empresa lhe consedera 7% de reajuste salárial.");

        else
        teclado.close();
    }
}