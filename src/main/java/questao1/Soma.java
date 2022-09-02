package questao1;

import java.util.ArrayList;

public class Soma {

    /* Dada uma lista de números, retorne a soma de todos os números. */

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
        int soma = 0;

        for(int numeros : listaNumeros()){
            soma += numeros;
        }
        System.out.println(soma);
    }
}
