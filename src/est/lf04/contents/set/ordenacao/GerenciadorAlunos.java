package est.lf04.contents.set.ordenacao;

// Imports:
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;


public class GerenciadorAlunos{

    // Atributos:
    private Set<Aluno> conjunto_de_alunos;

    // Constructor:
    public GerenciadorAlunos(){
        conjunto_de_alunos = new HashSet<>();
    }

    // Métodos que manipulam o conjunto:

        // Adicionar alunos:
        public void adicionarAluno(String nome_inserido, long matricula_inserida, double media_inserida){
            conjunto_de_alunos.add(new Aluno(nome_inserido, matricula_inserida, media_inserida));
        }

        // Remoção de aluno:
        public Aluno removerAluno(long numero_de_matricula_do_aluno_a_ser_removido){
            /*  Explicação do método -> Será iterado e comparado os valores de numero de matricula dos objetos contidos no conjunto com o valor passado por parâmetro.
            Se for encontrado um valor igual, o objeto é removido e retornado.
            */ 

            Aluno aluno_a_ser_removido = null;

            if(conjunto_de_alunos.isEmpty()){
                System.out.println("Não há como fazer a remoção, o conjunto está vazio!!!");
            }
            else{
                for(Aluno aluno_testado : conjunto_de_alunos){
                    
                    if(aluno_testado.getNumero_de_matricula() == numero_de_matricula_do_aluno_a_ser_removido){
                        aluno_a_ser_removido = aluno_testado;
                        break;
                    }
                }
            }

            conjunto_de_alunos.remove(aluno_a_ser_removido);
            return aluno_a_ser_removido;   
        }   

        // Ordenação e exibição dos objetos por ordem alfabética: 
        public Set<Aluno> exibirAlunosPorNome(){

            Set<Aluno> conjunto_de_alunos_por_ordem_alfabetica = new TreeSet<>(conjunto_de_alunos);

            if(conjunto_de_alunos.isEmpty()){
                System.out.println("Não há valores contidos no conjunto");
            }
            else{
                System.out.println("Conjunto de alunos por ordem alfabética:\n" + conjunto_de_alunos_por_ordem_alfabetica);
            }

            return conjunto_de_alunos_por_ordem_alfabetica;
        }

        // Ordenação e exibição a partir do valor da nota do aluno:
        public Set<Aluno> exibirAlunosPorNota(){
            Set<Aluno> conjunto_de_alunos_por_valor_da_nota = new TreeSet<>(new CompararPorMediaDasNotas());

            if(conjunto_de_alunos.isEmpty()){
                System.out.println("O conjunto não possui objetos!!");
            }
            else{
                conjunto_de_alunos_por_valor_da_nota.addAll(conjunto_de_alunos);
                System.out.println("Conjunto de alunos a partir do valor da média das notas:\n" + conjunto_de_alunos_por_valor_da_nota);
            }

            return conjunto_de_alunos_por_valor_da_nota;
        } 

        // Exibir todos os alunos sem nenhuma ordenação:
        public void exibirAlunos(){
            System.out.println("Conjunto de alunos:\n" + conjunto_de_alunos);
        }

}