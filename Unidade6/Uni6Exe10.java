package Unidade6;

//Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

//“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;

//“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;

//“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;

//“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;

//“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;

//“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;

//“7 – Inverter valores”: desafio (ver abaixo);

//“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.

//Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.

import java.util.Scanner;

public class Uni6Exe10 {
    private Uni6Exe10(){

        Scanner teclado=new Scanner(System.in);
        int tamanhoVetor=0;

        int vetor[]= new int[tamanhoVetor];
        do{
            System.out.println("Informe a quantidade de"+
                            " números que deseja solicitar:");
            
            tamanhoVetor = teclado.nextInt();
            lerVetor(vetor, teclado);

        }while(tamanhoVetor < 1 || tamanhoVetor > 50);
        
        // menu
        int menu=0;
        System.out.println("1: Incluir valor");
        System.out.println("2: Pesquisar valor");
        System.out.println("3: Alterar valor");
        System.out.println("4: Excluir valor");
        System.out.println("5: Mostrar valores");
        System.out.println("6: Ordenar valores");
        System.out.println("7: Inverter valores");
        System.out.println("8: Sair do sistema");


        while (menu!=8) {
            System.out.println("Informe o número do menu: ");
            menu = teclado.nextInt();
            alteracao(vetor, menu, tamanhoVetor, teclado);
        }
        

        teclado.close();
    }

    private void lerVetor(int vetor[], Scanner tec) {
        System.out.println("Informe os valores:");
        for (int i = 0; i < vetor.length;i++){
            vetor[i] = tec.nextInt(); 
        }
        
    }

    private void alteracao(int vetor[], int menu, int tamanhoVetor, Scanner tec){
        switch (menu) {
            case 1: // adicionar valor
                tamanhoVetor++;
                System.out.println("Informe o número: ");
                int numero = tec.nextInt();
                vetor[tamanhoVetor]= numero;
                break;
            case 2: // pesquisar valor
                System.out.println("Informe o valor: ");
                int valor = tec.nextInt();
                for(int i=0; i<tamanhoVetor; i++){
                    if(vetor[i]==valor){
                        System.out.println("Esse número ja está no vetor.");
                    }else{
                        System.out.println("Esse número não está no vetor.");
                    }
                }
                break;
            case 3: // alterar valor
                System.out.println("Informe o valor a ser alterado: ");
                int valorAlterar = tec.nextInt();
                System.out.println("Informe o novo valor: ");
                int novoValor=tec.nextInt();
                for(int j=0;j<tamanhoVetor; j++ ){
                    if(valorAlterar==vetor[j]){
                        vetor[j]= novoValor;
                    }else{
                        System.out.println("número não encontrado");
                    }
                }
                break;
            case 4: // excluir valor
                System.out.println("Informe o valor a ser excluído: ");
                int valorExcluido = tec.nextInt();
                for(int c=0; c<tamanhoVetor; c++){
                    if(valorExcluido==vetor[c]){
                        vetor[c] = vetor[c+1];
                        for(int h=c; h<tamanhoVetor; h++){
                            vetor[h]=vetor[h+1];
                        }
                    }
                }
                break;
            case 5: // mostrar valores
                for(int d=0; d<tamanhoVetor; d++){
                    System.out.print(vetor[d]+", ");
                }
                break;
            case 6: // ordenar valores
                // método bolha 
                int bolha = 0;
                for(int i=0; i<tamanhoVetor; i++){ 
                    if(vetor[i]>vetor[i+1]){
                        bolha = vetor[i];
                        vetor[i]=vetor[i+1];
                        vetor[i+1]=bolha; 
                        i=0; 
                    }
                }
                break;
            case 7: // inverter valores
                inverter(vetor);
                break;
            case 8:
                break;
        }
    }

    private void inverter(int vet[]){
        int temp = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int x = 0; x < i; x++) {
                temp = vet[i];
                vet[i] = vet[x];
                vet[x] = temp;
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
