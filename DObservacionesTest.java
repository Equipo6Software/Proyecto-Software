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
public class DObservacionesTest {
    
    public DObservacionesTest() {
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
     * Test of getId method, of class DObservaciones.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        DObservaciones instance = new DObservaciones();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId_Maestro method, of class DObservaciones.
     */
    @Test
    public void testGetId_Maestro() {
        System.out.println("getId_Maestro");
        DObservaciones instance = new DObservaciones();
        int expResult = 0;
        int result = instance.getId_Maestro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_Maestro method, of class DObservaciones.
     */
    @Test
    public void testSetId_Maestro() {
        System.out.println("setId_Maestro");
        int Id_Maestro = 0;
        DObservaciones instance = new DObservaciones();
        instance.setId_Maestro(Id_Maestro);
    }

    /**
     * Test of setId method, of class DObservaciones.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 0;
        DObservaciones instance = new DObservaciones();
        instance.setId(Id);
    }

    /**
     * Test of getObservacion method, of class DObservaciones.
     */
    @Test
    public void testGetObservacion() {
        System.out.println("getObservacion");
        DObservaciones instance = new DObservaciones();
        String expResult = instance.getObservacion();
        String result = instance.getObservacion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setObservacion method, of class DObservaciones.
     */
    @Test
    public void testSetObservacion() {
        System.out.println("setObservacion");
        String Observacion = "";
        DObservaciones instance = new DObservaciones();
        instance.setObservacion(Observacion);
    }
    
}
