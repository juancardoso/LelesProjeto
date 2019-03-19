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
    public void DeveRegistrarInteresseDeCarona(){
        Responsavel mae = new Responsavel("Janaina");
        Filho filhoDaMae = new Filho("Joaquim");
        Destino destino = new Destino("Facens","Castelinho","Jardim Simus","123","Sorocaba","SP");
        
        mae.addFilho(filhoDaMae);
        
        Carona carona = new Carona(null,mae.getFilhos(),destino);
        
        ControleCaronas.registrarInteresseCarona(destino,mae.getFilhos());
        
        Assert.assertTrue(1 == ControleCaronas.getInteresses().size());
    }
    
    @Test
    public void temAvaliacaoDeCarona(){
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
        
        Assert.assertEquals((float)10.0, carona.getAvaliacao());
    }
    
    @Test
    public void filhoTemDestinoCorreto(){
        Responsavel maeUm = new Responsavel("Mãe");
        Filho filhoUm = new Filho("Pedro");
        Destino destino = new Destino("Futebol","Rua Corinthians","Itaquera","123","São Paulo","SP");
        
        maeUm.addFilho(filhoUm);
        ControleCaronas.registrarInteresseCarona(destino,maeUm.getFilhos());
        
        Responsavel maeDois = new Responsavel("Amelia");
        Filho filhoDois = new Filho("Joao");
        maeDois.addFilho(filhoDois);

        ControleCaronas.aceitarDarCarona(ControleCaronas.getInteresses().get(0), maeDois);  
        
        Assert.assertTrue(ControleCaronas.getInteresses().get(0).getDestino() == destino);
    }
    
}
