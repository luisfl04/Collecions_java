package est.lf04.contents.set.ordenacao;

// Imports:
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;


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
        public Set<Produto> exibirProdutosPorPreco(){
            /*Explicação do método -> É criada um novo 'conjunto' com o construtor 'TreeSet()', onde é passado o set como parâmetro do construtor.
             * Dessa maneira o conjunto criado já recebe os valores ordenados conforme a implementação do método 'compareTo' feito no objeto 'Produto'.
            */

            Set<Produto> conjunto_de_produtos_por_preco = new TreeSet<>(conjunto_de_produtos);

            if(conjunto_de_produtos.isEmpty()){
                System.out.println("O conjunto está vazio!");
            }
            else{
                System.out.println("Produtos ordenados por preço:\n" + conjunto_de_produtos_por_preco);
            }

            return conjunto_de_produtos_por_preco;
        }

        // Ordena e exibe os produtos por ordem alfabética:
        public Set<Produto> exibirProdutosPorNome(){    
            /*Explicação do método -> Basicamente é a mesma implementação usada no método acima. Só muda que agora é passado o construtor da classe que implementa 
            'Comparator' no arquivo 'Produto.java'.
            */

            Set<Produto> conjunto_de_produtos_por_nome = new TreeSet<>(new CompararProdutoPorNome());

            if(conjunto_de_produtos.isEmpty()){
                System.out.println("O conjunto está vazio!!");
            }
            else{
                conjunto_de_produtos_por_nome.addAll(conjunto_de_produtos);
                System.out.println("Conjunto de Produtos ordenados por orde m alfabética:\n" + conjunto_de_produtos_por_nome);
            }

            return conjunto_de_produtos_por_nome;
        }
        
}
