package est.lf04.contents.set.operacoes_basicas;

import java.util.HashSet;
// Imports:
import java.util.Set;


public class ConjuntoDePalavrasUnicas {
    
    // Att:
    Set<String> conjunto_de_palavras_unicas;

    // Construt or:
    public ConjuntoDePalavrasUnicas(){
        conjunto_de_palavras_unicas = new HashSet<>();
    }

    // Método 'toString':
    @Override
    public String toString(){
        return conjunto_de_palavras_unicas.iterator().next();
    }

    // Métodos que manipulam o set:
    public void adicionarPalavra(String palavra_para_adicionar){
        conjunto_de_palavras_unicas.add(palavra_para_adicionar);
    }

    public void removerPalavra(String palavra_para_ser_removida){
        
        if(conjunto_de_palavras_unicas.isEmpty()){
            System.out.println("O conjunto está vazio!");
        }    
        else{
            String palavra_removida = null;
        
            for(String palavra_testada : conjunto_de_palavras_unicas){
                if(palavra_testada == palavra_para_ser_removida){
                    palavra_removida = palavra_testada;
                    break;
                }
            }
            
            conjunto_de_palavras_unicas.remove(palavra_removida);
        }

    }   

    public void verificarPalavra(String palavra_para_verificar){
        
        boolean verificador_de_existencia = false;

        if(conjunto_de_palavras_unicas.isEmpty()){
            System.out.println("Conjunto vazio!");
        }
        else{
            for(String palavra_testada : conjunto_de_palavras_unicas){
                
                if(palavra_testada == palavra_para_verificar){
                    verificador_de_existencia = true;
                    break;       
                }
            }
        }
    
        if(verificador_de_existencia){
            System.out.println("A palavra " + palavra_para_verificar + " está presente no conjunto");
        }
        else{
            System.out.println("A palavra " + palavra_para_verificar + " não consta no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjunto_de_palavras_unicas);
    }

}
