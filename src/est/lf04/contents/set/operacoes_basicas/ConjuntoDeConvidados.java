package est.lf04.contents.set.operacoes_basicas;

// Imports:
import java.util.Set;
import java.util.HashSet;

public class ConjuntoDeConvidados {
    
    // Atributos:
    private Set<Convidado> conjunto_de_convidados;

    // Construtor do Set vazio:
    public ConjuntoDeConvidados(){
        this.conjunto_de_convidados = new HashSet<>();
    }

    // Métodos que manipulam o set:
    public void adicionarConvidado(String nome_inserido, int codigo_de_convite_inserido){
        conjunto_de_convidados.add(new Convidado(nome_inserido, codigo_de_convite_inserido));
    }

    public void removerConvidadoPorCodigoDeConvite(int numero_do_candidado_a_ser_removido){
        /*Explicação do método -> Primeiramente verifico se o conjunto está vazio, se não estiver, busco um objeto que corresponda ao valor
         * passado por parâmetro, atribuo o seu valor a variável nula criada e paro a execução do loop, após isso, removo o elemento da lista.
        */

        if(conjunto_de_convidados.isEmpty()){
            System.out.println("O conjunto está vazio!!!");
        }
        else{
            Convidado convidado_para_remover = null;

            for(Convidado convidado_testado : conjunto_de_convidados){
                if(convidado_testado.getNumeroDeConvite() == numero_do_candidado_a_ser_removido){
                    convidado_para_remover = convidado_testado;
                    break;
                }
            }
            
            conjunto_de_convidados.remove(convidado_para_remover);
        }
    }

    public int contarTotalDeConvidados(){
        return conjunto_de_convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(conjunto_de_convidados);
    }

    

}
