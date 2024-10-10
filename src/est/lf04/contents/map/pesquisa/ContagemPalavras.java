package est.lf04.contents.map.pesquisa;

// Imports:
import java.util.Map;
import java.util.HashMap;


public class ContagemPalavras {

    // Att:
    private Map<String, Integer> conjunto_de_palavras;

    // Constructor:
    public ContagemPalavras(){
        this.conjunto_de_palavras = new HashMap<>();
    }

    // Manipulação do conjunto:

        // Adição de palavras:
        public void adicionarPalavra(String palavra_inserida, Integer contagem_da_palavra){
            conjunto_de_palavras.put(palavra_inserida, contagem_da_palavra);
        }

        // Remoção de uma palavra:
        public void removerPalavra(String palavra_a_ser_removida){
            if(conjunto_de_palavras.isEmpty()){
                System.out.println("O map está vazio!!!");
            }
            else{
                conjunto_de_palavras.remove(palavra_a_ser_removida);
            }
        }

        public int exibirContagemPalavras(){
            /* Explicação do método -> Uma variável receberá a iteração de todos os valores de contagem das palavras. Depois, é exibido o
            * número total das contagens.
            */

            int contagem_de_todas_as_palavras = 0;

            if(conjunto_de_palavras.isEmpty()){
                System.out.println("O map está vazio!!!");
            }
            else{
                for(int contagem_da_palavra_atual : conjunto_de_palavras.values()){
                    contagem_de_todas_as_palavras = contagem_de_todas_as_palavras + contagem_da_palavra_atual;
                }
            }

            // Exibição:
            System.out.println("Contagem total das ocorrências de todas as palavras -> " + contagem_de_todas_as_palavras + "\nPalavras -> " + conjunto_de_palavras);

            return contagem_de_todas_as_palavras;
        }

        // Encontrar a palavra que mais aparece:
        public String encontrarPalavraMaisFrequente(){
            /* Será usada a classe 'Entry' de Map para ser possível obter o valor da palavra que aparece mais no conjunto,
               tendo em vista que esse valor é a chave do map.
            */

            // Variável que receberá o valor e será retornada e variável que controla os valores de contagem de cada palavra:
            String palavra_com_mais_frequencia = null; 
            int valor_de_maior_frequencia = 0;

            if(conjunto_de_palavras.isEmpty()){
                System.out.println("O map está vazio!!!");
            }
            else{
                
                for(Map.Entry<String, Integer> obter_valores : conjunto_de_palavras.entrySet()){
                    if(obter_valores.getValue() > valor_de_maior_frequencia){
                        valor_de_maior_frequencia = obter_valores.getValue();
                        palavra_com_mais_frequencia = obter_valores.getKey();
                    }
                }
            }

            // Exibição:
            System.out.println("Palavra com mais frequência -> " + palavra_com_mais_frequencia + "\nNumero de aparições -> " + valor_de_maior_frequencia);

            return palavra_com_mais_frequencia;
        }       

        
}
