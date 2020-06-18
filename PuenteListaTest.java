/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DLista;
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
public class PuenteListaTest {
    
    public PuenteListaTest() {
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
     * Test of PuenteRegistro method, of class PuenteLista.
     */
    @Test
    public void testPuenteRegistro() {
        System.out.println("PuenteRegistro");
        DLista pdto = new DLista(123, 222, "taller1", "sistemas");
        PuenteLista instance = new PuenteLista();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteMostrarTabla3 method, of class PuenteLista.
     */
    @Test
    public void testPuenteMostrarTabla3() {
        System.out.println("PuenteMostrarTabla3");
        JTable TablaDatos3 = new JTable();
        PuenteLista instance = new PuenteLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.PuenteMostrarTabla3(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaSistemas method, of class PuenteLista.
     */
    @Test
    public void testPuenteMostrarTablaSistemas() {
        System.out.println("PuenteMostrarTablaSistemas");
        JTable TablaDatos3 = new JTable();
        PuenteLista instance = new PuenteLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.PuenteMostrarTablaSistemas(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaElectromecanica method, of class PuenteLista.
     */
    @Test
    public void testPuenteMostrarTablaElectromecanica() {
        System.out.println("PuenteMostrarTablaElectromecanica");
        JTable TablaDatos3 = new JTable();
        PuenteLista instance = new PuenteLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.PuenteMostrarTablaElectromecanica(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaIGE method, of class PuenteLista.
     */
    @Test
    public void testPuenteMostrarTablaIGE() {
        System.out.println("PuenteMostrarTablaIGE");
        JTable TablaDatos3 = new JTable();
        PuenteLista instance = new PuenteLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.PuenteMostrarTablaIGE(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaRenovables method, of class PuenteLista.
     */
    @Test
    public void testPuenteMostrarTablaRenovables() {
        System.out.println("PuenteMostrarTablaRenovables");
        JTable TablaDatos3 = new JTable();
        PuenteLista instance = new PuenteLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.PuenteMostrarTablaRenovables(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablaIndustrial method, of class PuenteLista.
     */
    @Test
    public void testPuenteMostrarTablaIndustrial() {
        System.out.println("PuenteMostrarTablaIndustrial");
        JTable TablaDatos3 = new JTable();
        PuenteLista instance = new PuenteLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.PuenteMostrarTablaIndustrial(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteActualizar method, of class PuenteLista.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DLista prod = new DLista(123, 222, "taller2", "sistemas");
        PuenteLista instance = new PuenteLista();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteEliminar method, of class PuenteLista.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DLista pro = new DLista(123, 222, "taller2", "sistemas");
        PuenteLista instance = new PuenteLista();
        instance.PuenteEliminar(pro);
    }
    
}
