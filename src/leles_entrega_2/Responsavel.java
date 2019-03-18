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
//Classe responsavel será a Mãe/Pai
public class Responsavel {
    String nome;
    ArrayList<Filho> filhos = new ArrayList<Filho>();

    public Responsavel(String nome) {
        this.nome = nome;
    }

    public void addFilho(Filho filho) {
        filhos.add(filho);
        filho.addResponsaveis(this);
    }

    public ArrayList<Filho> getFilhos() {
        return filhos;
    }
    
}
