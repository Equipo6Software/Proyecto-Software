/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Alejandro Saenz
 */
public class DCalificaciones {
    private int Numero_de_Control;
    private String Nombre;
    private String Carrera;
    private int ClaveMateria;
    private int U1;
    private int U2;
    private int U3;
    private int U4;
    private int U5;
    private int U6;
    private String Promedio;

    public DCalificaciones(int Numero_de_Control,String Nombre, String Carrera,int ClaveMateria,int U1, int U2, int U3, int U4, int U5, int U6, String Promedio) {
        this.Numero_de_Control = Numero_de_Control;
        this.Nombre=Nombre;
        this.Carrera=Carrera;
        this.ClaveMateria=ClaveMateria;
        this.U1 = U1;
        this.U2 = U2;
        this.U3 = U3;
        this.U4 = U4;
        this.U5 = U5;
        this.U6 = U6;
        this.Promedio = Promedio;
    }
    public DCalificaciones(){
        
    }

    public int getNumero_de_Control() {
        return Numero_de_Control;
    }

    public void setNumero_de_Control(int Numero_de_Control) {
        this.Numero_de_Control = Numero_de_Control;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public int getClaveMateria() {
        return ClaveMateria;
    }

    public void setClaveMateria(int ClaveMateria) {
        this.ClaveMateria = ClaveMateria;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    

   

    public int getU1() {
        return U1;
    }

    public void setU1(int U1) {
        this.U1 = U1;
    }

    public int getU2() {
        return U2;
    }

    public void setU2(int U2) {
        this.U2 = U2;
    }

    public int getU3() {
        return U3;
    }

    public void setU3(int U3) {
        this.U3 = U3;
    }

    public int getU4() {
        return U4;
    }

    public void setU4(int U4) {
        this.U4 = U4;
    }

    public int getU5() {
        return U5;
    }

    public void setU5(int U5) {
        this.U5 = U5;
    }

    public int getU6() {
        return U6;
    }

    

    public void setU6(int U6) {
        this.U6 = U6;
    }

    public String getPromedio() {
        return Promedio;
    }

    public void setPromedio(String Promedio) {
        this.Promedio = Promedio;
    }
    
}
