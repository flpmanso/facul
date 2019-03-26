import br.com.manso.ContagemLetra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ContagemLetra> contagens = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            contagens.add(new ContagemLetra(ch));
        }

        String stringTeste = "ITAAALO";

        for(char c : stringTeste.toCharArray()){
            for(ContagemLetra contagem : contagens){
                if(contagem.getLetra() == c){
                    contagem.incrementarQuantidade();
                }
            }
        }

        for (ContagemLetra contagem : contagens) {
            System.out.print("Letra: " + contagem.getLetra() + " - qtde: " + contagem.getQuantidade() + " ");
        }
    }
}