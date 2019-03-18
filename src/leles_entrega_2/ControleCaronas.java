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
}
