package app07.conditionals;

import java.util.Scanner;

public class Telecom {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de minutos utilizados em telefonia: ");
        double a = teclado.nextDouble();

        int pattern = 50;
        if (a > 100){
            int rule = ((int)(a) - 100)* 2;
            System.out.println("O total a pagar de telefonia é: "+(rule+pattern)+" Reais");
        }
        else {
            System.out.println("O total a pagar de telefonia é: "+pattern+" Reais");
        }
        System.out.println();
        teclado.close();
    }
}
