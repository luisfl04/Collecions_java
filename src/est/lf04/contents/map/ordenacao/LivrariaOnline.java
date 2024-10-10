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
            if(lista_de_valores_chave_a_serem_removidos == null){
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

            return conjunto_de_livros_ordenados_por_preco;
        }







}

