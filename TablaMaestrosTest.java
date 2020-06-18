/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Docente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author montion
 */
public class TablaMaestrosTest {
    
    public TablaMaestrosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of limpiar method, of class TablaMaestros.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        TablaMaestros instance = new TablaMaestros();
        instance.limpiar();
    }

    /**
     * Test of Verificar method, of class TablaMaestros.
     */
    @Test
    public void testVerificar() {
        System.out.println("Verificar");
        TablaMaestros instance = new TablaMaestros();
        boolean expResult = false;
        boolean result = instance.Verificar();
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTabla method, of class TablaMaestros.
     */
    @Test
    public void testMostrarTabla() {
        System.out.println("MostrarTabla");
        TablaMaestros instance = new TablaMaestros();
        instance.MostrarTabla();
    }

    /**
     * Test of main method, of class TablaMaestros.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TablaMaestros.main(args);
    }
    
}
