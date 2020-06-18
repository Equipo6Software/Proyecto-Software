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
public class MantenimientoObservacionesTest {
    
    public MantenimientoObservacionesTest() {
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
     * Test of Registro_Nuevo method, of class MantenimientoObservaciones.
     */
    @Test
    public void testRegistro_Nuevo() {
        System.out.println("Registro_Nuevo");
        DObservaciones pdto = new DObservaciones(17107, 222, "observaciones");
        MantenimientoObservaciones instance = new MantenimientoObservaciones();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of Actualizar method, of class MantenimientoObservaciones.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DObservaciones pdto = new DObservaciones(17107, 222, "observaciones listas");
        MantenimientoObservaciones instance = new MantenimientoObservaciones();
        instance.Actualizar(pdto);
    }

    /**
     * Test of MostrarTabla method, of class MantenimientoObservaciones.
     */
    @Test
    public void testMostrarTabla() {
        System.out.println("MostrarTabla");
        JTable TablaO = new JTable();
        MantenimientoObservaciones instance = new MantenimientoObservaciones();
        JTable expResult = TablaO;
        JTable result = instance.MostrarTabla(TablaO);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class MantenimientoObservaciones.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DObservaciones pro = new DObservaciones(17107, 222, "observaciones listas");
        MantenimientoObservaciones instance = new MantenimientoObservaciones();
        instance.Eliminar(pro);
    }
    
}
