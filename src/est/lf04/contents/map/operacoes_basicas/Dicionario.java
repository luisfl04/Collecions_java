package est.lf04.contents.map.operacoes_basicas;

// Imports:
import java.util.Map;
import java.util.HashMap;


public class Dicionario {
    
    // Att: 
    private Map<String, String> dicionario_basico;

    // Constructor:
    public Dicionario(){
        this.dicionario_basico = new HashMap<>();
    }

    // Métodos de manipulação do dicionário:
    
        // Adicionar valores:
        public void adicionarPalavra(String palavra_a_ser_adicionada, String significado_da_palavra){
            dicionario_basico.put(palavra_a_ser_adicionada, significado_da_palavra);
        }

        // remoção de valores:
        public void removerPalavra(String palavra_a_ser_removida){
            /* Explicação do método -> É criado uma variável que recebe o valor da palavra a ser removida caso ela exista, e em seguida essa
             * palavra é removida do conjunto de valores.
            */

            String palavra_removida = null;

            if(dicionario_basico.isEmpty()){
                System.out.println("O dicionário está vazio!!!");
            }
            else{
                palavra_removida = dicionario_basico.get(palavra_a_ser_removida);

                if(palavra_removida == null){
                    System.out.println("A palavra inserida não está presente no dicionário");
                }
                else{
                    dicionario_basico.remove(palavra_a_ser_removida);
                    System.out.println("A remoção do termo foi executada com êxito!");
                }
            }

        }

        // Exibição de palavras:
        public void exibirPalavras(){
            if(dicionario_basico.isEmpty()){
                System.out.println("O dicionário está vazio!");
            }
            else{
                System.out.println("Dicionário de palavras: \n" + dicionario_basico);
            }
        }

        // Pesquisar significado de uma palavra:
        public String pesquisarPorPalavra(String palavra_pesquisada){
            /* Mesma implementação do método de remover palavra, dessa vez a palavra sera exibida e retornada junto com o significado */

            // Váriavel que será retornada com o valor:
            String palavra_retornada = null;

            if(dicionario_basico.isEmpty()){
                System.out.println("O dicionário está vazio!!!");
            }
            else{
                palavra_retornada = dicionario_basico.get(palavra_pesquisada);

                if(palavra_retornada == null){
                    System.out.println("A palavra inserida não está presente no dicionáorio!");
                }
                else{
                    System.out.println("Significado da palavra " + palavra_pesquisada + ":\n" + palavra_retornada);
                }

            }
            
            return palavra_retornada;
        }


        public static void main(String[] args) {
            
            Dicionario meu_dicionario = new Dicionario();


            meu_dicionario.adicionarPalavra("Arroz", "Comida amplamente consumida no Brazil");
            meu_dicionario.adicionarPalavra("Copo", "Local onde geralmente é armazenado bebidas");
            meu_dicionario.adicionarPalavra("Amar", "Ato de amar, demonstrar carinho, se compadecer do próximo");


            meu_dicionario.removerPalavra("Arroz");

            meu_dicionario.exibirPalavras();

            meu_dicionario.pesquisarPorPalavra("Copo");

        }



}
