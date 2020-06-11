/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;


public class DMaestros {
 private int Id_Maestro;
 private String Nombre;
 private String Area;

    public DMaestros(int Id_Maestro, String Nombre, String Area) {
        this.Id_Maestro = Id_Maestro;
        this.Nombre = Nombre;
        this.Area = Area;
    }

    public DMaestros() {
    }

    public int getId_Maestro() {
        return Id_Maestro;
    }

    public void setId_Maestro(int Id_Maestro) {
        this.Id_Maestro = Id_Maestro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
}
