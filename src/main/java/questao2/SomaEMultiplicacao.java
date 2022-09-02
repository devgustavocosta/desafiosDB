package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMultiplicacao {

    /* Dada uma lista de números e uma String "+" ou "*", some ou multiplique todos os
    números dependendo do parâmetro. */
    private static int numero1;
    private static int numero2;
    private static int numero3;
    static ArrayList<Integer> lista = new ArrayList<>();;

    public static ArrayList<Integer> listaNumeros(){
        lista.add(numero1);
        lista.add(numero2);
        lista.add(numero3);
        return lista;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("---------------------------------");
        System.out.print("Digite seu primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite seu segundo número: ");
        numero2 = entrada.nextInt();
        System.out.print("Digite seu terceiro número: ");
        numero3 = entrada.nextInt();
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
