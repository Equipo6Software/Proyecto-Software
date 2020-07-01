
package datos;


public class DPlaneacion {
      private String catedratico;
      private String plan_de_estudios;
      private String periodo;
      private String Nombre_de_la_asignatura;
      private int clave;
      private float horas_teoria;
      private float horas_practicas;
      private int unidades;
      private String grupo;
      private String Caracterizacion_de_la_asignatura;
      private String Competencia;
      private String intencion_didactica;

    public DPlaneacion(int clave, String plan_de_estudios, String periodo, String Nombre_de_la_asignatura,String catedratico,  float horas_teoria, float horas_practicas, int unidades, String grupo, String Caracterizacion_de_la_asignatura, String Competencia, String intencion_didactica) {
        this.catedratico = catedratico;
        this.plan_de_estudios = plan_de_estudios;
        this.periodo = periodo;
        this.Nombre_de_la_asignatura = Nombre_de_la_asignatura;
        this.clave = clave;
        this.horas_teoria = horas_teoria;
        this.horas_practicas = horas_practicas;
        this.unidades = unidades;
        this.grupo = grupo;
        this.Caracterizacion_de_la_asignatura = Caracterizacion_de_la_asignatura;
        this.Competencia = Competencia;
        this.intencion_didactica = intencion_didactica;
    }

    public DPlaneacion() {
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public String getPlan_de_estudios() {
        return plan_de_estudios;
    }

    public void setPlan_de_estudios(String plan_de_estudios) {
        this.plan_de_estudios = plan_de_estudios;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNombre_de_la_asignatura() {
        return Nombre_de_la_asignatura;
    }

    public void setNombre_de_la_asignatura(String Nombre_de_la_asignatura) {
        this.Nombre_de_la_asignatura = Nombre_de_la_asignatura;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public float getHoras_teoria() {
        return horas_teoria;
    }

    public void setHoras_teoria(float horas_teoria) {
        this.horas_teoria = horas_teoria;
    }

    public float getHoras_practicas() {
        return horas_practicas;
    }

    public void setHoras_practicas(float horas_practicas) {
        this.horas_practicas = horas_practicas;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCaracterizacion_de_la_asignatura() {
        return Caracterizacion_de_la_asignatura;
    }

    public void setCaracterizacion_de_la_asignatura(String Caracterizacion_de_la_asignatura) {
        this.Caracterizacion_de_la_asignatura = Caracterizacion_de_la_asignatura;
    }

    public String getCompetencia() {
        return Competencia;
    }

    public void setCompetencia(String Competencia) {
        this.Competencia = Competencia;
    }

    public String getIntencion_didactica() {
        return intencion_didactica;
    }

    public void setIntencion_didactica(String intencion_didactica) {
        this.intencion_didactica = intencion_didactica;
    }
      
}
