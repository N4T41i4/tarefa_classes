package br.com.natalia;
/**
 *
 * @author natalia silva
 * @return print do que foi cadastrado
 *
 */


public class Principal{
    public static void main(String Args[]){
        Garrafa garrafa= new Garrafa();
        garrafa.cadastrarVolume("ml : 200");
        System.out.println(garrafa.getVolume());
        garrafa.imprimirVolume();
    }}