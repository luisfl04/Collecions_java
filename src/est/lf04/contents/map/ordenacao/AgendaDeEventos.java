package est.lf04.contents.map.ordenacao;

// imports:
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
import java.util.HashMap;


public class AgendaDeEventos {

    // Att:
    private Map<LocalDate, Evento> agenda_de_eventos;

    // Constructor:
    public AgendaDeEventos(){
        this.agenda_de_eventos = new HashMap<>();
    }

    // Métodos de manipulação da agenda:

        // Adicionar evento:
        public void adicionarEvento(LocalDate data_do_evento_inserida, String nome_do_evento_inserido, String atracao_do_evento_inserida){
            agenda_de_eventos.put(data_do_evento_inserida, new Evento(nome_do_evento_inserido, atracao_do_evento_inserida));
        }   

        // Exibir eventos em ordem crescente de data:
        public void exibirAgenda(){
            /* Explicação do método -> É criada um novo 'treeMap' que receberá os valor do hashMap. Com isso, o treeMap já recebe os valores ordenados. */
        
            Map<LocalDate, Evento> tree_agenda_de_eventos = new TreeMap<>(agenda_de_eventos); 
            
            for(Map.Entry<LocalDate, Evento> obter_valores_da_agenda : tree_agenda_de_eventos.entrySet()){
                LocalDate data_do_evento = obter_valores_da_agenda.getKey();
                Evento evento_atual = obter_valores_da_agenda.getValue();
            
                // Exibição dos valores:
                System.out.println("Data do evento -> " + data_do_evento + " --- Nome do evento -> " + evento_atual.getNomeDoEvento() + " --- Descrição da atracão -> " +
                evento_atual.getAtracaoDoEvento());
            }

        }

        // Obter o próximo evento com base na data atual:
        public Evento obterProximoEvento(){
            /* Explicação do método -> É criada uma variável que receberá a data atual, e com base nisso é verificado o primeiro evento encontrado após essa data. Se não for 
             * encontrado, é declarado que não há eventos futuros.
            */

            // Variáveis para comparação, atribuição e controle dos valores:
            LocalDate data_atual = LocalDate.now();
            LocalDate data_do_proximo_evento = null;
            Evento proximo_evento = null;

            // Ordenando os valores antes da comparação com 'treeMap':
            Map<LocalDate, Evento> tree_agenda_de_eventos = new TreeMap<>(agenda_de_eventos);

            // Comparando as datas:
            for(Map.Entry<LocalDate, Evento> obter_valores_para_comparar : tree_agenda_de_eventos.entrySet()){
                LocalDate data_do_evento_atual = obter_valores_para_comparar.getKey();
            
                if(data_do_evento_atual.isEqual(data_atual) || data_do_evento_atual.isAfter(data_atual)){
                    data_do_proximo_evento = data_do_evento_atual;
                    proximo_evento = obter_valores_para_comparar.getValue();
                    break;
                }
            }   

            // Exibiçaõ do próximo evento(caso exista):
            if(proximo_evento == null){
                System.out.println("Não há eventos futuros marcados na agenda.");
            }
            else{
                System.out.println("O proximo evento é -> " + proximo_evento.getNomeDoEvento() + " com a atração -> " + proximo_evento.getAtracaoDoEvento() + "\nSua data correspondente: " + 
                data_do_proximo_evento);
            }

            return proximo_evento;
        }


}   
