package est.lf04.contents.list.pesquisa;

// Imports nescessários:
import java.util.List;
import java.util.ArrayList;


public class CatalogoDeLivros {
    
    // Atributo. Uma lista nula.
    private List<Livro> colecao_de_livros;

    // Construtor que inicia a lista vazia:
    public CatalogoDeLivros(){
        colecao_de_livros = new ArrayList<>(); 
    }

    // Métodos correspondentes a classe:
    public void adicionarLivro(String titulo_inserido, String autor_inserido, int ano_de_publicacao_inserido){
        // Explicação do método -> Recebe valores por parâmetro e adiciona-os como objeto na lista 'colecao_de_livros'
        
        colecao_de_livros.add(new Livro(titulo_inserido, autor_inserido, ano_de_publicacao_inserido));
    }
    
    public List<Livro> pesquisarPorAutor(String nome_do_autor_pesquisado){
        /* Explicação do método -> Cria uma lista vazio onde nela irá ser inserido todos os objetos 'Livro' que corresponderem 
        ao nome do autor passado por parâmetro;
        */
        
        List<Livro> livros_relacionados_ao_autor = new ArrayList<>();

        if(colecao_de_livros.isEmpty()){
            System.out.println("Coleção vazia.");
        }
        else{
            
            for(Livro livro_comparado : colecao_de_livros){    
                if(livro_comparado.getAutorDoLivro().equalsIgnoreCase(nome_do_autor_pesquisado)){
                    livros_relacionados_ao_autor.add(livro_comparado);
                }
            }
        
        }
        
        return livros_relacionados_ao_autor;
    } 

    public List<Livro> pesquisarPorIntervaloDeAnos(int ano_base, int ano_final){
        /*Explicação do método -> É recebido dois valores por parâmetro, com isso, é testado livros que tenham o seu ano de 
         * lançamento entre esses dois valores por meio de condicional, os valores que satisfazem são adicionados na lista
         * que será retornada.
         */
        
        List<Livro> livros_filtrados_por_ano = new ArrayList<>();
        
        if(colecao_de_livros.isEmpty()){
            System.out.println("Coleção vazia");
        }
        else{
            for(Livro livro_testado : colecao_de_livros){

                if(livro_testado.getAnoDeLancamento() >= ano_base && 
                livro_testado.getAnoDeLancamento() <= ano_final){
                    livros_filtrados_por_ano.add(livro_testado);
                }
            }
        }

        return livros_filtrados_por_ano;

    }

    public Livro pesquisarPorTitulo(String titulo_pesquisado){
        /*Explicação do método -> Recebe um paramêtro que será comparado aos valores dos titulos de livros que estão 
        presentes na coleção de livros. O primeiro valor que coincidir será retornado. Para isso, será criado um objeto
        'Livro' nulo, que irá receber o valor do objeto que corresponder ao titulo pesquisado.
         */
        
        Livro livro_correspondente = null;

        if(colecao_de_livros.isEmpty()){
            System.out.println("Coleção vazia.");
        }
        else{
            for(Livro livro_comparado : colecao_de_livros){
                if(livro_comparado.getTituloDoLivro().equalsIgnoreCase(titulo_pesquisado)){           
                    livro_correspondente = livro_comparado;
                    break;
                }
            }
        }      
    
        return livro_correspondente;
    }

}
