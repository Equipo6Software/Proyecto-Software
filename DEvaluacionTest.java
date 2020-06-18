/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
public class DEvaluacionTest {
    
    public DEvaluacionTest() {
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
     * Test of getUnidad method, of class DEvaluacion.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        DEvaluacion instance = new DEvaluacion();
        int expResult = 0;
        int result = instance.getUnidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnidad method, of class DEvaluacion.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        int Unidad = 0;
        DEvaluacion instance = new DEvaluacion();
        instance.setUnidad(Unidad);
    }

    /**
     * Test of getEtapa method, of class DEvaluacion.
     */
    @Test
    public void testGetEtapa() {
        System.out.println("getEtapa");
        DEvaluacion instance = new DEvaluacion();
        String expResult = instance.getEtapa();
        String result = instance.getEtapa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEtapa method, of class DEvaluacion.
     */
    @Test
    public void testSetEtapa() {
        System.out.println("setEtapa");
        String Etapa = "";
        DEvaluacion instance = new DEvaluacion();
        instance.setEtapa(Etapa);
    }

    /**
     * Test of getActividades method, of class DEvaluacion.
     */
    @Test
    public void testGetActividades() {
        System.out.println("getActividades");
        DEvaluacion instance = new DEvaluacion();
        String expResult = instance.getActividades();
        String result = instance.getActividades();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActividades method, of class DEvaluacion.
     */
    @Test
    public void testSetActividades() {
        System.out.println("setActividades");
        String Actividades = "";
        DEvaluacion instance = new DEvaluacion();
        instance.setActividades(Actividades);
    }

    /**
     * Test of getEvidencias method, of class DEvaluacion.
     */
    @Test
    public void testGetEvidencias() {
        System.out.println("getEvidencias");
        DEvaluacion instance = new DEvaluacion();
        String expResult = instance.getEvidencias();
        String result = instance.getEvidencias();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEvidencias method, of class DEvaluacion.
     */
    @Test
    public void testSetEvidencias() {
        System.out.println("setEvidencias");
        String Evidencias = "";
        DEvaluacion instance = new DEvaluacion();
        instance.setEvidencias(Evidencias);
    }

    /**
     * Test of getCriterios_de_Evaluacion method, of class DEvaluacion.
     */
    @Test
    public void testGetCriterios_de_Evaluacion() {
        System.out.println("getCriterios_de_Evaluacion");
        DEvaluacion instance = new DEvaluacion();
        String expResult = instance.getCriterios_de_Evaluacion();
        String result = instance.getCriterios_de_Evaluacion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCriterios_de_Evaluacion method, of class DEvaluacion.
     */
    @Test
    public void testSetCriterios_de_Evaluacion() {
        System.out.println("setCriterios_de_Evaluacion");
        String Criterios_de_Evaluacion = "";
        DEvaluacion instance = new DEvaluacion();
        instance.setCriterios_de_Evaluacion(Criterios_de_Evaluacion);
    }

    /**
     * Test of getC method, of class DEvaluacion.
     */
    @Test
    public void testGetC() {
        System.out.println("getC");
        DEvaluacion instance = new DEvaluacion();
        String expResult = instance.getC();
        String result = instance.getC();
        assertEquals(expResult, result);
    }

    /**
     * Test of setC method, of class DEvaluacion.
     */
    @Test
    public void testSetC() {
        System.out.println("setC");
        String c = "";
        DEvaluacion instance = new DEvaluacion();
        instance.setC(c);
    }
    
}
