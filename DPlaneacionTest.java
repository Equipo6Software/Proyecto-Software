/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
public class DPlaneacionTest {
    
    public DPlaneacionTest() {
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
     * Test of getCatedratico method, of class DPlaneacion.
     */
    @Test
    public void testGetCatedratico() {
        System.out.println("getCatedratico");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getCatedratico();
        String result = instance.getCatedratico();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCatedratico method, of class DPlaneacion.
     */
    @Test
    public void testSetCatedratico() {
        System.out.println("setCatedratico");
        String catedratico = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setCatedratico(catedratico);
    }

    /**
     * Test of getPlan_de_estudios method, of class DPlaneacion.
     */
    @Test
    public void testGetPlan_de_estudios() {
        System.out.println("getPlan_de_estudios");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getPlan_de_estudios();
        String result = instance.getPlan_de_estudios();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlan_de_estudios method, of class DPlaneacion.
     */
    @Test
    public void testSetPlan_de_estudios() {
        System.out.println("setPlan_de_estudios");
        String plan_de_estudios = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setPlan_de_estudios(plan_de_estudios);
    }

    /**
     * Test of getPeriodo method, of class DPlaneacion.
     */
    @Test
    public void testGetPeriodo() {
        System.out.println("getPeriodo");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getPeriodo();
        String result = instance.getPeriodo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPeriodo method, of class DPlaneacion.
     */
    @Test
    public void testSetPeriodo() {
        System.out.println("setPeriodo");
        String periodo = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setPeriodo(periodo);
    }

    /**
     * Test of getNombre_de_la_asignatura method, of class DPlaneacion.
     */
    @Test
    public void testGetNombre_de_la_asignatura() {
        System.out.println("getNombre_de_la_asignatura");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getNombre_de_la_asignatura();
        String result = instance.getNombre_de_la_asignatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre_de_la_asignatura method, of class DPlaneacion.
     */
    @Test
    public void testSetNombre_de_la_asignatura() {
        System.out.println("setNombre_de_la_asignatura");
        String Nombre_de_la_asignatura = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setNombre_de_la_asignatura(Nombre_de_la_asignatura);
    }

    /**
     * Test of getClave method, of class DPlaneacion.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        DPlaneacion instance = new DPlaneacion();
        int expResult = 0;
        int result = instance.getClave();
        assertEquals(expResult, result);
    }

    /**
     * Test of setClave method, of class DPlaneacion.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        int clave = 0;
        DPlaneacion instance = new DPlaneacion();
        instance.setClave(clave);
    }

    /**
     * Test of getHoras_teoria method, of class DPlaneacion.
     */
    @Test
    public void testGetHoras_teoria() {
        System.out.println("getHoras_teoria");
        DPlaneacion instance = new DPlaneacion();
        float expResult = 0.0F;
        float result = instance.getHoras_teoria();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHoras_teoria method, of class DPlaneacion.
     */
    @Test
    public void testSetHoras_teoria() {
        System.out.println("setHoras_teoria");
        float horas_teoria = 0.0F;
        DPlaneacion instance = new DPlaneacion();
        instance.setHoras_teoria(horas_teoria);
    }

    /**
     * Test of getHoras_practicas method, of class DPlaneacion.
     */
    @Test
    public void testGetHoras_practicas() {
        System.out.println("getHoras_practicas");
        DPlaneacion instance = new DPlaneacion();
        float expResult = 0.0F;
        float result = instance.getHoras_practicas();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHoras_practicas method, of class DPlaneacion.
     */
    @Test
    public void testSetHoras_practicas() {
        System.out.println("setHoras_practicas");
        float horas_practicas = 0.0F;
        DPlaneacion instance = new DPlaneacion();
        instance.setHoras_practicas(horas_practicas);
    }

    /**
     * Test of getUnidades method, of class DPlaneacion.
     */
    @Test
    public void testGetUnidades() {
        System.out.println("getUnidades");
        DPlaneacion instance = new DPlaneacion();
        int expResult = 0;
        int result = instance.getUnidades();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnidades method, of class DPlaneacion.
     */
    @Test
    public void testSetUnidades() {
        System.out.println("setUnidades");
        int unidades = 0;
        DPlaneacion instance = new DPlaneacion();
        instance.setUnidades(unidades);
    }

    /**
     * Test of getGrupo method, of class DPlaneacion.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getGrupo();
        String result = instance.getGrupo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrupo method, of class DPlaneacion.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        String grupo = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setGrupo(grupo);
    }

    /**
     * Test of getCaracterizacion_de_la_asignatura method, of class DPlaneacion.
     */
    @Test
    public void testGetCaracterizacion_de_la_asignatura() {
        System.out.println("getCaracterizacion_de_la_asignatura");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getCaracterizacion_de_la_asignatura();
        String result = instance.getCaracterizacion_de_la_asignatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCaracterizacion_de_la_asignatura method, of class DPlaneacion.
     */
    @Test
    public void testSetCaracterizacion_de_la_asignatura() {
        System.out.println("setCaracterizacion_de_la_asignatura");
        String Caracterizacion_de_la_asignatura = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setCaracterizacion_de_la_asignatura(Caracterizacion_de_la_asignatura);
    }

    /**
     * Test of getCompetencia method, of class DPlaneacion.
     */
    @Test
    public void testGetCompetencia() {
        System.out.println("getCompetencia");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getCompetencia();
        String result = instance.getCompetencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCompetencia method, of class DPlaneacion.
     */
    @Test
    public void testSetCompetencia() {
        System.out.println("setCompetencia");
        String Competencia = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setCompetencia(Competencia);
    }

    /**
     * Test of getIntencion_didactica method, of class DPlaneacion.
     */
    @Test
    public void testGetIntencion_didactica() {
        System.out.println("getIntencion_didactica");
        DPlaneacion instance = new DPlaneacion();
        String expResult = instance.getIntencion_didactica();
        String result = instance.getIntencion_didactica();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIntencion_didactica method, of class DPlaneacion.
     */
    @Test
    public void testSetIntencion_didactica() {
        System.out.println("setIntencion_didactica");
        String intencion_didactica = "";
        DPlaneacion instance = new DPlaneacion();
        instance.setIntencion_didactica(intencion_didactica);
    }
    
}
