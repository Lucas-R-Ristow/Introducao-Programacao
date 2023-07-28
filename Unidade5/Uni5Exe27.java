package Unidade5;

//Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor diário conforme as regras descritas abaixo. Escreva um programa para ler o dia do mês de abril que será calculado o valor diário. O programa deve validar a leitura do dia deforma a aceitar apenas valores válidos para o mês de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã e o total de peças produzidas no turno da tarde. Escrever o valor que o respectivo funcionário receberá no dia. Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês e a produção de peças do funcionário em cada turno, caso contrário deve ser encerrado.

//Regras:
// (1) para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde), desde que a produção em cada um dos turnos não seja inferior a 30. Caso contrário recebe R$ 0,50 por peça.
// (2) para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da tarde.

//Considere que a produção em cada turno nunca será a mesma (não é necessário validar) Responda também:
// > qual dia ocorreu a maior produção;
// > em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).

//Exemplo de entrada / saída:

//      Dia	        Manhã	        Tarde	        Saída
//      -1			                                Dia inválido
//      32			                                Dia inválido
//      10	         50	              60	        R$ 88,00 (valor recebido)
//  Novo funcionário:                               (1.sim 2.não)?
//      1 (sim)			
//      14	        110	              20	        R$ 65,00 (valor recebido)
//  Novo funcionário:                               (1.sim 2.não)?
//      1 (sim)			
//      12	        20	              90	        R$ 55,00 (valor recebido)
//  Novo funcionário:                               (1.sim 2.não)?
//      1 (sim)			
//      16	        40	              90	        R$ 43,00 (valor recebido)
//  Novo funcionário:                               (1.sim 2.não)?
//      1 (sim)			
//      13	        20	              22	        R$ 21,00 (valor recebido)
//  Novo funcionário:                               (1.sim 2.não)?
//      1 (sim)			
//      9	        40	              42	        R$ 41,00 (valor recebido)
//  Novo funcionário:                               (1.sim 2.não)?
//      2 (não)

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe27 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int FuncionarioNovo = 1;
        int dia_mes = 0;
        int qntManha =0, qntTarde = 0, qntDia = 0;
        double valor = 0;
        int diaMaiorProd=0, qntdMaiorProd =0, TurnodMaiorProd = 0;

        while(FuncionarioNovo==1){
            do{
                System.out.println("Informe o DIA: ");
                dia_mes = teclado.nextInt();

                if(dia_mes<1||dia_mes>30){
                    System.out.println("DIA INVÁLIDO.");
                }

            }while(dia_mes<1||dia_mes>30);

            System.out.println("infrome a produção da Manhã: ");
            qntManha = teclado.nextInt();

            System.out.println("infrome a produção da Tarde: ");
            qntTarde = teclado.nextInt();            
            
            qntDia = qntManha+qntTarde;

            if(qntDia>qntdMaiorProd){
                qntdMaiorProd = qntManha;
                diaMaiorProd = dia_mes;
                if(qntManha>qntTarde){
                    TurnodMaiorProd = qntdMaiorProd;
                }else{
                    qntdMaiorProd = qntTarde;
                }

            }

            if(dia_mes<=15){
                if(qntDia>100 && qntManha>=30 && qntTarde>=30){
                    valor = 0.8*qntDia;
                }else{
                    valor = 0.3*qntDia;
                }
            }else{
                valor = 0.4*qntManha;
                valor += 0.3*qntTarde;
            }
            System.out.println("O valor recebido foi de: R$ " + df_2.format(valor));
            System.out.println();
            System.out.println("Novo funcionário (1.sim 2.não)?");
            FuncionarioNovo = teclado.nextInt();

        }

        System.out.println("O dia mais produtivo foi: " + diaMaiorProd);
        System.out.println();
        System.out.println("O turno mais produtivo foi: " + TurnodMaiorProd);
        System.out.println();

        teclado.close();
    }
}