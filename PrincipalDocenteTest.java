/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Docente;

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
public class PrincipalDocenteTest {
    
    public PrincipalDocenteTest() {
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
     * Test of MostrarTablO method, of class PrincipalDocente.
     */
    @Test
    public void testMostrarTablO() {
        System.out.println("MostrarTablO");
        PrincipalDocente instance = new PrincipalDocente();
        instance.MostrarTablO();
    }

    /**
     * Test of main method, of class PrincipalDocente.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PrincipalDocente.main(args);
    }
    
}
