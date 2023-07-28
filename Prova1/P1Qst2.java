package Prova1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1Qst2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

             String Código = teclado.next().toLowerCase();
             int valor = teclado.nextInt();
             double desconto = 0;
             double preço = 0; 
             
        
            switch(Código){
            case "a":
            if(valor>1000){
                System.out.println("O valor não pode ser superior a R$ 1000,00");
            break;
            }else
            desconto = (valor*0.08);
            preço = (valor*0.92);
            System.out.println("Hotel: Expedia");
            System.out.println("Desconto: "+df_2.format(desconto));
            System.out.println("Preço: "+df_2.format(preço));
            break;
            
            case "b":
            if(valor>1200){
                System.out.println("O valor não pode ser superior a R$ 1200,00.");
            break;
            }else
             desconto = (valor*0.15);
             preço = (valor*0.85);
            System.out.println("Hotel: Hoteis.com");
            System.out.println("Desconto: "+df_2.format(desconto));
            System.out.println("Preço: "+df_2.format(preço));
            break;

            case "c":
            if(valor>500){
                System.out.println("O valor não pode ser superior a R$ 500,00.");
            break;
            }
             desconto = (valor*0.15);
             preço = (valor*0.85);
            System.out.println("Hotel: All");
            System.out.println("Desconto: "+df_2.format(desconto));
            System.out.println("Preço: "+df_2.format(preço));
            break;
            
            case "d":
            if(valor>=100&&valor<=2000){
             desconto = (valor*0.2);
             preço = (valor*0.8);
            System.out.println("Hotel: Plaza");
            System.out.println("Desconto: "+df_2.format(desconto));
            System.out.println("Preço: "+df_2.format(preço));
            break;
            }else 
            System.out.println("O valor deve estar entre R$ 100,00 e R$ 2000,00");
            break;

            case "e":
            if(valor>=100&&valor<=2000){
             desconto = (valor*0.3);
             preço = (valor*0.7);
            System.out.println("Hotel: Decolar");
            System.out.println("Desconto: "+df_2.format(desconto));
            System.out.println("Preço: "+df_2.format(preço));
            break;
            }else
            System.out.println("O valor deve estar entre R$ 100,00 e R$ 2000,00");
            break;

            case "f":
             desconto = 0;
             preço = (valor);
            System.out.println("Hotel: Outros");
            System.out.println("Desconto: "+df_2.format(desconto));
            System.out.println("Preço: "+df_2.format(preço));
            break;

           default:
           System.out.println("Código inválido");

    }
    
        teclado.close();
    }
}