package est.lf04.contents.list.pesquisa;

public class Livro {

    // Atributos:
    private String titulo_do_livro;
    private String autor_do_livro;
    private int ano_de_lancamento;

    // Construtor:
    public Livro(String titulo_passado_do_livro, String autor_passado_do_livro, int ano_de_publicacao_passado){
        this.titulo_do_livro = titulo_passado_do_livro;
        this.autor_do_livro = autor_passado_do_livro;
        this.ano_de_lancamento = ano_de_publicacao_passado;  
    }

    // Métodos 'get' para acessar valores:
    public String getTituloDoLivro(){
        return titulo_do_livro;
    }

    public String getAutorDoLivro(){
        return autor_do_livro;
    }

    public int getAnoDeLancamento(){
        return ano_de_lancamento;
    }

    // Método 'toString':
    public String toString(){
        return "Nome do livro -> " + titulo_do_livro + 
        " Autor -> " + autor_do_livro + 
        " Ano de lancamento -> " + ano_de_lancamento;
    }

}
