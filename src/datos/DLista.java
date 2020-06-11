
package datos;


public class DLista {
   private int NC;
    private int ClaveMateria;
    private String Nombre;
    
    private String Carrera;

    public DLista( int NC,int ClaveMateria, String Nombre, String Carrera) {
       this.NC = NC;
        this.ClaveMateria= ClaveMateria;
        this.Nombre = Nombre;
       
        
        this.Carrera=Carrera;
        
    }

    public DLista() {
    }

    public int getClaveMateria() {
        return ClaveMateria;
    }

    public void setClaveMateria(int ClaveMateria) {
        this.ClaveMateria = ClaveMateria;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }
     public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
}
