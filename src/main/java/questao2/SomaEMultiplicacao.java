package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMultiplicacao {

    /* Dada uma lista de números e uma String "+" ou "*", some ou multiplique todos os
    números dependendo do parâmetro. */

    public static ArrayList<Integer> listaNumeros(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        return list;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("---------------------------------");
        System.out.print("Você deseja somar(s) ou multiplicar(m)? ");
        String escolha = entrada.next();
        System.out.println("---------------------------------");

        int soma = 0;
        int multi = 1;

        if (escolha.equals("s")){
            for (int numero : listaNumeros()) {
                soma += numero;
            }
            System.out.println("Resultado da soma: " + soma);
        }
        if (escolha.equals("m")){
            for (int numero : listaNumeros()) {
                multi = numero * multi;
            }
            System.out.println("Resultado da multiplicação: " + multi);
        }
    }
}
