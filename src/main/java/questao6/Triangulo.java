package questao6;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Fiz o código retornar quantas linhas o usuário decidir

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = entrada.nextInt();

        for (int i = 1; i <= linhas; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
