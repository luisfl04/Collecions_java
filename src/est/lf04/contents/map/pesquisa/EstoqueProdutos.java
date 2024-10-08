package est.lf04.contents.map.pesquisa;

// Imports:
import java.util.Map;
import java.util.HashMap;


public class EstoqueProdutos {
    
    // Att:
    private Map<Long, Produto> estoque_de_produtos;

    // Constructor:
    public EstoqueProdutos(){
        this.estoque_de_produtos = new HashMap<>();
    }

    // Manipulando o estoque:

        // Adicionando produtos:
        public void adicionarProduto(long codigo_inserido, String nome_inserido, int quantidade_inserida, double preco_inserido){
            estoque_de_produtos.put(codigo_inserido, new Produto(nome_inserido, quantidade_inserida, preco_inserido));
        }

        // Exibir produtos:
        public void exibirProdutos(){
            if(estoque_de_produtos.isEmpty()){
                System.out.println("O estoque está vazio!!!");
            }
            else{
                System.out.println(estoque_de_produtos);
            }
        }

        // Calcular valor total do estoque:
        public Double calcularValorTotalEmEstoque(){
            /* Explicação do método -> Será criada uma variável que irá receber o valor multiplicado da quantidade vezes o preço de cada 
             * objeto 'Produto', e essa variável será retornada.
            */
        
            double valor_total_do_estoque = 0.0; 

            if(estoque_de_produtos.isEmpty()){
                System.out.println("O estoque está vazio!!!");
            }
            else{
                double valor_total_por_produto;

                for(Produto produto_testado : estoque_de_produtos.values()){
                    valor_total_por_produto = produto_testado.getPreco_do_produto() * produto_testado.getQuantidade_de_produtos();
                    valor_total_do_estoque = valor_total_do_estoque + valor_total_por_produto;
                }

                System.out.println("Valor total do estoque -> R$" + valor_total_do_estoque);
            }

            return valor_total_do_estoque;
        }

        // Obtendo o produto mais caro do estoque:
        public Produto obterProdutoMaisCaro(){
            /* Explicação do método -> Fará a comparação dos preços de cada objeto 'Produto' para obter o produto mais caro. Inicialmente, 
            * o primeiro produto será declarado como o produto com maior preço, para que seja possível fazer a comparação com os demais.
            */

            Produto produto_mais_caro = null;
            double maior_preco = 0.0;

            if(estoque_de_produtos.isEmpty()){
                System.out.println("O estoque de proodutos está vazio!!!!");
            }
            else{   
                for(Produto produto_testado : estoque_de_produtos.values()){
                    if(produto_testado.getPreco_do_produto() > maior_preco){
                        maior_preco = produto_testado.getPreco_do_produto();
                        produto_mais_caro = produto_testado;
                    }
                }
                System.out.println("Produto mais caro do estoque:\n" + produto_mais_caro);
            }
            
            return produto_mais_caro;
        }

        // Obtendo o produto mais barato:
        public Produto obterProdutoMaisBarato(){
            /*Explicação do método -> Mesma implementação do método de produto mais caro, fazendo a comparação inversa.*/

            Produto produto_mais_barato = null;
            double menor_preco = 0.0; 

            if(estoque_de_produtos.isEmpty()){
                System.out.println("O estoque está vazio!!!");
            }
            else{
                for(Produto produto_testado : estoque_de_produtos.values()){
                    if(menor_preco == 0.0){
                        menor_preco = produto_testado.getPreco_do_produto();
                    }
                    if(produto_testado.getPreco_do_produto() < menor_preco){
                        menor_preco = produto_testado.getPreco_do_produto();
                        produto_mais_barato = produto_testado;
                    }
                    
                }

                System.out.println("Produto com menor preço:\n" + produto_mais_barato);
            }

            return produto_mais_barato;
        }

        // Obtendo o maior produto do estoque fazendo a multiplicação do seu valor pela quantidade:
        public Produto obterProdutoMaiorQuantidadeValorNoEstoque(){
            /* Explicação do método -> Será feita a multiplicação dos valores de preço e quantidade de todos os produtos e após isso feita a comparação. O objeto
            * com maior valor será armazenado e retornado.
            */

            // Variável de controle de valores usadas nas comparações:
            Produto produto_com_maior_valor_total = null;
            double preco_do_maior_produto = 0.0;

            if(estoque_de_produtos.isEmpty()){
                System.out.println("O estoque está vazio!!!");
            }
            else{   
                for(Produto produto_testado : estoque_de_produtos.values()){
                    // Variável que irá receber o valor total do produto a cada iteração:
                    double valor_total_do_produto_atual = produto_testado.getPreco_do_produto() * produto_testado.getQuantidade_de_produtos();


                    if()
                    
                }


            }

        }
        

}
