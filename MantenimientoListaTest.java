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
public class MantenimientoListaTest {
    
    public MantenimientoListaTest() {
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
     * Test of Registro_Nuevo method, of class MantenimientoLista.
     */
    @Test
    public void testRegistro_Nuevo() {
        System.out.println("Registro_Nuevo");
        DLista pdto = new DLista(17107, 111, "simulacion", "sistemas");
        MantenimientoLista instance = new MantenimientoLista();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of MostrarTabla3 method, of class MantenimientoLista.
     */
    @Test
    public void testMostrarTabla3() {
        System.out.println("MostrarTabla3");
        JTable TablaDatos3 = new JTable();
        MantenimientoLista instance = new MantenimientoLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.MostrarTabla3(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaSistemas method, of class MantenimientoLista.
     */
    @Test
    public void testMostrarTablaSistemas() {
        System.out.println("MostrarTablaSistemas");
        JTable TablaDatos3 = new JTable();
        MantenimientoLista instance = new MantenimientoLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.MostrarTablaSistemas(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaElectromecanica method, of class MantenimientoLista.
     */
    @Test
    public void testMostrarTablaElectromecanica() {
        System.out.println("MostrarTablaElectromecanica");
        JTable TablaDatos3 = new JTable();
        MantenimientoLista instance = new MantenimientoLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.MostrarTablaElectromecanica(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaIndustrial method, of class MantenimientoLista.
     */
    @Test
    public void testMostrarTablaIndustrial() {
        System.out.println("MostrarTablaIndustrial");
        JTable TablaDatos3 = new JTable();
        MantenimientoLista instance = new MantenimientoLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.MostrarTablaIndustrial(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaRenovables method, of class MantenimientoLista.
     */
    @Test
    public void testMostrarTablaRenovables() {
        System.out.println("MostrarTablaRenovables");
        JTable TablaDatos3 = new JTable();
        MantenimientoLista instance = new MantenimientoLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.MostrarTablaRenovables(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaIGE method, of class MantenimientoLista.
     */
    @Test
    public void testMostrarTablaIGE() {
        System.out.println("MostrarTablaIGE");
        JTable TablaDatos3 = new JTable();
        MantenimientoLista instance = new MantenimientoLista();
        JTable expResult = TablaDatos3;
        JTable result = instance.MostrarTablaIGE(TablaDatos3);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class MantenimientoLista.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DLista pro = new DLista(17107, 111, "software", "sistemas");
        MantenimientoLista instance = new MantenimientoLista();
        instance.Eliminar(pro);
    }

    /**
     * Test of Actualizar method, of class MantenimientoLista.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DLista pdto = new DLista(17107, 111, "software", "sistemas");
        MantenimientoLista instance = new MantenimientoLista();
        instance.Actualizar(pdto);
    }
    
}
