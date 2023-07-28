package Unidade6;

//Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

//Vetor origem: [0][4][2][6][3]
//Vetor ordenado: [0][2][3][4][6]

import java.util.Scanner;

public class Uni6Exe07 {
    
    private Uni6Exe07(){
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = 0;
        
        do{
            System.out.println("Informe a quantidade de"+
                            " números que deseja solicitar:");
            tamanhoVetor = teclado.nextInt();
        }while(tamanhoVetor < 1 || tamanhoVetor > 20);
        

        int vetNumeros[]= new int[tamanhoVetor];

        ler(vetNumeros, teclado);
        imprimir(vetNumeros, "origem");
        ordenar(vetNumeros, tamanhoVetor);
        
        imprimir(vetNumeros, "ordenado");
        


        teclado.close();
    }

    private void ler(int vetor[], Scanner tec){
        int i=0, numero=0;
        while (i<vetor.length) {
            System.out.println("Informe o "+(i+1)+" número: ");
            numero=tec.nextInt();

            boolean encontrou = pesquisarNumero(vetor, numero, i);

            if (!encontrou) {
                vetor[i]=numero;
                i++;
            }
        }
    }

    private boolean pesquisarNumero(int vetor[], int numero, int IndiceAtual){
    
        for(int c = 0; c<IndiceAtual; c++){
            if (vetor[c]==numero) {
                System.out.println("Número ja existe.");
                return true;
            }
        }

        return false; 
    }

    private void ordenar(int vetor[], int tamanho){
        // método bolha 
        int bolha = 0;
        for(int i=0; i<tamanho-1; i++){ 
                   
            
            if(vetor[i]>vetor[i+1]){
                bolha = vetor[i];
                vetor[i]=vetor[i+1];
                vetor[i+1]=bolha; 
                
                i=0; 
            }
            
        }
    }

    private void imprimir(int vetor[], String texto){
        System.out.print("Vetor "+texto+":");
        for(int i=0; i<vetor.length; i++){
            System.out.print("["+vetor[i]+"]");
        }

    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
}