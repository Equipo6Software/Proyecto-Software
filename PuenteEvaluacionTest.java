/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DEvaluacion;
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
public class PuenteEvaluacionTest {
    
    public PuenteEvaluacionTest() {
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
     * Test of PuenteRegistro method, of class PuenteEvaluacion.
     */
    @Test
    public void testPuenteRegistro() {
        System.out.println("PuenteRegistro");
        DEvaluacion pdto = new DEvaluacion(1, "enero-julio", "examenes", "trabajos", "examenes parciales", "2");
        PuenteEvaluacion instance = new PuenteEvaluacion();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteMostrarTabla2 method, of class PuenteEvaluacion.
     */
    @Test
    public void testPuenteMostrarTabla2() {
        System.out.println("PuenteMostrarTabla2");
        JTable TablaDatos2 = new JTable();
        PuenteEvaluacion instance = new PuenteEvaluacion();
        JTable expResult = TablaDatos2;
        JTable result = instance.PuenteMostrarTabla2(TablaDatos2);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteActualizar method, of class PuenteEvaluacion.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DEvaluacion prod = new DEvaluacion(1, "enero-julio", "examenes", "trabajos", "examenes parciales", "3");
        PuenteEvaluacion instance = new PuenteEvaluacion();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteEliminar method, of class PuenteEvaluacion.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DEvaluacion pro = new DEvaluacion(1, "enero-julio", "examenes", "trabajos", "examenes parciales", "2");
        PuenteEvaluacion instance = new PuenteEvaluacion();
        instance.PuenteEliminar(pro);
    }
    
}
