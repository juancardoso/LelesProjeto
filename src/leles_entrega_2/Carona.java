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
public class Carona {
    Responsavel daCarona;
    ArrayList<Filho> recebeCarona = new ArrayList<Filho>();
    Destino destino;

    public Carona(Responsavel daCarona, ArrayList<Filho> recebeCarona, Destino destino) {
        this.daCarona = daCarona;
        this.recebeCarona = recebeCarona;
        this.destino = destino;
    }
}
