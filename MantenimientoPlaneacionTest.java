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
public class MantenimientoPlaneacionTest {

    public MantenimientoPlaneacionTest() {
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
     * Test of Registro_Nuevo method, of class MantenimientoPlaneacion.
     */
    @Test
    public void testRegistro_Nuevo() throws Exception {
        System.out.println("Registro_Nuevo");
        DPlaneacion pdto = new DPlaneacion(0, "plan_de_estudios", "periodo", "Nombre_de_la_asignatura", "catedratico", 0, 0, 0, "grupo", "Caracterizacion_de_la_asignatura", "Competencia", "intencion_didactica");
        MantenimientoPlaneacion instance = new MantenimientoPlaneacion();
        instance.Registro_Nuevo(pdto);
    }

    /**
     * Test of MostrarTabla4 method, of class MantenimientoPlaneacion.
     */
    @Test
    public void testMostrarTabla4() {
        System.out.println("MostrarTabla4");
        JTable TablaDatos4 = new JTable();
        MantenimientoPlaneacion instance = new MantenimientoPlaneacion();
        JTable expResult = TablaDatos4;
        JTable result = instance.MostrarTabla4(TablaDatos4);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class MantenimientoPlaneacion.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        DPlaneacion pro = new DPlaneacion(0, "plan_de_estudios", "periodo", "Nombre_de_la_asignatura", "catedratico", 0, 0, 0, "grupo", "Caracterizacion_de_la_asignatura", "Competencia", "intencion_didactica");
        MantenimientoPlaneacion instance = new MantenimientoPlaneacion();
        instance.Eliminar(pro);
    }

    /**
     * Test of Actualizar method, of class MantenimientoPlaneacion.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        DPlaneacion pdto = new DPlaneacion(0, "plan_de_estudios", "periodo", "Nombre_de_la_asignatura", "catedratico", 0, 0, 0, "grupo", "Caracterizacion_de_la_asignatura", "Competencia", "intencion_didactica");
        MantenimientoPlaneacion instance = new MantenimientoPlaneacion();
        instance.Actualizar(pdto);
    }

}
