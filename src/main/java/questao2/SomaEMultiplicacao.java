package questao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SomaEMultiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("---------------------------------");
        System.out.print("Você deseja somar(s) ou multiplicar(m)? ");
        String escolha = entrada.next();
        System.out.println("---------------------------------");

        int[] numeros = {9, 6 ,7};
        int soma = 0;
        int multi = 1;

        if (escolha.equals("s")){
            for (int numero : numeros) {
                soma += numero;
            }
            System.out.println("Resultado da soma: " + soma);
        }
        if (escolha.equals("m")){
            for (int numero : numeros) {
                multi = numero * multi;
            }
            System.out.println("Resultado da multiplicação: " + multi);
        }


    }
}
