package questao1;

import java.util.ArrayList;

public class Soma {

    /* Dada uma lista de números, retorne a soma de todos os números. */

    public static ArrayList<Integer> listaNumeros(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        return list;
    }
    public static void main(String[] args) {
        int soma = 0;

        for(int numeros : listaNumeros()){
            soma += numeros;
        }
        System.out.println(soma);
    }
}
