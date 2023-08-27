package br.com.natalia;

/**
 * 
 * @author natalia silva
 * @version 0.1
 * <code>2+4=6</code>
 *
 */

public class Garrafa {
    private String nome;
    private String sabor;
    private String volume;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getSabor(){
        return sabor;
    }
    public void setSabor(String sabor){
        this.sabor=sabor;
    }
    public String getVolume(){
        return volume;
    }
    public void setVolume(String volume){
        this.volume=volume;

    }

    public void cadastrarVolume(String volume){
        setVolume(volume);

    }
    
    public void imprimirVolume(){
        System.out.println(this.volume);
    }

}
