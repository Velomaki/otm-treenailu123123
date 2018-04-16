package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void alkuSaldoOikein() {
        assertEquals(10,kortti.saldo());      
    }
    
    @Test
    public void latausOnnistuu() {
        kortti.lataaRahaa(5);
        assertEquals(15,kortti.saldo());      
    }
    
    @Test
    public void ostoOnnistuu() {
        kortti.otaRahaa(5);
        assertEquals(5,kortti.saldo());      
    }
    
    @Test
    public void saldoEiMeneMiinukselle() {
        kortti.otaRahaa(5555555);
        assertEquals(10,kortti.saldo());      
    }
    
    @Test
    public void metodiPalauttaaTrueKunOnnistuu() {
        //kortti.otaRahaa(5);
        assertTrue(kortti.otaRahaa(5));      
    }
    
    @Test
    public void metodiPalauttaaFalseKunFailaa() {
        //kortti.otaRahaa(5);
        assertFalse(kortti.otaRahaa(555555));      
    }
    
    @Test
    public void toStringToimii(){
        assertEquals("saldo: 0.10", kortti.toString());
    }
    
    
    
    
    
    
}
