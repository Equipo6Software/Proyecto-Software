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
public class DRegistroTest {
    
    public DRegistroTest() {
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
     * Test of getNombre_de_la_asignatura method, of class DRegistro.
     */
    @Test
    public void testGetNombre_de_la_asignatura() {
        System.out.println("getNombre_de_la_asignatura");
        DRegistro instance = new DRegistro();
        String expResult = instance.getNombre_de_la_asignatura();
        String result = instance.getNombre_de_la_asignatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre_de_la_asignatura method, of class DRegistro.
     */
    @Test
    public void testSetNombre_de_la_asignatura() {
        System.out.println("setNombre_de_la_asignatura");
        String Nombre_de_la_asignatura = "";
        DRegistro instance = new DRegistro();
        instance.setNombre_de_la_asignatura(Nombre_de_la_asignatura);
    }

    /**
     * Test of getClave method, of class DRegistro.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        DRegistro instance = new DRegistro();
        int expResult = 0;
        int result = instance.getClave();
        assertEquals(expResult, result);
    }

    /**
     * Test of setClave method, of class DRegistro.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        int Clave = 0;
        DRegistro instance = new DRegistro();
        instance.setClave(Clave);
    }

    /**
     * Test of getHorasTeoria method, of class DRegistro.
     */
    @Test
    public void testGetHorasTeoria() {
        System.out.println("getHorasTeoria");
        DRegistro instance = new DRegistro();
        int expResult = 0;
        int result = instance.getHorasTeoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHorasTeoria method, of class DRegistro.
     */
    @Test
    public void testSetHorasTeoria() {
        System.out.println("setHorasTeoria");
        int HorasTeoria = 0;
        DRegistro instance = new DRegistro();
        instance.setHorasTeoria(HorasTeoria);
    }

    /**
     * Test of getHorasPractica method, of class DRegistro.
     */
    @Test
    public void testGetHorasPractica() {
        System.out.println("getHorasPractica");
        DRegistro instance = new DRegistro();
        int expResult = 0;
        int result = instance.getHorasPractica();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHorasPractica method, of class DRegistro.
     */
    @Test
    public void testSetHorasPractica() {
        System.out.println("setHorasPractica");
        int HorasPractica = 0;
        DRegistro instance = new DRegistro();
        instance.setHorasPractica(HorasPractica);
    }

    /**
     * Test of getUnidades method, of class DRegistro.
     */
    @Test
    public void testGetUnidades() {
        System.out.println("getUnidades");
        DRegistro instance = new DRegistro();
        int expResult = 0;
        int result = instance.getUnidades();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnidades method, of class DRegistro.
     */
    @Test
    public void testSetUnidades() {
        System.out.println("setUnidades");
        int Unidades = 0;
        DRegistro instance = new DRegistro();
        instance.setUnidades(Unidades);
    }

    /**
     * Test of getGrupo method, of class DRegistro.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        DRegistro instance = new DRegistro();
        String expResult = instance.getGrupo();
        String result = instance.getGrupo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrupo method, of class DRegistro.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        String Grupo = "";
        DRegistro instance = new DRegistro();
        instance.setGrupo(Grupo);
    }
    
}
