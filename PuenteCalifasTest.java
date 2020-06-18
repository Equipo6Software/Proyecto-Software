/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DCalificaciones;
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
public class PuenteCalifasTest {
    
    public PuenteCalifasTest() {
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
     * Test of PuenteRegistro method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteRegistro() {
        System.out.println("PuenteRegistro");
        DCalificaciones pdto = new DCalificaciones(2, "juan", "sistemas", 1, 2, 3, 4, 5, 6, 7, "7");
        PuenteCalifas instance = new PuenteCalifas();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteMostrarTabla method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteMostrarTabla() {
        System.out.println("PuenteMostrarTabla");
        JTable TablaDatos = new JTable();
        PuenteCalifas instance = new PuenteCalifas();
        JTable expResult = TablaDatos;
        JTable result = instance.PuenteMostrarTabla(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaSistemas method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteMostrarTablaSistemas() {
        System.out.println("PuenteMostrarTablaSistemas");
        JTable TablaDatos = new JTable();
        PuenteCalifas instance = new PuenteCalifas();
        JTable expResult = TablaDatos;
        JTable result = instance.PuenteMostrarTablaSistemas(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaElectromecanica method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteMostrarTablaElectromecanica() {
        System.out.println("PuenteMostrarTablaElectromecanica");
        JTable TablaDatos = new JTable();
        PuenteCalifas instance = new PuenteCalifas();
        JTable expResult = TablaDatos;
        JTable result = instance.PuenteMostrarTablaElectromecanica(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaIGE method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteMostrarTablaIGE() {
        System.out.println("PuenteMostrarTablaIGE");
        JTable TablaDatos = new JTable();
        PuenteCalifas instance = new PuenteCalifas();
        JTable expResult = TablaDatos;
        JTable result = instance.PuenteMostrarTablaIGE(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaRenovables method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteMostrarTablaRenovables() {
        System.out.println("PuenteMostrarTablaRenovables");
        JTable TablaDatos = new JTable();
        PuenteCalifas instance = new PuenteCalifas();
        JTable expResult = TablaDatos;
        JTable result = instance.PuenteMostrarTablaRenovables(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaIndustrial method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteMostrarTablaIndustrial() {
        System.out.println("PuenteMostrarTablaIndustrial");
        JTable TablaDatos = new JTable();
        PuenteCalifas instance = new PuenteCalifas();
        JTable expResult = TablaDatos;
        JTable result = instance.PuenteMostrarTablaIndustrial(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteActualizar method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DCalificaciones prod = new DCalificaciones(2, "juan", "sistemas", 2, 2, 2, 2, 2, 2, 2, "2");
        PuenteCalifas instance = new PuenteCalifas();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteEliminar method, of class PuenteCalifas.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DCalificaciones pro = new DCalificaciones(2, "juan", "sistemas", 2, 2, 2, 2, 2, 2, 2, "2");
        PuenteCalifas instance = new PuenteCalifas();
        instance.PuenteEliminar(pro);
    }
    
}
