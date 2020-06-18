/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
public class MantenimientoMaestrosTest {
    
    public MantenimientoMaestrosTest() {
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
     * Test of Registro_Nuevo method, of class MantenimientoMaestros.
     */
    @Test
    public void testRegistro_Nuevo() {
        System.out.println("Registro_Nuevo");
        DMaestros pdto = new DMaestros(222, "marcos", "electromecanica");
        MantenimientoMaestros instance = new MantenimientoMaestros();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of Actualizar method, of class MantenimientoMaestros.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DMaestros pdto = new DMaestros(222, "marco", "electromecanica");
        MantenimientoMaestros instance = new MantenimientoMaestros();
        instance.Actualizar(pdto);
    }

    /**
     * Test of MostrarTabla method, of class MantenimientoMaestros.
     */
    @Test
    public void testMostrarTabla() {
        System.out.println("MostrarTabla");
        JTable tblm = new JTable();
        MantenimientoMaestros instance = new MantenimientoMaestros();
        JTable expResult = tblm;
        JTable result = instance.MostrarTabla(tblm);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class MantenimientoMaestros.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DMaestros pro = new DMaestros(222, "marco", "electromecanica");
        MantenimientoMaestros instance = new MantenimientoMaestros();
        instance.Eliminar(pro);
    }
    
}
