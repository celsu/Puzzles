import java.util.HashMap;

public class Main3 {
    //HASMAP

    public static void main(String[] args) {
        // Suponha que você tenha um array de datas
        String[] datas = {"2023-01-15", "2023-02-20", "2023-01-05", "2023-03-10", "2023-02-12"};

        // Crie um HashMap para armazenar os meses como chave e a contagem como valor
        HashMap<String, Integer> mesesContagem = new HashMap<>();

        // Itere sobre as datas e conte os meses usando o HashMap
        for (String data : datas) {
            String mes = data.split("-")[1]; // Obtém o mês a partir da data

            // Verifica se o mês já existe no HashMap, se sim, incrementa a contagem
            if (mesesContagem.containsKey(mes)) {
                int contagem = mesesContagem.get(mes);
                mesesContagem.put(mes, contagem + 1);
            } else {
                // Se o mês não existe, insere no HashMap com contagem 1
                mesesContagem.put(mes, 1);
            }
        }

        // Exibe a contagem de repetições de cada mês
        for (String mes : mesesContagem.keySet()) {
            int contagem = mesesContagem.get(mes);
            System.out.println("Mês " + mes + ": " + contagem + " vezes");
        }
    }


}
