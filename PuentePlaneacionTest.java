/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import datos.DPlaneacion;
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
public class PuentePlaneacionTest {

    public PuentePlaneacionTest() {
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
     * Test of PuenteRegistro method, of class PuentePlaneacion.
     */
    @Test
    public void testPuenteRegistro() throws Exception {
        System.out.println("PuenteRegistro");
        DPlaneacion pdto = new DPlaneacion(11, "plan de estudios", "enero-julio", "taller", "juan", 2, 2, 4, "grupo a", "presencial", "generar conocimiento", "practicas");
        PuentePlaneacion instance = new PuentePlaneacion();
        instance.PuenteRegistro(pdto);
    }

    /**
     * Test of PuenteMostrarTabla4 method, of class PuentePlaneacion.
     */
    @Test
    public void testPuenteMostrarTabla4() {
        System.out.println("PuenteMostrarTabla4");
        JTable TablaDatos4 = new JTable();
        PuentePlaneacion instance = new PuentePlaneacion();
        JTable expResult = TablaDatos4;
        JTable result = instance.PuenteMostrarTabla4(TablaDatos4);
        assertEquals(expResult, result);
    }

    /**
     * Test of PuenteActualizar method, of class PuentePlaneacion.
     */
    @Test
    public void testPuenteActualizar() {
        System.out.println("PuenteActualizar");
        DPlaneacion prod = new DPlaneacion(11, "plan de estudios", "enero-julio", "taller", "juan", 2, 2, 5, "grupo a", "presencial", "generar conocimiento", "practicas");
        PuentePlaneacion instance = new PuentePlaneacion();
        instance.PuenteActualizar(prod);
    }

    /**
     * Test of PuenteEliminar method, of class PuentePlaneacion.
     */
    @Test
    public void testPuenteEliminar() {
        System.out.println("PuenteEliminar");
        DPlaneacion pro = new DPlaneacion(11, "plan de estudios", "enero-julio", "taller", "juan", 2, 2, 5, "grupo a", "presencial", "generar conocimiento", "practicas");
        PuentePlaneacion instance = new PuentePlaneacion();
        instance.PuenteEliminar(pro);
    }

}
