package est.lf04.contents.map.ordenacao;

// Imports:
import java.util.Comparator;
import java.util.Map;


public class Livro {

    // Att:
    private String titulo_do_livro;
    private String autor_do_titulo;
    private double preco_do_titulo;

    // Constructor:
    public Livro(String titulo_inserido, String autor_inserido, double preco_inserido){
        this.titulo_do_livro = titulo_inserido;
        this.autor_do_titulo = autor_inserido;
        this.preco_do_titulo = preco_inserido;
    }
    
    // Métodos get:
    public String getTitulo_do_livro() {
        return titulo_do_livro;
    }

    public String getAutor_do_titulo() {
        return autor_do_titulo;
    }

    public double getPreco_do_titulo() {
        return preco_do_titulo;
    }   

    // exibição dos atributos:
    @Override
    public String toString(){
        return "Titulo do livro: " + titulo_do_livro + 
        " --- Autor do titulo: "  + autor_do_titulo + 
        " --- preço correspondente: R$" + preco_do_titulo + "\n";
    }
}

// Classe que realiza a comparação a partir do atributo 'preco':
class CompararPorPreco implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> primeiro_livro, Map.Entry<String, Livro> segundo_livro){
        return Double.compare(primeiro_livro.getValue().getPreco_do_titulo(), segundo_livro.getValue().getPreco_do_titulo());
    }
}   

// classe que realiza a comparação por nome do autor:
class CompararPorNomeDoAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> primeiro_livro, Map.Entry<String, Livro> segundo_livro){
        return primeiro_livro.getValue().getAutor_do_titulo().compareToIgnoreCase(segundo_livro.getValue().getAutor_do_titulo());    
    }   

}

