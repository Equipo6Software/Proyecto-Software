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
public class DgruposTest {
    
    public DgruposTest() {
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
     * Test of getId method, of class Dgrupos.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Dgrupos instance = new Dgrupos();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Dgrupos.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 0;
        Dgrupos instance = new Dgrupos();
        instance.setId(Id);
    }

    /**
     * Test of getGrupo method, of class Dgrupos.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Dgrupos instance = new Dgrupos();
        String expResult = instance.getGrupo();
        String result = instance.getGrupo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrupo method, of class Dgrupos.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        String Grupo = "";
        Dgrupos instance = new Dgrupos();
        instance.setGrupo(Grupo);
    }

    /**
     * Test of getCarrera method, of class Dgrupos.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        Dgrupos instance = new Dgrupos();
        String expResult = instance.getCarrera();
        String result = instance.getCarrera();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarrera method, of class Dgrupos.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        String Carrera = "";
        Dgrupos instance = new Dgrupos();
        instance.setCarrera(Carrera);
    }
    
}
