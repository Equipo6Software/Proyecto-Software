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
public class DListaTest {
    
    public DListaTest() {
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
     * Test of getClaveMateria method, of class DLista.
     */
    @Test
    public void testGetClaveMateria() {
        System.out.println("getClaveMateria");
        DLista instance = new DLista();
        int expResult = 0;
        int result = instance.getClaveMateria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setClaveMateria method, of class DLista.
     */
    @Test
    public void testSetClaveMateria() {
        System.out.println("setClaveMateria");
        int ClaveMateria = 0;
        DLista instance = new DLista();
        instance.setClaveMateria(ClaveMateria);
    }

    /**
     * Test of getNombre method, of class DLista.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DLista instance = new DLista();
        String expResult = instance.getNombre();
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class DLista.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        DLista instance = new DLista();
        instance.setNombre(Nombre);
    }

    /**
     * Test of getNC method, of class DLista.
     */
    @Test
    public void testGetNC() {
        System.out.println("getNC");
        DLista instance = new DLista();
        int expResult = 0;
        int result = instance.getNC();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNC method, of class DLista.
     */
    @Test
    public void testSetNC() {
        System.out.println("setNC");
        int NC = 0;
        DLista instance = new DLista();
        instance.setNC(NC);
    }

    /**
     * Test of getCarrera method, of class DLista.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        DLista instance = new DLista();
        String expResult = instance.getCarrera();
        String result = instance.getCarrera();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarrera method, of class DLista.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        String Carrera = "";
        DLista instance = new DLista();
        instance.setCarrera(Carrera);
    }
    
}
