package est.lf04.contents.set.ordenacao;


// Imports nescessários:
import java.lang.Comparable;
import java.util.Comparator;


public class Aluno implements Comparable<Aluno>{
    
    // Att:
    private String nome_do_aluno;
    private long numero_de_matricula;
    private double media_das_notas;

    // Constructor:
    public Aluno(String nome_inserido, long numero_de_matricula_inserido, double media_da_notas_inserida){
        this.nome_do_aluno = nome_inserido;
        this.numero_de_matricula = numero_de_matricula_inserido;
        this.media_das_notas = media_da_notas_inserida;
    }

    // Métodos 'get':
    public String getNome_do_aluno() {
        return nome_do_aluno;
    }

    public long getNumero_de_matricula() {
        return numero_de_matricula;
    }

    public double getMedia_das_notas() {
        return media_das_notas;
    }

    // 'toString':
    @Override
    public String toString() {
        return "Nome do aluno -> " + nome_do_aluno + 
        " --- Numero de matricula -> " + numero_de_matricula + 
        " --- Media de suas notas -> " + media_das_notas + "\n";
    }

    // Método padrão de comparação:
    @Override
    public int compareTo(Aluno aluno_comparado){
        return nome_do_aluno.compareTo(aluno_comparado.getNome_do_aluno());
    }

}

class CompararPorMediaDasNotas implements Comparator<Aluno>{
    @Override
    public int compare(Aluno primeiro_aluno, Aluno segundo_aluno){
        return Double.compare(primeiro_aluno.getMedia_das_notas(), segundo_aluno.getMedia_das_notas());
    }

}
