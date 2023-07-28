package Unidade5;

//Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:

//código	conjunto
//1	        Nenhum de Nós
//2	        CPM22
//3	        Skank
//4	        Jota Quest

//Descreva um algoritmo que:
//(1) informe o total de votos para cada grupo;
//(2) informe o percentual dos votos para cada grupo;
//(3) informe o grupo vencedor.

//O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Deseja digitar informar mais um voto: s (SIM) / n (NÃO)?");
        String entrada = teclado.next().toUpperCase();
        int NenhumdNos = 0;
        int Cpm22 = 0;
        int Shank = 0;
        int JotaQuest = 0;
        int TotaldVotos = 0;
        int voto = 0;
        int vencedor = 0;

        while (entrada.equals("S") && entrada != "N") {
            System.out.println("Informe pra quem foi o voto: ");
            voto = teclado.nextInt();
            if(voto!=1||voto!=2||voto!=3||voto!=4) {
                System.out.println("ENTRADA INVÁLIDA");
                System.out.println();
            }
            System.out.println("Deseja digitar informar mais um voto: s (SIM) / n (NÃO)?");
            entrada = teclado.next().toUpperCase();
            if (voto == 1) {
                NenhumdNos++;
                TotaldVotos++;
            } else if (voto == 2) {
                Cpm22++;
                TotaldVotos++;
            } else if (voto == 3) {
                Shank++;
                TotaldVotos++;
            } else if (voto == 4) {
                JotaQuest++;
                TotaldVotos++;
            } 

            if (NenhumdNos > vencedor) {
                vencedor = NenhumdNos;
            } else if (Cpm22 > vencedor) {
                vencedor = Cpm22;
            } else if (Shank > vencedor) {
                vencedor = Shank;
            } else if (JotaQuest > vencedor) {
                vencedor = JotaQuest;
            }

        }

        System.out.println("Total de votos Nenhum de Nós:" + NenhumdNos);
        System.out.println("Total de votos Cpm22:" + Cpm22);
        System.out.println("Total de votos Shank:" + Shank);
        System.out.println("Total de votos Jota Quest:" + JotaQuest);
        System.out.println();
        System.out.println();

        System.out.println("Porcentagem de votos Nenhum de Nós:" + (NenhumdNos / TotaldVotos * 100) + " %");
        System.out.println("Porcentagem de votos Cpm22:" + (Cpm22 / TotaldVotos * 100) + " %");
        System.out.println("Porcentagem de votos Shank:" + (Shank / TotaldVotos * 100) + " %");
        System.out.println("Porcentagem de votos Jota Quest:" + (JotaQuest / TotaldVotos * 100) + " %");
        System.out.println();
        System.out.println();

        if (vencedor == NenhumdNos) {
            System.out.println("Grupo vencedor: Nenhum de Nós.");
        } else if (vencedor == Cpm22) {
            System.out.println("Grupo vencedor: Cpm22.");
        } else if (vencedor == Shank) {
            System.out.println("Grupo vencedor: Shank.");
        } else if (vencedor == JotaQuest) {
            System.out.println("Grupo vencedor: Jota Quest.");
        }

        teclado.close();
    }

}