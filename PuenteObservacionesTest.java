/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DObservaciones;
import javax.swing.JTable;
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
public class PuenteObservacionesTest {
    
    public PuenteObservacionesTest() {
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
     * Test of PuenteRegistro method, of class PuenteObservaciones.
     */
    @Test
    public void testPuenteRegistro() {
        System.out.println("PuenteRegistro");
        DObservaciones pdto = new DObservaciones(17107, 11, "observaciones");
        PuenteObservaciones instance = new PuenteObservaciones();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteActualizar method, of class PuenteObservaciones.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DObservaciones prod = new DObservaciones(17107, 11, "observaciones ninguna");
        PuenteObservaciones instance = new PuenteObservaciones();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteMostrarTabla method, of class PuenteObservaciones.
     */
    @Test
    public void testPuenteMostrarTabla() {
        System.out.println("PuenteMostrarTabla");
        JTable TablaO = new JTable();
        PuenteObservaciones instance = new PuenteObservaciones();
        JTable expResult = TablaO;
        JTable result = instance.PuenteMostrarTabla(TablaO);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteEliminar method, of class PuenteObservaciones.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DObservaciones pro = new DObservaciones(17107, 11, "observaciones ninguna");
        PuenteObservaciones instance = new PuenteObservaciones();
        instance.PuenteEliminar(pro);
    }
    
}
