package est.lf04.contents.set.pesquisa;


public class Tarefa {

    // Att:
    private String descricao_da_tarefa;
    private boolean tarefa_concluida = false; // receberá o valor 'false' como padrão.

    // Constructor:
    public Tarefa(String descricao_inserida){
        this.descricao_da_tarefa = descricao_inserida;
    }

    // Métodos get:
    public String getDescricao_da_tarefa() {
        return descricao_da_tarefa;
    }

    public boolean getTarefa_concluida() {
        return tarefa_concluida;
    }   

    // Métodos set:
    public void setTarefaConcluida(boolean valor_definido){
        this.tarefa_concluida = valor_definido;
    }

    // 'toString':
    public String toString(){
        return "Descrição da tarefa -> " + descricao_da_tarefa +
        " --- Está concluida? " + tarefa_concluida + "\n";
    }




}
