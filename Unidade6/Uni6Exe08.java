package Unidade6;

//Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor

// exemplo:
// vetor[2.1, 3.7, 2.1, 4.3, 3.7, 2.1]
// VALOR    FREQUÊNCIA
// 2.10         3
// 3.70         2
//4.30          1

import java.util.Scanner;

public class Uni6Exe08 {
    
    private Uni6Exe08(){

        Scanner teclado = new Scanner(System.in);

        int tamanhoVetor = 0;
        do{
            System.out.println("Informe a quantidade de números que deseja solicitar: ");
            tamanhoVetor=teclado.nextInt();
        }while(tamanhoVetor<1|| tamanhoVetor>20);

        double vetNumeros[] = new double[tamanhoVetor];

        ler(vetNumeros, teclado);
        imprimir(vetNumeros);
        imprimirFrequencia(vetNumeros);

        teclado.close();
    }

    private void ler(double vetor[], Scanner tec){
        for(int i=0; i<vetor.length; i++){
            System.out.println("Informe o "+(i+1)+" número");
            vetor[i]= tec.nextDouble();
        }
    }

    private void imprimir(double vetor[]){
        for(int i=0; i<vetor.length; i++){
            System.out.print("["+vetor[i]+"]");
            
        }
    }

    private void imprimirFrequencia(double vetor[]){
        int contador=0;
        boolean vetEncontrou[]=new boolean[vetor.length];
        
        System.out.println("VALOR | FREQUENCIA");
        for(int i=0; i<vetor.length; i++){
            for(int j=0; j<vetor.length; j++){
                if(!vetEncontrou[j]){    
                    if(vetor[i]==vetor[j]){
                       contador++;
                       vetEncontrou[j]=true;
                    }
                }
            }

            if(contador>0){
                System.out.println(vetor[i]+" | "+contador);
                contador=0;
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
