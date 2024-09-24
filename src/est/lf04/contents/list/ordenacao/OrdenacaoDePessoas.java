package est.lf04.contents.list.ordenacao;

// Imports nescessários:
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class OrdenacaoDePessoas {

    // Atributo. Uma lista nula;
    private List<Pessoa> lista_de_pessoas;

    // Construtor que inicia a lista vazia:
    public OrdenacaoDePessoas(){
        lista_de_pessoas = new ArrayList<>();
    }

    // Métodos manipuladores da lista:
    public void adicionarPessoa(String nome_inserido, int idade_inserida, double altura_inserida){
        // Explicação do método -> É adicionado um novo objeto 'Pessoa' a partir dos valores passados por parâmetros.

        lista_de_pessoas.add(new Pessoa(nome_inserido, idade_inserida, altura_inserida));
    }

    public void ordenarPorIdade(){
        /* Explicação do método -> Ordena 'lista_de_pessoas' a partir do método padrão de comparação implementado 
        na classe 'Pessoa'. 
        */
        
        Collections.sort(lista_de_pessoas);
    }                                                   

    public void ordenarPorAltura(){
        /*Explicação do método -> Utiliza uma implementação de 'Comparator' feita na classe 'Pessoa' para realizar a ordenação da lista.
         * Nesse caso, a ordenação é feita pelo atributo altura.
         */
    
        Collections.sort(lista_de_pessoas, new CompararPorAltura());
    }


    public static void main(String[] args) {
        
        OrdenacaoDePessoas minha_lista = new OrdenacaoDePessoas();


        minha_lista.adicionarPessoa("Luis", 20, 1.75);
        minha_lista.adicionarPessoa("Acleucia", 43, 1.70);
        minha_lista.adicionarPessoa("João", 18, 1.80);
        minha_lista.adicionarPessoa("Pedro", 25, 1.83);
        minha_lista.adicionarPessoa("Jośe", 5, 1.30);

        minha_lista.ordenarPorAltura();

        System.out.println(minha_lista.lista_de_pessoas);

    }

}