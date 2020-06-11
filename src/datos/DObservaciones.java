/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;


public class DObservaciones {
    private int Id;
    private int Id_Maestro;
    private String Observacion;

    public DObservaciones(int Id,int Id_Maestro, String Observacion) {
        this.Id=Id;
        this.Id_Maestro=Id_Maestro;
        this.Observacion = Observacion;
    }

    public DObservaciones() {
    }

    public int getId() {
        return Id;
    }

    public int getId_Maestro() {
        return Id_Maestro;
    }

    public void setId_Maestro(int Id_Maestro) {
        this.Id_Maestro = Id_Maestro;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    
}
