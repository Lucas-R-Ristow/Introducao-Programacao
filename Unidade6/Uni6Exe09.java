package Unidade6;

// Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

//Baseado nisto faça um programa que informe:

// >qual a nota média recebida pelo cinema;
// >qual a nota média atribuída pelos homens;
// >qual a nota atribuída pela mulher mais jovem;
// >quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.

// Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.

import java.util.Scanner;

public class Uni6Exe09 {
    private Uni6Exe09(){

        Scanner teclado = new Scanner(System.in);

        final int qtdClientes= 30; 
        final int qtdPerguntas=3;
        
        int matPesquisa[][]=new int[qtdClientes][qtdPerguntas];

        lerPerguntas(matPesquisa, teclado, qtdClientes);
        double media = notaMedia(matPesquisa, qtdClientes);

        double mediaNotaHomens = mediaHomens(matPesquisa, qtdClientes);
        double mulheres50 = mulheres(matPesquisa, qtdClientes, media);
        double mulherNova = mulherNova(matPesquisa);

        imprimirVetor(media, mediaNotaHomens, mulheres50, mulherNova);

        teclado.close();
    }

    private void lerPerguntas(int matPesquisa[][], Scanner tec, int qtdClientes){
        for(int cliente=0; cliente<qtdClientes; cliente++){
            System.out.println("Informe o seu sexo (1=feminino 2=masculino)");
            matPesquisa[cliente][0]= tec.nextInt();
            System.out.println("Informe a sua nota (0 a 10)");
            matPesquisa[cliente][1]= tec.nextInt();
            System.out.println("Idade: ");
            matPesquisa[cliente][2]= tec.nextInt();
            
        }
    }

    private double notaMedia(int matriz[][], int qtdClientes){
        // nota media recebida pelo cinema
        double somaNota=0;
        for(int cliente=0; cliente<qtdClientes; cliente++){
            somaNota+=matriz[cliente][1];
        }
        return somaNota/qtdClientes;
    }

    private double mediaHomens(int matriz[][], int cliente){
        double somaHomens=0;
        double qtdHomens=0;
        for(int cont=0; cont<cliente; cont++){
            if (matriz[cont][0]==1) {
                qtdHomens++;
                somaHomens+=matriz[cont][1];
            }
        }
        return somaHomens/qtdHomens;
    }

    private double mulheres(int matriz[][], int clientes, double media){
        int mulheres50 = 0;
        for(int cont=0; cont<clientes; cont++){
            // se for mulher
            if(matriz[cont][0]==2){
                if(matriz[cont][2]>50 && matriz[cont][1]>media){
                    mulheres50++;
                }
            }
        } 
        return mulheres50;    
    }

    private double mulherNova(int matriz[][]){
        int mulherNova =0;
        int bolha = 0;
        for(int j=0; j<31; j++){    
            for(int i=0; i<30; i++){        
            
                if(matriz[i][2]>matriz[i+1][2]){
                    bolha = matriz[i][2];
                    matriz[i][2]=matriz[i+1][2];
                    matriz[i+1][2]=bolha; 
                
                    i=0; 
                }
            }
        }
        mulherNova= matriz[0][2];
        return mulherNova; 
    }

    private void imprimirVetor(double media, double mediaHomens, double mulheres50, double mulherNova){
        System.out.println("A média do cinema é "+media);
        System.out.println("A média da nota dos homens é "+mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem "+mulherNova);
        System.out.println("Mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema "+mulheres50);
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}