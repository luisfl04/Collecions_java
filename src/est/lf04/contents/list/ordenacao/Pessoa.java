package est.lf04.contents.list.ordenacao;

// Imports nescessarios:
import java.lang.Comparable;
import java.util.Comparator;


public class Pessoa implements Comparable<Pessoa> {
    // Definição da classe -> Esta classe implementa 'Comparable' para ordenar os objetos a partir do valor do atributo 'idade_da_pessoa'.

    // Atributos:
    private String nome_da_pessoa;
    private int idade_da_pessoa;
    private double altura_da_pessoa;

    // Construtor:
    public Pessoa(String nome_inserido, int idade_inserida, double altura_inserida){
        this.nome_da_pessoa = nome_inserido;
        this.idade_da_pessoa = idade_inserida;
        this.altura_da_pessoa = altura_inserida;
    }  

    // Método de comparação:
    @Override
    public int compareTo(Pessoa pessoa_comparada){
        return Integer.compare(idade_da_pessoa, pessoa_comparada.getIdadeDaPessoa());
    }

    // Getters dos atributos:
    public String getNomeDaPessoa(){
        return nome_da_pessoa;
    }

    public int getIdadeDaPessoa(){
        return idade_da_pessoa;
    }

    public double getAlturaDaPessoa(){
        return altura_da_pessoa;
    }

    public String toString(){
        return "nome:" + nome_da_pessoa + 
        "altura:" + altura_da_pessoa + 
        "idade:" +idade_da_pessoa;
    }

}

class CompararPorAltura implements Comparator<Pessoa>{
    /*Definição da classe -> Faz comparação de valores do atributo 'altura' da classe 'Pessoa' utilizando
     * a interface 'Comparator'.
     */

    @Override
    public int compare(Pessoa primeira_pessoa, Pessoa segunda_pessoa){
        /*Explicação do método -> Utiliza o método 'compare()' de 'Double' para fazer a comparação de valores
         * dos objetos passados por parâmetro.
         */
        
        return Double.compare(primeira_pessoa.getAlturaDaPessoa(), segunda_pessoa.getAlturaDaPessoa());
    }

}
