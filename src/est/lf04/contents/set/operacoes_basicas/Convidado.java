package est.lf04.contents.set.operacoes_basicas;


public class Convidado{

    // Atributos:
    private String nome_convidado;
    private int codigo_de_convite;

    // Construtor:
    public Convidado(String nome_inserido, int codigo_de_convite_inserido){
        this.nome_convidado = nome_inserido;
        this.codigo_de_convite = codigo_de_convite_inserido;
    }   

    // Métodos get:
    public String getNomeConvidado(){
        return nome_convidado; 
    }

    public int getNumeroDeConvite(){
        return codigo_de_convite;
    }  

    // método de retorno dos valores:
    @Override
    public String toString(){
        return "Nome do convidado -> " + nome_convidado +
        " --- Código de convite -> " + codigo_de_convite;
    }

}