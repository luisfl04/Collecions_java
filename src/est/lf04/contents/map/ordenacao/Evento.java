package est.lf04.contents.map.ordenacao;


public class Evento {
    
    // Att:
    private String nome_do_evento;
    private String atracao_do_evento;

    // Constructor:
    public Evento(String nome_do_evento_inserido, String atracao_do_evento_inserida){
        this.nome_do_evento = nome_do_evento_inserido;
        this.atracao_do_evento = atracao_do_evento_inserida;  
    }   

    // Métodos get:
    public String getNomeDoEvento(){
        return nome_do_evento;
    }   

    public String getAtracaoDoEvento(){
        return atracao_do_evento;
    }

    // 'toString':
    @Override
    public String toString(){
        return "Nome do evento -> " + nome_do_evento + 
        " --- Atração -> " + atracao_do_evento + "\n";
    }


}
