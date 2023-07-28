package Unidade5;

//Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

// > os elementos a serem colocados na mochila;
// > os elementos que entraram na mochila;
// > os que ficaram fora da mochila;
// > qual é a soma dos elementos que entraram na mochila;
// > qual a soma dos elementos que não entraram na mochila.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o valor inicial (N): ");
        int n = keyboard.nextInt();

        System.out.print("Digite o decremento (K): ");
        int k = keyboard.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int m = keyboard.nextInt();

        List<Integer> elementosNaMochila = new ArrayList<>();
        List<Integer> elementosForaDaMochila = new ArrayList<>();

        int somaElementosNaMochila = 0;
        int somaElementosForaDaMochila = 0;

        while (n > 0 && m > 0) {
            if (n <= m) {
                elementosNaMochila.add(n);
                somaElementosNaMochila += n;
                m -= n;
            } else {
                elementosForaDaMochila.add(n);
                somaElementosForaDaMochila += n;
            }

            n -= k;
        }

        System.out.println("Elementos na mochila:");
        for (int elemento : elementosNaMochila) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Elementos fora da mochila:");
        for (int elemento : elementosForaDaMochila) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Soma dos elementos na mochila: " + somaElementosNaMochila);
        System.out.println("Soma dos elementos fora da mochila: " + somaElementosForaDaMochila);

        keyboard.close();
    }
}
