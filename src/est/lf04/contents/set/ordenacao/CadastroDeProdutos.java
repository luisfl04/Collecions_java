package est.lf04.contents.set.ordenacao;

// Imports:
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class CadastroDeProdutos {
    
    // Att:
    private Set<Produto> conjunto_de_produtos;

    // Constructor:
    public CadastroDeProdutos(){
        this.conjunto_de_produtos = new HashSet<>();
    }

    // Métodos que manipulam o conjunto de objetos 'Produto':

        // Adição de produtos:
        public void adicionarProduto(String nome_inserido, long codigo_inserido, double preco_inserido, int quantidade_inserida){
            conjunto_de_produtos.add(new Produto(nome_inserido, codigo_inserido, preco_inserido, quantidade_inserida));
        }

        // Ordenar e exibir produtos por preço:
        public void exibirProdutosPorPreco(){
            Collections.synchronizedSet(conjunto_de_produtos);


        }








}
