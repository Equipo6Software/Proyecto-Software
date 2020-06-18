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
public class MantenimientoEvaluacionTest {
    
    public MantenimientoEvaluacionTest() {
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
     * Test of Registro_Nuevo method, of class MantenimientoEvaluacion.
     */
    @Test
    public void testRegistro_Nuevo() {
        System.out.println("Registro_Nuevo");
        DEvaluacion pdto = new DEvaluacion(1, "etapa", "actividades tareas", "evidencias portadas", "criterios de evaluacion", "class a");
        MantenimientoEvaluacion instance = new MantenimientoEvaluacion();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of MostrarTabla2 method, of class MantenimientoEvaluacion.
     */
    @Test
    public void testMostrarTabla2() {
        System.out.println("MostrarTabla2");
        JTable TablaDatos2 = new JTable();
        MantenimientoEvaluacion instance = new MantenimientoEvaluacion();
        JTable expResult = TablaDatos2;
        JTable result = instance.MostrarTabla2(TablaDatos2);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class MantenimientoEvaluacion.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DEvaluacion pro = new DEvaluacion(1, "etapa", "tareas", "portadas", "criterios de evaluacion", "class a");
        MantenimientoEvaluacion instance = new MantenimientoEvaluacion();
        instance.Eliminar(pro);
    }

    /**
     * Test of Actualizar method, of class MantenimientoEvaluacion.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DEvaluacion pdto = new DEvaluacion(1, "etapa", "tareas", "portadas", "criterios de evaluacion", "class a");
        MantenimientoEvaluacion instance = new MantenimientoEvaluacion();
        instance.Actualizar(pdto);
    }
    
}
