package questao3;

import java.util.Scanner;

public class NotaMedia {

    /* Dada uma lista de 3 notas, calcule a média simples e, caso a média seja maior ou
    igual a 7, retorne "Aluno aprovado :)", se for menor que 7, retorne "Aluno reprovado. */

    private double nota1;
    private double nota2;
    private double nota3;

    public double calculaMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        NotaMedia n = new NotaMedia();

        // Fiz o código retornar a média de acordo com os valores que o usuário colocar
        System.out.println("--------------- Bem vindo! ---------------\n");

        System.out.print("Digite a primeira nota: ");
        n.nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n.nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n.nota3 = entrada.nextDouble();

        System.out.println("---------------------------------");
        System.out.printf("Sua nota foi: %.1f%n", + n.calculaMedia());
        System.out.println("---------------------------------");

        if (n.calculaMedia() < 7){
            System.out.println("Aluno reprovado!");
        }
        if (n.calculaMedia() > 7){
            System.out.println("Aluno aprovado!");
        }
    }
}
