package est.lf04.contents.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Interface{       

    public static void main(String[] args) {
        
        
        // Criando lista de livros:
        ArrayList<Book> meus_livros = new ArrayList<Book>(){
            {
                add(new Book("Clean code", "Robert C Martin", 2004));
                add(new Book("O alquimista", "Paulo Coelho", 1990));
                add(new Book("O homem que calculava", "Malba Tahan", 1978));
            }
        };

        // Ordenando a lista a partir da ordem natural da classe 'Book', que é por titulo:
        Collections.sort(meus_livros);
        // Mostrando:
        System.out.println("Comparação por titulo:\n");
        for(Book book_iterado : meus_livros){
            System.out.println(book_iterado.get_titulo() + "-" + book_iterado.get_autor() + "-" + book_iterado.get_ano());
        }  

        // Ordenando por nome do autor:
        Collections.sort(meus_livros, new CompararAno());
        // Mostrando:
        System.out.println("Comparação por autor:\n");
        for(Book book_iterado : meus_livros){
            System.out.println(book_iterado.get_titulo() + "-" + book_iterado.get_autor() + "-" + book_iterado.get_ano());
        }  

        // Tentando fazer todos os tipos de comparações:
        Collections.sort(meus_livros, new CompararAnoAutorEAnoDeLancamento());
        // Apresentando resultado:
        System.out.println("Comparação por ano, autor e titulo:\n");
        for(Book book_iterado : meus_livros){
            System.out.println(book_iterado.get_titulo() + "-" + book_iterado.get_autor() + "-" + book_iterado.get_ano());
        }      
    }
}
