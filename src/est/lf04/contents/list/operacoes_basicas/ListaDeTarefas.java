package est.lf04.contents.list.operacoes_basicas;

// Importações nescessárias:
import java.util.List;
import java.util.ArrayList;


public class ListaDeTarefas {
    
    // Atributo da classe, que é uma lista.
    List<Tarefa> lista_de_tarefas; 

    // Construtor. Cria uma lista vazia quando for instanciado.
    public ListaDeTarefas(){
        this.lista_de_tarefas = new ArrayList<>();
    }

    // Métodos de manipulação da lista:
        
        public void adicionarTarefa(String tarefa_para_adicionar){
            // Explicação do método -> Adiciona na lista uma tarefa a partir da criação de um novo objeto da classe 'Tarefa'.
            
            lista_de_tarefas.add(new Tarefa(tarefa_para_adicionar));
        }   

        public void removerTarefa(String tarefa_para_remover){
            /*  Explicação do método -> Cria uma lista vazia onde será armazenada todas as tarefas que coincidirem com a tarefa que foi passada
            como parâmetro, apoś isso, remove todas essas ocorrências. 
            */  
        
            if(lista_de_tarefas.isEmpty()){
                System.out.println("A lista de tarefas está vazia!");
            }
            else{
                List<Tarefa> tarefas_para_serem_removidas = new ArrayList<>();
                
                for(Tarefa tarefa_comparada : lista_de_tarefas){
                    
                    if(tarefa_comparada.getTarefa().equalsIgnoreCase(tarefa_para_remover)){
                        tarefas_para_serem_removidas.add(tarefa_comparada);
                    }
                }
            
                lista_de_tarefas.removeAll(tarefas_para_serem_removidas);
            }   
        }   

        public int obterNumeroTotalDeTarefas(){
            // Explicação do método -> Usa 'size' para retornar o número de tarefas da lista.
            
            return lista_de_tarefas.size();
        }   

        public void obterDescricoesTarefas(){
            // Explicação do método -> Verifica se há tarefas na lista e printa as mesmas.
            
            if(lista_de_tarefas.isEmpty()){
                System.out.println("Lista vazia!!");
            }
            else{
                System.out.println("Tarefa -> " + lista_de_tarefas);
            }
        }       
        
    }
