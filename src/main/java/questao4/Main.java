package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Dada uma lista de bibliotecas, retorne:
        "A", se o total de livros for maior ou igual a 1 e menor que 10
        "B", se o total for maior ou igual a 10 e menor que 20
        "C" se o número for maior ou igual 20 e menor que 30
        "Z", se o número for igual a 0. */

        Biblioteca biblioteca = new Biblioteca(10);
        Biblioteca biblioteca1 = new Biblioteca(20);
        Biblioteca biblioteca2 = new Biblioteca(30);
        Biblioteca biblioteca3 = new Biblioteca(0);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("---------------------------------");
        System.out.print("Digite a quantidade de livros desejada: ");
        int quantidade = entrada.nextInt();

        System.out.println("---------------------------------");

        if (quantidade >= 1 && quantidade <= biblioteca.getLivros()){
            System.out.println("Biblioteca A");
        }
        if (quantidade >= 10 && quantidade <= biblioteca1.getLivros()) {
            System.out.println("Biblioteca B");
        }
        if (quantidade >= 20 && quantidade <= biblioteca2.getLivros()) {
            System.out.println("Biblioteca C");
        }
        if (quantidade == biblioteca3.getLivros()){
            System.out.println("Biblioteca Z");
        }
    }
}
