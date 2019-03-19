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
    
    @Test
    public void avaliandoCarona(){
        Responsavel mae = new Responsavel("Janaina");
        Filho filhoDaMae = new Filho("Joaquim");
        Destino destino = new Destino("Facens","Castelinho","Jardim Simus","123","Sorocaba","SP");
        
        mae.addFilho(filhoDaMae);
        ControleCaronas.registrarInteresseCarona(destino,mae.getFilhos());
        
        Responsavel maeCarona = new Responsavel("Amelia");
                
        ControleCaronas.aceitarDarCarona(ControleCaronas.getInteresses().get(0), maeCarona);
        ControleCaronas.finalizarCarona(ControleCaronas.getCaronas().get(0));
        Carona carona = ControleCaronas.getCaronasFinalizadas().get(0);
        ControleCaronas.avaliarCarona(carona, (float) 10.0);
        
        Assert.assertEquals(carona.getAvaliacao(), (float)10.0);
    }
}
