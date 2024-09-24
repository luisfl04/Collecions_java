package est.lf04.contents.set.pesquisa; 

// Imports:
import java.util.Set;   
import java.util.HashSet;


public class ListaDeTarefas{

    // Att(Lista vazia):
    private Set<Tarefa> conjunto_de_tarefas;

    // Constructor:
    public ListaDeTarefas(){
        this.conjunto_de_tarefas = new HashSet<>();
    }

    // Métodos que manipulam o conjunto:

        // Adição de tarefa:
        public void adicionarTarefa(String descricao_da_nova_tarefa){
            conjunto_de_tarefas.add(new Tarefa(descricao_da_nova_tarefa));
        }

        // Remoção de tarefa:
        public void removerTarefa(String descricao_da_tarefa_a_ser_removida){
            boolean tarefa_a_ser_removida_esta_presente = false;

            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("O conjunto está vazio!!!");
            }
            else{
                for(Tarefa tarefa_comparada : conjunto_de_tarefas){
                    if(tarefa_comparada.getDescricao_da_tarefa().equalsIgnoreCase(descricao_da_tarefa_a_ser_removida)){
                        tarefa_a_ser_removida_esta_presente = true;
                        conjunto_de_tarefas.remove(tarefa_comparada);
                        break;
                    }
                }
            }

            if(!tarefa_a_ser_removida_esta_presente){
                System.out.println("A tarefa que você tentou remover não está presente no conjunto");
            }
        }

        // Exibição de todas as tarefas da conjunto:    
        public void exibirTarefas(){
            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("O set está vazio.");
            }
            else{
                System.out.println(conjunto_de_tarefas);
            }
            
        }

        // Contar valor total de tarefas contidas:
        public int contarTarefas(){
            int numero_de_tarefas = conjunto_de_tarefas.size();
            
            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("Não é possível obter o numero de tarefas pois o cnjunto está vazio.");
            }
            else{
                System.out.println("Numero de tarefas do conjunto -> " + numero_de_tarefas);
            }
            return numero_de_tarefas;
        }   

        // Obter um conjunto com as tarefas concluidas:
        public Set<Tarefa> obterTarefasConcluidas(){

            Set<Tarefa> conjunto_de_tarefas_concluidas = new HashSet<>();

            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("O conjunto está vazio.");
            }
            else{
                for(Tarefa tarefa_comparada: conjunto_de_tarefas){
                    if(tarefa_comparada.getTarefa_concluida() == true){
                        conjunto_de_tarefas_concluidas.add(tarefa_comparada);
                    }
                }
            }

            if(conjunto_de_tarefas_concluidas.isEmpty()){
                System.out.println("Não há nenhuma tarefa concluida no conjunto");
            }
            else{
                System.out.println("Tarefas Concluidas:\n" + conjunto_de_tarefas_concluidas);
            }   
            
            return conjunto_de_tarefas_concluidas;
        }

        // Obter as tarefas pendentes:
        public Set<Tarefa> obterTarefasPendentes(){

            Set<Tarefa> conjunto_de_tarefas_pendentes = new HashSet<>();

            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("O conjunto está vazio.");
            }
            else{
                for(Tarefa tarefa_comparada: conjunto_de_tarefas){
                    if(tarefa_comparada.getTarefa_concluida() == false){
                        conjunto_de_tarefas_pendentes.add(tarefa_comparada);
                    }
                }
            }

            if(conjunto_de_tarefas_pendentes.isEmpty()){
                System.out.println("Não há nenhuma tarefa pendente no conjunto");
            }
            else{
                System.out.println("Tarefas com status pendente:\n" + conjunto_de_tarefas_pendentes);
            }   
            
            return conjunto_de_tarefas_pendentes;
        }

        // Marcar tarefa com concluída:
        public void marcarTarefaComoConcluida(String descricao_da_tarefa_para_marcar){

            Tarefa tarefa_que_combina_com_a_descricao = null;

            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("O conjunto de tarefas está vazio, portanto, não há tarefas para marcar.");
            }
            else{
                for(Tarefa tarefa_comparada : conjunto_de_tarefas){
                    if(tarefa_comparada.getDescricao_da_tarefa().equalsIgnoreCase(descricao_da_tarefa_para_marcar)){
                        if(tarefa_comparada.getTarefa_concluida() == true){
                            System.out.println("A tarefa já está marcada como concluída!");
                        }
                        else{
                            tarefa_que_combina_com_a_descricao = tarefa_comparada;
                            tarefa_comparada.setTarefaConcluida(true);
                        }
                    }
                }
            
                if(tarefa_que_combina_com_a_descricao == null){
                    System.out.println("A tarefa que você está tentando marcar não corresponde a nenhuma tarefa no conjunto.");
                }
                
            }

        }

        // Marcar tarefa como pendente:
        public void marcarTarefaComoPendente(String descricao_da_tarefa_para_marcar){

            Tarefa tarefa_que_combina_com_a_descricao = null;

            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("O conjunto de tarefas está vazio, portanto, não há tarefas para marcar.");
            }
            else{
                for(Tarefa tarefa_comparada : conjunto_de_tarefas){
                    if(tarefa_comparada.getDescricao_da_tarefa().equalsIgnoreCase(descricao_da_tarefa_para_marcar)){
                        if(tarefa_comparada.getTarefa_concluida() == false){
                            System.out.println("A tarefa passada já está marcada como pendente");
                        }
                        else{
                            tarefa_que_combina_com_a_descricao = tarefa_comparada;
                            tarefa_comparada.setTarefaConcluida(false);
                        }
                    }
                }
            
                if(tarefa_que_combina_com_a_descricao == null){
                    System.out.println("A tarefa passada não corresponde a nenhum valor no conjunto.");
                }
            }

        }

        // Remover todas as tarefas da lista:
        public void limparConjuntoDeTarefas(){
            if(conjunto_de_tarefas.isEmpty()){
                System.out.println("Não há como limpar o conjunto de tarefas pois ele já está vazio.");
            }
            else{
                Set<Tarefa> todas_as_tarefas = new HashSet<>();
                
                for(Tarefa tarefa_iterada : conjunto_de_tarefas){
                    todas_as_tarefas.add(tarefa_iterada);
                }
            
                conjunto_de_tarefas.removeAll(todas_as_tarefas);
            }
        }

}
