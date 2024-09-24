package est.lf04.contents.comparable_comparator;


import java.util.Comparator;
import java.lang.Comparable;


public class Book implements Comparable<Book>{
    
    // Atributos:
    private String titulo;
    private String autor;
    private int ano_de_lancamento;

    // Construtor:
    public Book(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_de_lancamento = ano;
    }

    // Método obrigatório 'compareTo()':
    public int compareTo(Book exemplo_de_livro){
        return titulo.compareTo(exemplo_de_livro.titulo);
    }
    
    // Métodos para acessar valores dos atributos:
    public String get_titulo(){
        return titulo;
    }

    public String get_autor(){
        return autor;
    }

    public int get_ano(){
        return ano_de_lancamento;
    }   

}

// Classe que irá usar 'comparator' para comparar os 'books' a partir do atributo autor:
class CompararAutor implements Comparator<Book>{
    
    @Override
    //método de comparação:
    public int compare(Book first_book, Book second_book){
        return first_book.get_autor().compareTo(second_book.get_autor());
    }
}

// Implementando classe que compara os livros por ano:
class CompararAno implements Comparator<Book>{

    // Implementando método:
    @Override
    public int compare(Book first_book, Book second_book){
        
        // Testando os valores:
        if(first_book.get_ano() > second_book.get_ano()){
            return 1;
        }
        else if(first_book.get_ano() < second_book.get_ano()){
            return -1;
        }
        else {
            return 0;
        }
    }

}

// Classe que compara os valores de todos os atributos:
class CompararAnoAutorEAnoDeLancamento implements Comparator<Book>{

    //Implementação:
    @Override
    public int compare(Book first_book, Book second_book){

        // Comparando por ano:
            // atribuindo a variável o valor após a comparação:
            int ano_de_lancamento = Integer.compare(first_book.get_ano(), second_book.get_ano());

            // verificando valor:
            if(ano_de_lancamento != 0){
                return ano_de_lancamento;
            }
        
        // Comparando por autor:
        int autor = first_book.get_autor().compareTo(second_book.get_autor());
        if(autor != 0 ){
            return autor;
        }

        // Comparando por titulo:
        return first_book.get_titulo().compareTo(second_book.get_titulo());
        
    }

}