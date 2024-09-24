package est.lf04.contents.list.operacoes_basicas;

// Importações nescessárias:
import java.util.List;
import java.util.ArrayList;


public class CarrinhoDeCompras {
    
    // Atributo, que é uma lista.
    private List<ItemDoCarrinho> carrinho_de_compras;

    // Construtor, que inicia a lista vazia.
    public CarrinhoDeCompras(){
        carrinho_de_compras = new ArrayList<>(); 
    }

    // Manipulando 'carrinho de compras':

    public void adicionarItem(String nome_passado, double preco_passado, int quantidade_passada){
        // Explicação do método -> Adiciona um novo 'produto' a lista 'carrinho de compras' com os valores passados nos parâmetros:

        ItemDoCarrinho produto_para_adicionar = new ItemDoCarrinho(nome_passado, preco_passado, quantidade_passada);
        carrinho_de_compras.add(produto_para_adicionar);
    }

    public void removerItem(String nome_para_remover){
        // Explicação do método -> Obtém um valor por parâmetro e verifica se ele é igual à valores que estão na lista e os deleta.

        if(carrinho_de_compras.isEmpty()){
            System.out.println("O carrinho está vazio!!");
        }
        else{
            for(ItemDoCarrinho produto_comparado : carrinho_de_compras){
                if(produto_comparado.getNomeDoProduto().equalsIgnoreCase(nome_para_remover)){
                    carrinho_de_compras.remove(produto_comparado);
                }
            }
        }
    }

    public double calcularValorTotal(){
        /* Explicação do método -> Será obtido o valor do produto de cada item do carrinho e esse valor será multiplicado pela sua quantidade.
         Após isso, o valor obtido será incrementado a variável 'valor_total_do_carrinho'.
        */

        double valor_total_do_carrinho = 0.0;

        if(carrinho_de_compras.isEmpty()){
            System.out.println("Carinho vazio!");
        }
        else{
            for(ItemDoCarrinho item_comparado : carrinho_de_compras){
                
                double preco_do_produto = item_comparado.getPrecoDoProduto();
                int quantidade_do_produto = item_comparado.getQuantidadeDeProdutos();
                
                double valor_multiplicado = preco_do_produto * quantidade_do_produto;
                valor_total_do_carrinho = valor_total_do_carrinho + valor_multiplicado; 
            }   
        
        }

        return valor_total_do_carrinho;
    }
    
    public void exibirItens(){
        // Explicação do método -> Itera sobre todos os produtos da lista e os imprime.

        System.out.println("Lista de produtos:");
        for(ItemDoCarrinho item_atual : carrinho_de_compras){
            System.out.println("Nome -> " + item_atual.getNomeDoProduto() + " Preço R$" + item_atual.getPrecoDoProduto() + " Quantidade -> " + 
            item_atual.getQuantidadeDeProdutos());
        }
    }


    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.toString();


    }

}
