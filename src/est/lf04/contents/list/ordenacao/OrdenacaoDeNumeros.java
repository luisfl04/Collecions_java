package est.lf04.contents.list.ordenacao;

// Importações nescessárias:
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class OrdenacaoDeNumeros  {

    // Atributo:
    List<Integer> lista_de_inteiros;
    
    // Construtor:
    public OrdenacaoDeNumeros(){
        lista_de_inteiros = new ArrayList<>();
    }

    // Manipulação da lista:
    public void adicionarNumero(int numero_para_adicionar){
        lista_de_inteiros.add(numero_para_adicionar);
    }

    public void ordenarAscendente(){
        /* Usa 'sort()' para ordenar a lista. */
       
        Collections.sort(lista_de_inteiros);
    }

    public void ordenarDescendente(){
        /* Explicação do método -> Faz a 'ordenação' da lista usando o 'sort' só que usando a ordem inversa com o 
         * 'Collecions.reverseOrder()'.
         */
        
        lista_de_inteiros.sort(Collections.reverseOrder());
    }
}
