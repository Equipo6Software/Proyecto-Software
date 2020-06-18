/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.SQLException;
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
public class BDconexionTest {
    
    public BDconexionTest() {
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
     * Test of Conectarse method, of class BDconexion.
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException
     */
    @Test
    public void testConectarse() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        System.out.println("Conectarse");
        BDconexion instance = new BDconexion();
        Connection expResult = instance.Conectarse();
        Connection result = instance.Conectarse();
        assertEquals(expResult, result);
    }

    /**
     * Test of CerrarConexion method, of class BDconexion.
     */
    @Test
    public void testCerrarConexion() throws Exception {
        System.out.println("CerrarConexion");
        BDconexion instance = new BDconexion();
        instance.CerrarConexion();
    }
    
}
