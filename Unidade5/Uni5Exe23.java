package Unidade5;

//Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
        String entrada = teclado.next().toUpperCase();
        double total_dvendas_vendedor = 0;
        String nome = "0";

        while(entrada.equals("SIM") && entrada!="NÃO"){
            System.out.print("informe o nome do vendedor: ");
            nome = teclado.next();
            System.out.println("informe o número deprodutos vendidos pelo vendedor: ");
            int n_d_produtos = teclado.nextInt();
            for (int i =1 ; i <=n_d_produtos; i ++){
            System.out.print("informe o código do produto: ");
            teclado.nextDouble();
            System.out.print("Informe o valor do produto: ");
            double valor_dproduto = teclado.nextDouble();
            total_dvendas_vendedor += valor_dproduto ;
        }

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("O total de de vendas em R$ feitas pelo vendedor foi de: R$: " + df_2.format(total_dvendas_vendedor));
        System.out.println("O sálario do vendedor e questão é de: R$ " + df_2.format(total_dvendas_vendedor*0.3));
        System.out.println();
        System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
        entrada = teclado.next().toUpperCase();
        }

        teclado.close();

    }

}