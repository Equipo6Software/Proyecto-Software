/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DRegistro;
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
public class PuenteRegistroTest {
    
    public PuenteRegistroTest() {
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
     * Test of PuenteRegistro method, of class PuenteRegistro.
     */
    @Test
    public void testPuenteRegistro() {
        System.out.println("PuenteRegistro");
        DRegistro pdto = new DRegistro(111, "simulacion", 2, 3, 6, "grupo a");
        PuenteRegistro instance = new PuenteRegistro();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteMostrarTabla method, of class PuenteRegistro.
     */
    @Test
    public void testPuenteMostrarTabla() {
        System.out.println("PuenteMostrarTabla");
        JTable TablaDatosx = new JTable();
        PuenteRegistro instance = new PuenteRegistro();
        JTable expResult = TablaDatosx;
        JTable result = instance.PuenteMostrarTabla(TablaDatosx);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteMostrarTablax1 method, of class PuenteRegistro.
     */
    @Test
    public void testPuenteMostrarTablax1() {
        System.out.println("PuenteMostrarTablax1");
        JTable TablaDatosx1 = new JTable();
        PuenteRegistro instance = new PuenteRegistro();
        JTable expResult = TablaDatosx1;
        JTable result = instance.PuenteMostrarTablax1(TablaDatosx1);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteActualizar method, of class PuenteRegistro.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DRegistro prod = new DRegistro(111, "simulacion", 2, 3, 5, "grupo a");;
        PuenteRegistro instance = new PuenteRegistro();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteEliminar method, of class PuenteRegistro.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DRegistro pro = new DRegistro(111, "simulacion", 2, 3, 5, "grupo a");;
        PuenteRegistro instance = new PuenteRegistro();
        instance.PuenteEliminar(pro);
    }
    
}
