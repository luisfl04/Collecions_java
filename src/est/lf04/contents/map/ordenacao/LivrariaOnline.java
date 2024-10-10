package est.lf04.contents.map.ordenacao;    

// Imports:
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LivrariaOnline{

    // Att:
    private Map<String, Livro> conjunto_de_livros;

    // Construtor:
    public LivrariaOnline(){
        this.conjunto_de_livros = new HashMap<>();
    }

    // Manipulação do conjunto de livros:

        // Adicionar valor:
        public void adicionarLivro(String link, Livro livro_inserido){
            conjunto_de_livros.put(link, livro_inserido);
        }

        // Remoção de um livro:
        public List<String> removerLivro(String titulo_do_livro_a_ser_removido){
            /* Explicação do método -> Será criada uma lista vazia que receberá os 'valores chave' dos livros que possuem o mesmo titulo comparado 
             * ao titulo passado por parâmetro. Após isso, todas as chaves contidas nessa lista serão excluidas e a lista será retornada.
            */ 

            // Lista para os valores chave:
            List<String> lista_de_valores_chave_a_serem_removidos = new ArrayList<>();

            if(conjunto_de_livros.isEmpty()){
                System.out.println("O map está vazio!!");
            }
            else{
                for(Map.Entry<String, Livro> obter_valores_do_conjunto_de_livros : conjunto_de_livros.entrySet()){
                    if(obter_valores_do_conjunto_de_livros.getValue().getTitulo_do_livro().equalsIgnoreCase(titulo_do_livro_a_ser_removido)){
                        lista_de_valores_chave_a_serem_removidos.add(obter_valores_do_conjunto_de_livros.getKey());
                    }
                }
            }

            // Após iterar sobre todos os valores, removo os que foram adicionados a lista:
            if(lista_de_valores_chave_a_serem_removidos.isEmpty()){
                System.out.println("O titulo -> " + titulo_do_livro_a_ser_removido + ", não está presente no conjunto de livros");
            }
            else{
                for(String valor_chave_atual : lista_de_valores_chave_a_serem_removidos){
                    conjunto_de_livros.remove(valor_chave_atual);
                }
            }

            return lista_de_valores_chave_a_serem_removidos;
        }

        // Exibindo os livros da livraria em ordem crescente a partir do preço:
        public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
            /* Explicação do método ->  Será criada uma lista com os valores dos livros que será ordenada a partir do comparador criado na classe 'Livro',
            * então após isso os valores dessa lista ordenada serão adicionados à um novo Map. Esse Map sera exibido e retornado . 
            */

            Map<String, Livro> conjunto_de_livros_ordenados_por_preco = new LinkedHashMap<>();


            if(conjunto_de_livros.isEmpty()){
                System.out.println("O conjunto de livros está vazio!!");
            }
            else{
                // criando lista:
                List<Map.Entry<String, Livro>> conjunto_de_livros_para_serem_ordenados_por_preco = new ArrayList<>(conjunto_de_livros.entrySet());

                // ordenando seus valores:
                Collections.sort(conjunto_de_livros_para_serem_ordenados_por_preco, new CompararPorPreco());

                // Adicionando os valores ordenados ao map que será retornado:
                for(Map.Entry<String, Livro> obter_valor_do_livro_atual : conjunto_de_livros_para_serem_ordenados_por_preco){
                    conjunto_de_livros_ordenados_por_preco.put(obter_valor_do_livro_atual.getKey(), obter_valor_do_livro_atual.getValue());
                }

            }

            // exibição e retorno dos valores:
            System.out.println("Conjunto de livros ordenados por preço:\n" + conjunto_de_livros_ordenados_por_preco);
            return conjunto_de_livros_ordenados_por_preco;
        }

        // Exibição de livros ordenados por nome do autor:
        public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
            /* Explicação do método -> Basicamente é a mesma implementação usada no método de ordenação por preço, só que dessa vez para o 
             * o valor de nome do autor.
            */

            // Map que receberá os valores dos livros ordenados por nome:
            Map<String, Livro> conjunto_de_livros_ordenados_pelo_nome_do_autor = new LinkedHashMap<>(); 

            // Verificação de map vazio e implementação:
            if(conjunto_de_livros.isEmpty()){
                System.out.println("O conjunto de livros está vazio!!");
            }
            else{
                // Lista que receberá os valores ordenados por nome:
                List<Map.Entry<String, Livro>> conjunto_de_livros_para_serem_ordenados_pelo_nome_do_autor = new ArrayList<>(conjunto_de_livros.entrySet());

                // Ordenando a lista:
                Collections.sort(conjunto_de_livros_para_serem_ordenados_pelo_nome_do_autor, new CompararPorNomeDoAutor());

                // Atribuindo os valores ordenados ao map que será retornado:
                for(Map.Entry<String, Livro> livro_atual : conjunto_de_livros.entrySet()){
                    conjunto_de_livros_ordenados_pelo_nome_do_autor.put(livro_atual.getKey(), livro_atual.getValue());
                }
            }   

            // Exibição e retorno dos valores ordenados:
            System.out.println("Conjunto dos livros ordenados por nome do autor:\n" + conjunto_de_livros_ordenados_pelo_nome_do_autor);
            return conjunto_de_livros_ordenados_pelo_nome_do_autor;
        }


        // Fazer pesquisa de livros com base no nome do autor:
        public Map<String, Livro> pesquisarLivrosPorAutor(String nome_do_autor_pesquisado){
            /* Explicação do método -> Será criado um novo map que armazenará os valores dos livros que combinarem com o nome do autor passado
             * por parâmetro. Esse novo map será retornado.
            */

            // Map que armazenará os valores e será retornado:
            Map<String, Livro> livros_encontrados_por_autor = new LinkedHashMap<>();

            if(conjunto_de_livros.isEmpty()){
                System.out.println("O conjunto de livros está vazio!!!");
            }
            else{
                for(Map.Entry<String, Livro> livro_atual_testado : conjunto_de_livros.entrySet()){
                    if(livro_atual_testado.getValue().getAutor_do_titulo().equals(nome_do_autor_pesquisado)){
                        livros_encontrados_por_autor.put(livro_atual_testado.getKey(), livro_atual_testado.getValue());
                    }
                }
            }

            // Exibição dos valores encontrados:
            System.out.println("Livros filtrados pelo autor " + nome_do_autor_pesquisado + ":\n" + livros_encontrados_por_autor);

            return livros_encontrados_por_autor;
        }

        // Obtendo o livro mais caro do conjunto de livros:
        public Livro obterLivroMaisCaro(){
            /* Explicação do método -> Será feita uma iteracão sobre todos os valores dos preços dos livros para obter o maior preço entre os livros.
            * Após obter esse valor, é feita uma nova iteração para verificar qual livro possúi esse valor. Assim, será obtido o livro e ele será retornado.
            */ 

            // Variável que irá receber o valor de livro mais caro e variável para controle do maior preço:
            Livro livro_com_o_preco_mais_alto = null;   
            double maior_preco_entre_os_livros = 0.0;

            // Verificando o conjunto e obtendo o preço mais alto entre os livros:
            if(conjunto_de_livros.isEmpty()){
                System.out.println("O conjunto de livros está vazio!!!");
            }
            else{
                for(Map.Entry<String, Livro> livro_atual_testado : conjunto_de_livros.entrySet()){
                    if(livro_atual_testado.getValue().getPreco_do_titulo() > maior_preco_entre_os_livros){
                        maior_preco_entre_os_livros = livro_atual_testado.getValue().getPreco_do_titulo();
                    }
                }
            }

            // Após obter o valor mais alto, será obtido o livro que possúi este valor:
            for(Map.Entry<String, Livro> livro_atual_testado : conjunto_de_livros.entrySet()){
                if(livro_atual_testado.getValue().getPreco_do_titulo() == maior_preco_entre_os_livros){
                    livro_com_o_preco_mais_alto = livro_atual_testado.getValue();
                }
            }
            
            // Exibição e retorno do valor:
            System.out.println("Livro com o maior preço:\n" + livro_com_o_preco_mais_alto);
            
            return livro_com_o_preco_mais_alto;
        }          

        // Obtenção do livro mais barato:
        public Livro obterLivroMaisBarato(){
            /*Explicação do método -> Mesma implementação do método 'obterLivroMaisCaro()', só com o valor inverso. */

            // Valores de controle e retorno:
            Livro livro_com_valor_mais_barato = null;
            double menor_preco_encontrado = Double.MAX_VALUE;

            // Obtendo menor preço:
            for(Map.Entry<String, Livro> livro_atual_testado : conjunto_de_livros.entrySet()){
                if(livro_atual_testado.getValue().getPreco_do_titulo() < menor_preco_encontrado){
                    menor_preco_encontrado = livro_atual_testado.getValue().getPreco_do_titulo();
                }
            }

            // Encontrando livro correspondente ao menor preço:
            for(Map.Entry<String, Livro> livro_atual_testado : conjunto_de_livros.entrySet()){
                if(livro_atual_testado.getValue().getPreco_do_titulo() == menor_preco_encontrado){
                    livro_com_valor_mais_barato = livro_atual_testado.getValue();
                }
            }

            // Exibindo livro encontrado:
            System.out.println("Livro com menor valor de preço:\n" + livro_com_valor_mais_barato);

            return livro_com_valor_mais_barato;
        }

        // Exibição dos livros em geral, sem nenhuma ordenação:
        public void exibirLivros(){
            System.out.println("Todos os livros da livraria online:\n");
            
            for(Map.Entry<String, Livro> livro_atual : conjunto_de_livros.entrySet()){
                System.out.println("Link -> " + livro_atual.getKey() + "\nDescrição: " + livro_atual.getValue());
            }
        }

}

