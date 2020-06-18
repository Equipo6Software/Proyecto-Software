/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jefe;

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
public class PrincipalJefeTest {
    
    public PrincipalJefeTest() {
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
     * Test of Limpiar2 method, of class PrincipalJefe.
     */
    @Test
    public void testLimpiar2() {
        System.out.println("Limpiar2");
        PrincipalJefe instance = new PrincipalJefe();
        instance.Limpiar2();
    }

    /**
     * Test of limpiaro method, of class PrincipalJefe.
     */
    @Test
    public void testLimpiaro() {
        System.out.println("limpiaro");
        PrincipalJefe instance = new PrincipalJefe();
        instance.limpiaro();
    }

    /**
     * Test of MostrarTabla1 method, of class PrincipalJefe.
     */
    @Test
    public void testMostrarTabla1() {
        System.out.println("MostrarTabla1");
        PrincipalJefe instance = new PrincipalJefe();
        instance.MostrarTabla1();        
    }

    /**
     * Test of M method, of class PrincipalJefe.
     */
    @Test
    public void testM() {
        System.out.println("M");
        PrincipalJefe instance = new PrincipalJefe();
        instance.M();
    }

    /**
     * Test of Verificar1 method, of class PrincipalJefe.
     */
    @Test
    public void testVerificar1() {
        System.out.println("Verificar1");
        PrincipalJefe instance = new PrincipalJefe();
        boolean expResult = false;
        boolean result = instance.Verificar1();
        assertEquals(expResult, result);
    }

    /**
     * Test of VerificarNOU method, of class PrincipalJefe.
     */
    @Test
    public void testVerificarNOU() {
        System.out.println("VerificarNOU");
        PrincipalJefe instance = new PrincipalJefe();
        boolean expResult = false;
        boolean result = instance.VerificarNOU();
        assertEquals(expResult, result);
    }

    /**
     * Test of Verificar method, of class PrincipalJefe.
     */
    @Test
    public void testVerificar() {
        System.out.println("Verificar");
        PrincipalJefe instance = new PrincipalJefe();
        boolean expResult = false;
        boolean result = instance.Verificar();
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTabla method, of class PrincipalJefe.
     */
    @Test
    public void testMostrarTabla() {
        System.out.println("MostrarTabla");
        PrincipalJefe instance = new PrincipalJefe();
        instance.MostrarTabla();
    }

    /**
     * Test of main method, of class PrincipalJefe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PrincipalJefe.main(args);
    }
    
}
