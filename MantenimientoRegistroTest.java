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
public class MantenimientoRegistroTest {
    
    public MantenimientoRegistroTest() {
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
     * Test of Registro_Nuevo method, of class MantenimientoRegistro.
     */
    @Test
    public void testRegistro_Nuevo() {
        System.out.println("Registro_Nuevo");
        DRegistro pdto = new DRegistro(0, "Nombre_de_la_asignatura", 0, 0, 0, "Grupo");
        MantenimientoRegistro instance = new MantenimientoRegistro();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of MostrarTabla method, of class MantenimientoRegistro.
     */
    @Test
    public void testMostrarTabla() {
        System.out.println("MostrarTabla");
        JTable TablaDatosx = new JTable();
        MantenimientoRegistro instance = new MantenimientoRegistro();
        JTable expResult = TablaDatosx;
        JTable result = instance.MostrarTabla(TablaDatosx);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablax1 method, of class MantenimientoRegistro.
     */
    @Test
    public void testMostrarTablax1() {
        System.out.println("MostrarTablax1");
        JTable TablaDatosx1 = new JTable();
        MantenimientoRegistro instance = new MantenimientoRegistro();
        JTable expResult = TablaDatosx1;
        JTable result = instance.MostrarTablax1(TablaDatosx1);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class MantenimientoRegistro.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DRegistro pro = new DRegistro(0, "Nombre_de_la_asignatura", 0, 0, 0, "Grupo");
        MantenimientoRegistro instance = new MantenimientoRegistro();
        instance.Eliminar(pro);
    }

    /**
     * Test of Actualizar method, of class MantenimientoRegistro.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DRegistro pdto = new DRegistro(0, "Nombre_de_la_asignatura", 0, 0, 0, "Grupo");
        MantenimientoRegistro instance = new MantenimientoRegistro();
        instance.Actualizar(pdto);
        
    }
    
}
