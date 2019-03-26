/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leles_entrega_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class ControleCaronas {
    static ArrayList<Carona> caronasFinalizadas = new ArrayList<Carona>();
    static ArrayList<Carona> caronas = new ArrayList<Carona>();
    static ArrayList<Carona> interesses = new ArrayList<Carona>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static List<Carona> getInteresses(){
        return interesses;
    }

    public static void registrarInteresseCarona(Destino destino, ArrayList<Filho> filhos) {
        interesses.add(new Carona(null,filhos,destino));
    }
    
    public static void aceitarDarCarona(Carona carona, Responsavel daCarona){
        carona.daCarona = daCarona;
        
        caronas.add(carona);
        
        interesses.remove(carona);
    }
    
    public static void finalizarCarona(Carona carona){
        int indexCarona = caronas.indexOf(carona);
        if(indexCarona >= 0){
            caronasFinalizadas.add(caronas.get(indexCarona));
            caronas.remove(caronas.get(indexCarona));
        }
    }

    public static ArrayList<Carona> getCaronas() {
        return caronas;
    }
    
    public static ArrayList<Carona> getCaronasFinalizadas() {
        return caronasFinalizadas;
    }
    
    public static void avaliarCarona(Carona carona, float avaliacao){
        carona.addAvaliacao(avaliacao);
    }
    
    public static ArrayList<Carona> getInteresseByMae(Responsavel mae){
        ArrayList<Carona> interesses = new ArrayList<Carona>();
        for( Carona interesse : ControleCaronas.interesses){
            for(Filho filho : interesse.getRecebeCarona()){
                if(filho.responsaveis.contains(mae)){
                    interesses.add(interesse);
                    break;
                }
            }
        }
        
        return interesses;
    }
}
