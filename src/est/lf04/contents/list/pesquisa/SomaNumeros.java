package est.lf04.contents.list.pesquisa;

// imports nescessários:
import java.util.List;
import java.util.ArrayList;


public class SomaNumeros {
    
    // Atributo(Lista de inteiros):
    private List<Integer> lista_de_inteiros;

    // Contrutor, que inicia a lista vazia:
    public SomaNumeros(){
        lista_de_inteiros = new ArrayList<>();
    }

    // Métodos que manipula a lista:
    public void adicionarNumero(int numero_adicionado){
        /*Explicação do método -> Recebe um inteiro por parâmetro e o adiciona na lista */

        lista_de_inteiros.add(numero_adicionado);
    }

    public int calcularSomaDosNumeros(){
        /* Explicação do método -> Todos os valores da lista serão iterados e incrementados na variável 'soma_dos_valores 
         * que será retornada.
         */
    
        int soma_dos_valores = 0;

        for(Integer valor_inteiro : lista_de_inteiros){
            soma_dos_valores = soma_dos_valores + valor_inteiro.intValue();
        }
        
        return soma_dos_valores;
    }

    public int encontrarMaiorNumero(){
        /*Explicação do método -> Fará a comparação entre os valores contidos na lista e retornará o de menor valor. */
    
        int numero_de_maior_valor = lista_de_inteiros.get(0);

        for(int indice_do_numero_comparado = 0; indice_do_numero_comparado < lista_de_inteiros.size(); indice_do_numero_comparado++){

            if(lista_de_inteiros.get(indice_do_numero_comparado) > numero_de_maior_valor){
                numero_de_maior_valor = lista_de_inteiros.get(indice_do_numero_comparado);
            }

        }

        return numero_de_maior_valor;
    }

    public int encontrarMenorNumero(){
        /*Explicação do método -> Mesma implementação de 'encontraMaiorNumero()', adpatado para o menor numero. */
    
        int numero_de_menor_valor_na_lista = lista_de_inteiros.get(0);

        for(int indice_do_numero_comparado = 0; indice_do_numero_comparado < lista_de_inteiros.size(); indice_do_numero_comparado++){
            if(lista_de_inteiros.get(indice_do_numero_comparado) < numero_de_menor_valor_na_lista){
                numero_de_menor_valor_na_lista = lista_de_inteiros.get(indice_do_numero_comparado);
            }
        }

        return numero_de_menor_valor_na_lista;
    }

    public void exibirNumeros(){
        /*Explicação do método -> Exibe todos os valores contidos na lista. */
        
        System.out.println("Lista de Inteiros:");

        for(Integer numero : lista_de_inteiros){

            System.out.println("-> " + numero.intValue());
        }
    }

}
