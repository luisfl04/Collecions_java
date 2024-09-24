package est.lf04.contents.list.operacoes_basicas;

public class ItemDoCarrinho {
    
    // Atributos da classe:
    private String nome_do_produto;
    private double preco_do_produto;
    private int quantidade_de_produtos;

    // Construtor que cria um novo produto:
    public ItemDoCarrinho(String nome_informado, double preco_informado, int quantidade_informada){
        this.nome_do_produto = nome_informado;
        this.preco_do_produto = preco_informado;
        this.quantidade_de_produtos = quantidade_informada;
    }

    // Métodos 'get' de cada atributo:
    public String getNomeDoProduto(){
        return nome_do_produto;
    }    

    public double getPrecoDoProduto(){
        return preco_do_produto;
    }

    public int getQuantidadeDeProdutos(){
        return quantidade_de_produtos;
    }

    // Método 'toString()':
    public String toString(){
        return "Item -> Nome: " + nome_do_produto +
        " Preco: R$" + preco_do_produto +
        " Quantidade: " + quantidade_de_produtos;
    }

}  
