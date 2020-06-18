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
public class Mantenimiento_CalificacionesTest {
    
    public Mantenimiento_CalificacionesTest() {
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
     * Test of Registro_Nuevo method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testRegistro_Nuevo() {
        System.out.println("Registro_Nuevo");
        DCalificaciones pdto = new DCalificaciones(0, "Nombre", "Carrera", 1, 2, 3, 4, 5, 6, 7, "Promedio");
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of MostrarTabla method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testMostrarTabla() {
        System.out.println("MostrarTabla");
        JTable TablaDatos = new JTable();
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        JTable expResult = TablaDatos;
        JTable result = instance.MostrarTabla(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaSistemas method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testMostrarTablaSistemas() {
        System.out.println("MostrarTablaSistemas");
        JTable TablaDatos = new JTable();
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        JTable expResult = TablaDatos;
        JTable result = instance.MostrarTablaSistemas(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaElectromecanica method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testMostrarTablaElectromecanica() {
        System.out.println("MostrarTablaElectromecanica");
        JTable TablaDatos = new JTable();
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        JTable expResult = TablaDatos;
        JTable result = instance.MostrarTablaElectromecanica(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaIndustrial method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testMostrarTablaIndustrial() {
        System.out.println("MostrarTablaIndustrial");
        JTable TablaDatos = new JTable();
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        JTable expResult = TablaDatos;
        JTable result = instance.MostrarTablaIndustrial(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaRenovables method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testMostrarTablaRenovables() {
        System.out.println("MostrarTablaRenovables");
        JTable TablaDatos = new JTable();
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        JTable expResult = TablaDatos;
        JTable result = instance.MostrarTablaRenovables(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of MostrarTablaIGE method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testMostrarTablaIGE() {
        System.out.println("MostrarTablaIGE");
        JTable TablaDatos = new JTable();
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        JTable expResult = TablaDatos;
        JTable result = instance.MostrarTablaIGE(TablaDatos);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DCalificaciones pro = new DCalificaciones(0, "Nombre", "Carrera", 1, 2, 3, 4, 5, 6, 7, "Promedio");
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        instance.Eliminar(pro);
    }

    /**
     * Test of Actualizar method, of class Mantenimiento_Calificaciones.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DCalificaciones pdto = new DCalificaciones(0, "Nombre", "Carrera", 1, 2, 3, 4, 5, 6, 7, "Promedio");
        Mantenimiento_Calificaciones instance = new Mantenimiento_Calificaciones();
        instance.Actualizar(pdto);
    }
    
}
