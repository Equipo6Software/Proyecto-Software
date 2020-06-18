/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DMaestros;
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
public class PuenteMaestrosTest {
    
    public PuenteMaestrosTest() {
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
     * Test of PuenteRegistro method, of class PuenteMaestros.
     */
    @Test
    public void testPuenteRegistro() {
        System.out.println("PuenteRegistro");
        DMaestros pdto = new DMaestros(11, "ramon", "industrial");
        PuenteMaestros instance = new PuenteMaestros();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteActualizar method, of class PuenteMaestros.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DMaestros prod = new DMaestros(11, "Ramon", "industrial");
        PuenteMaestros instance = new PuenteMaestros();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteMostrarTabla method, of class PuenteMaestros.
     */
    @Test
    public void testPuenteMostrarTabla() {
        System.out.println("PuenteMostrarTabla");
        JTable tblm = new JTable();
        PuenteMaestros instance = new PuenteMaestros();
        JTable expResult = tblm;
        JTable result = instance.PuenteMostrarTabla(tblm);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteEliminar method, of class PuenteMaestros.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DMaestros pro = new DMaestros(11, "Ramon", "industrial");
        PuenteMaestros instance = new PuenteMaestros();
        instance.PuenteEliminar(pro);
    }
    
}
