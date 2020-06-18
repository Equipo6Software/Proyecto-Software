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
public class DMaestrosTest {
    
    public DMaestrosTest() {
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
     * Test of getId_Maestro method, of class DMaestros.
     */
    @Test
    public void testGetId_Maestro() {
        System.out.println("getId_Maestro");
        DMaestros instance = new DMaestros();
        int expResult = 0;
        int result = instance.getId_Maestro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_Maestro method, of class DMaestros.
     */
    @Test
    public void testSetId_Maestro() {
        System.out.println("setId_Maestro");
        int Id_Maestro = 0;
        DMaestros instance = new DMaestros();
        instance.setId_Maestro(Id_Maestro);
    }

    /**
     * Test of getNombre method, of class DMaestros.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DMaestros instance = new DMaestros();
        String expResult = instance.getNombre();
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class DMaestros.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        DMaestros instance = new DMaestros();
        instance.setNombre(Nombre);
    }

    /**
     * Test of getArea method, of class DMaestros.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        DMaestros instance = new DMaestros();
        String expResult = instance.getArea();
        String result = instance.getArea();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArea method, of class DMaestros.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        String Area = "";
        DMaestros instance = new DMaestros();
        instance.setArea(Area);
    }
    
}
