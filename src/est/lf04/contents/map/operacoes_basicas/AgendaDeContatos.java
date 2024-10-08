package est.lf04.contents.map.operacoes_basicas;

// Imports:
import java.util.Map;
import java.util.HashMap;


public class AgendaDeContatos {
    
    // att:
    private Map<String, Integer> agenda_de_contatos;

    // constructor:
    public AgendaDeContatos(){
        this.agenda_de_contatos = new HashMap<>();
    }

    // Métodos de manipulação do map:

        // Adição de valores:
        public void adicionarContatos(String nome_do_contato, Integer numero_de_contato){
            agenda_de_contatos.put(nome_do_contato, numero_de_contato);
        }

        // Remoção do contato:
        public void removerContato(String nome_do_contato_a_ser_removido){
            /* Explicação do método -> É removido um valor do map com base no valor chave, que é o nome do contato */

            if(agenda_de_contatos.isEmpty()){
                System.out.println("O map está vazio!!!");
            }
            else{
                agenda_de_contatos.remove(nome_do_contato_a_ser_removido);
            }
        
        }

        // Exibir os valores:
        public void exibirContatos(){
            if(agenda_de_contatos.isEmpty()){
                System.out.println("O map está vazio!!!");
            }
            else{
                System.out.println(agenda_de_contatos);
            }
        }

        // Obter um número de contato a partir da pesquida por nome:
        public Integer pesquisarContatoPorNome(String nome_do_contato_pesquisado){
            /* Explicação do método -> É obtido um numero de contato que corresponda ao valor do parâmetro passado utilizando 
             * o método 'get()'.
            */

            // Variável que reberá o valor do número obtido a partir da pesquisa:
            Integer numero_obtido_pelo_nome = null;

            if(agenda_de_contatos.isEmpty()){
                System.out.println("Map vazio!!!");
            }
            else{
                numero_obtido_pelo_nome = agenda_de_contatos.get(nome_do_contato_pesquisado);

                if(numero_obtido_pelo_nome == null){
                    System.out.println("Não existe nenhum contato com o nome inserido.");
                }
                else{
                    System.out.println("Numero do contato " + nome_do_contato_pesquisado +  " -> " + numero_obtido_pelo_nome);
                }
            }

            return numero_obtido_pelo_nome;
        }

}
