package questao4;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("---------------------------------");
        System.out.print("Digite a quantidade de livros desejada: ");
        int quantidade = entrada.nextInt();

        System.out.println("---------------------------------");
        if (quantidade >= 1 && quantidade < 10){
            System.out.println("Biblioteca A");
        }
        if (quantidade >= 10 && quantidade < 20){
            System.out.println("Biblioteca B");
        }
        if (quantidade >= 20 && quantidade < 30){
            System.out.println("Biblioteca C");
        }
        if (quantidade == 0){
            System.out.println("Biblioteca Z");
        }
    }
}
