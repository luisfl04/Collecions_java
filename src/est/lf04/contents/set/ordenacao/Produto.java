package est.lf04.contents.set.ordenacao;

// Imports:
import java.util.Comparator;
import java.lang.Comparable;

public class Produto implements Comparable<Produto>{

    // Atributos:
    private String nome_do_produto;
    private long codigo_do_produto;
    private double preco_do_produto;
    private int quantidade_de_produtos;

    // Constructor:
    public Produto(String nome_do_produto, long codigo_do_produto, double preco_do_produto, int quantidade_de_produtos) {
        this.nome_do_produto = nome_do_produto;
        this.codigo_do_produto = codigo_do_produto;
        this.preco_do_produto = preco_do_produto;
        this.quantidade_de_produtos = quantidade_de_produtos;
    }

    // Métodos get:
    public String getNomeDoProduto(){
        return nome_do_produto;
    }

    public double getPrecoDoProduto(){
        return preco_do_produto;
    }
    
    // método padrão de comparação:
    public int compareTo(Produto produto_testado){
        return Double.compare(preco_do_produto, produto_testado.getPrecoDoProduto());
    } 

    // 'toString()':
    public String toString(){
        return "Nome do Produto: " + nome_do_produto + 
        " - Código: " + codigo_do_produto + 
        " - Preço: " + preco_do_produto + 
        " - Quantidade: " + quantidade_de_produtos + "\n"; 
    }

}

class CompararProdutoPorNome implements Comparator<Produto>{






}
