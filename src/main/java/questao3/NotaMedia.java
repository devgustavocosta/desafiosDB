package questao3;

import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Fiz o código retornar a média de acordo com os valores que o usuário colocar
        System.out.println("Bem vindo!");
        System.out.println("---------------------------------");

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double calculo = (nota1 + nota2 + nota3) / 3;

        System.out.println("---------------------------------");
        System.out.println("Sua nota foi: " + calculo);

        System.out.println("---------------------------------");
        if (calculo < 7){
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno aprovado");
        }
    }
}
