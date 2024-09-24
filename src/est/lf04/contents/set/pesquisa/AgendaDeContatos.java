package est.lf04.contents.set.pesquisa;

// Imports nescessários:
import java.util.Set;
import java.util.HashSet;


public class AgendaDeContatos{

    // Atributos:
    private Set<Contato> conjunto_de_contatos;

    // Constructor:
    public AgendaDeContatos(){
        this.conjunto_de_contatos = new HashSet<>();
    }

    // Métodos que manipulam o set:
    public void adicionarContato(String nome_passado, long numero_passado){
        conjunto_de_contatos.add(new Contato(nome_passado, numero_passado));
    }

    public void exibitContatos(){
        
        if(conjunto_de_contatos.isEmpty()){
            System.out.println("O set está vazio.");
        }
        else{
            System.out.println(conjunto_de_contatos);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome_de_contato_pesquisado){
        Set<Contato> lista_de_contatos_com_base_no_nome = new HashSet<>();
    
        if(conjunto_de_contatos.isEmpty()){
            System.out.println("O set está vazio");
        }
        else{
            for(Contato contato_testado : conjunto_de_contatos){
                if(contato_testado.getNome_do_contato().equalsIgnoreCase(nome_de_contato_pesquisado)){
                    lista_de_contatos_com_base_no_nome.add(contato_testado);
                }
            }
        }
        
        if(lista_de_contatos_com_base_no_nome.isEmpty()){
            System.out.println("Não há nenhum valor no set que corresponda ao nome pesquisado!");
        }
        else{
            System.out.println(lista_de_contatos_com_base_no_nome);
        }
        
        return lista_de_contatos_com_base_no_nome;
    }

    public void atualizarNumeroContato(String nome_do_contato_a_ser_atualizado, long numero_de_telefone_atualizado){

        if(conjunto_de_contatos.isEmpty()){
            System.out.println("O set está vazio");
        }
        else{
            for(Contato contato_testado : conjunto_de_contatos){
                if(contato_testado.getNome_do_contato().equalsIgnoreCase(nome_do_contato_a_ser_atualizado)){
                    contato_testado.setNumeroDeContato(numero_de_telefone_atualizado);
                    break;
                }
            }
        }


    }

}
