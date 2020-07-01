
package datos;

public class Dgrupos {
    private int Id;
    private String Grupo;
    private String Carrera;

    public Dgrupos(int Id, String Grupo, String Carrera) {
        this.Id = Id;
        this.Grupo = Grupo;
        this.Carrera = Carrera;
    }

    public Dgrupos() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
