package questao5;

public class Viagem {
    public boolean viagem (int ouro, int pirata){
        if (ouro + pirata == 100) {
            return false;
        }
        if (ouro > pirata){
            return true;
        }
        return false;
    }
}
