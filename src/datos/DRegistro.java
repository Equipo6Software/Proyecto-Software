
package datos;


public class DRegistro {
  private int Clave;
    private String Nombre_de_la_asignatura;
    
    private int HorasTeoria;
   private int HorasPractica;
   private int Unidades;
   private String Grupo;

    public DRegistro( int Clave,String Nombre_de_la_asignatura, int HorasTeoria, int HorasPractica, int Unidades, String Grupo) {
        this.Nombre_de_la_asignatura = Nombre_de_la_asignatura;
        this.Clave = Clave;
        this.HorasTeoria = HorasTeoria;
        this.HorasPractica = HorasPractica;
        this.Unidades = Unidades;
        this.Grupo = Grupo;
    }

    public DRegistro() {
    }

    public String getNombre_de_la_asignatura() {
        return Nombre_de_la_asignatura;
        
    }

    public void setNombre_de_la_asignatura(String Nombre_de_la_asignatura) {
        this.Nombre_de_la_asignatura = Nombre_de_la_asignatura;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public int getHorasTeoria() {
        return HorasTeoria;
    }

    public void setHorasTeoria(int HorasTeoria) {
        this.HorasTeoria = HorasTeoria;
    }

    public int getHorasPractica() {
        return HorasPractica;
    }

    public void setHorasPractica(int HorasPractica) {
        this.HorasPractica = HorasPractica;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }
   
   
}
