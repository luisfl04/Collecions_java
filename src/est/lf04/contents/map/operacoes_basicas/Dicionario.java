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
        public String removerPalavra(String palavra_a_ser_removida){
            /* Explicação do método -> É criado uma variável que recebe o valor da palavra a ser removida caso ela exista, e em seguida essa
             * palavra é removida do conjunto de valores.
            */

            String palavra_removida = null;

            if(dicionario_basico.isEmpty()){
                System.out.println("O dicionário está vazio!!!");
            }
            else{
                palavra_removida = palavra_a_ser_removida;

                if(palavra_removida == null){
                    System.out.println("A palavra inserida não está presente no dicionário");
                }
                else{
                    dicionario_basico.remove(palavra_removida);
                    System.out.println("A remoção do termo foi executada com êxito!");
                }
            }

            return palavra_removida;
        }








}
