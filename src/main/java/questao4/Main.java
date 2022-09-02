package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Dada uma lista de bibliotecas, retorne:
        "A", se o total de livros for maior ou igual a 1 e menor que 10
        "B", se o total for maior ou igual a 10 e menor que 20
        "C" se o número for maior ou igual 20 e menor que 30
        "Z", se o número for igual a 0. */

        Biblioteca b = new Biblioteca();

        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------- Bem vindo! ---------------\n");
        System.out.print("Digite a quantidade de livros desejada: ");
        b.livros = entrada.nextInt();

        System.out.println("------------------------------------------");

        if (b.livros >= 1 && b.livros < 10) {
            System.out.println("Biblioteca A");
        }
        if (b.livros >= 10 && b.livros < 20) {
            System.out.println("Biblioteca B");
        }
        if (b.livros >= 20 && b.livros < 30) {
            System.out.println("Biblioteca C");
        }
        if (b.livros == 0) {
            System.out.println("Biblioteca Z");
        }
    }
}
