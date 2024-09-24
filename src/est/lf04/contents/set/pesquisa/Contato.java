package est.lf04.contents.set.pesquisa;

// Imports:


public class Contato {
    
    // Atributos:
    private String nome_do_contato;
    private long numero_de_contato;
    
    // Construtor:
    public Contato(String nome_do_contato, long numero_de_contato) {
        this.nome_do_contato = nome_do_contato;
        this.numero_de_contato = numero_de_contato;
    }

    // Métodos get:
    public String getNome_do_contato() {
        return nome_do_contato;
    }

    public long getNumero_de_contato() {
        return numero_de_contato;
    }

    // Métodos set:
    public void setNumeroDeContato(long novo_numero){
        this.numero_de_contato = novo_numero;
    }
    
    // 'toString':
    public String toString(){
        return "Nome -> " + nome_do_contato + 
        " --- Telefone correspondente -> " + numero_de_contato + "\n";
    }


}
