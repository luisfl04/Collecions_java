package est.lf04.contents.map.pesquisa;



public class Produto {

    // Atributos:
    private String nome_do_produto;
    private int quantidade_de_produtos;
    private double preco_do_produto;

    // Constructor:
    public Produto(String nome_inserido, int quantidade_de_produtos_inserida, double preco_do_produto_inserido){
        this.nome_do_produto = nome_inserido;
        this.quantidade_de_produtos = quantidade_de_produtos_inserida;
        this.preco_do_produto = preco_do_produto_inserido;
    }
    
    // Métodos get:
    public String getNome_do_produto() {
        return nome_do_produto;
    }

    public int getQuantidade_de_produtos() {
        return quantidade_de_produtos;
    }

    public double getPreco_do_produto() {
        return preco_do_produto;
    }
    
    // 'toString':
    @Override
    public String toString(){
        return "Nome do produto -> " + nome_do_produto + 
        " --- Quantidade em estoque -> " + quantidade_de_produtos + 
        " --- Preço correspondente -> R$" + preco_do_produto + "\n";
    }

}   
