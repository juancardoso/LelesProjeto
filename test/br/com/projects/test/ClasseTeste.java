/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projects.test;

import leles_entrega_2.Carona;
import leles_entrega_2.ControleCaronas;
import leles_entrega_2.Destino;
import leles_entrega_2.Filho;
import leles_entrega_2.Responsavel;
import org.junit.Assert;
import org.junit.Test;
//  String nomeLugar;
//    String rua;
//    String bairro;
//    String numero;
//    String cidade;
//    String estado;
/**
 *
 * @author Juan
 */
public class ClasseTeste {
    @Test
    public void registroInteresseCarona(){
        Responsavel mae = new Responsavel("Janaina");
        Filho filhoDaMae = new Filho("Joaquim");
        Destino destino = new Destino("Facens","Castelinho","Jardim Simus","123","Sorocaba","SP");
        
        mae.addFilho(filhoDaMae);
        
        Carona carona = new Carona(null,mae.getFilhos(),destino);
        
        ControleCaronas.registrarInteresseCarona(destino,mae.getFilhos());
        
        Assert.assertTrue(1 == ControleCaronas.getInteresses().size());
    }
}
