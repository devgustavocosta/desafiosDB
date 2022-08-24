package questao5;

public class Viagem {

    /* Imagine que você é uma pessoa capitã de um barco e você precisa calcular se a sua
    viagem será bem sucedida. Você tem dois parâmetros numéricos inteiros, ouro e
    piratas. Você terá sucesso na viagem se a quantidade de ouro for maior que a
    quantidade de piratas. Mas se a soma de ouro e piratas for maior que 100, o navio
    afunda. Retorne true se a viagem tiver sucesso e false se falhar. */


    public boolean viagem (int ouro, int pirata){
        if (ouro > pirata && ouro + pirata < 100) {
            return true;
        }
        return false;
    }
}
