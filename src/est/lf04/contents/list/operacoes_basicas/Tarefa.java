package est.lf04.contents.list.operacoes_basicas;

public class Tarefa {
    
    // Atributo de descrição da tarefa:
    private String descricao_tarefa;

    // Construtor que obtém uma tarefa sempre que é a classe é instanciada:
    public Tarefa(String descricao_passada){
        this.descricao_tarefa = descricao_passada;
    }

    // Método 'get':
    public String getTarefa(){
        return descricao_tarefa;
    }

    // Método 'toString()' para retornar todos os atributos relacionados a classe:
    public String toString(){
        return descricao_tarefa;
    }

}
