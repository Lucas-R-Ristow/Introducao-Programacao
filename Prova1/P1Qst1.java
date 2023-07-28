package Prova1;

import java.util.Scanner;
	
public class P1Qst1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cor = teclado.next();
        int numeroRGB = 0;
        int novacor = 0;

        if (cor.isEmpty()){
        System.out.println("Valor inválido");
        }else
         numeroRGB = teclado.nextInt();

        if(numeroRGB<255){
        System.out.println("Valor inválido");
        }else{
        novacor = (numeroRGB+20);
        System.out.println("Cor: "+cor+"Nova cor: "+novacor);
        }
        teclado.close();
    }
}
