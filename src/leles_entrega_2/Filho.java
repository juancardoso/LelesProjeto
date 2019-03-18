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
//Classe filho será vinculada a classe responsável
public class Filho {
    String nome;
    ArrayList<Responsavel> responsaveis = new ArrayList<Responsavel>() {};

    public Filho(String nome) {
        this.nome = nome;
    }

    void addResponsaveis(Responsavel responsavel) {
        responsaveis.add(responsavel);
    }
}
