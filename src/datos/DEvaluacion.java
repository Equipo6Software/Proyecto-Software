
package datos;


public class DEvaluacion {
    private int Unidad;
    private String Etapa;
    private String Actividades;
    private String Evidencias;
    private String Criterios_de_Evaluacion;
    private String c;
    public DEvaluacion(int Unidad, String Etapa, String Actividades, String Evidencias, String Criterios_de_Evaluacion, String c) {
        this.Unidad = Unidad;
        this.Etapa = Etapa;
        this.Actividades = Actividades;
        this.Evidencias = Evidencias;
        this.Criterios_de_Evaluacion = Criterios_de_Evaluacion;
        this.c=c;
    }

    public DEvaluacion() {
    }

   

    public int getUnidad() {
        return Unidad;
    }

    public void setUnidad(int Unidad) {
        this.Unidad = Unidad;
    }

    public String getEtapa() {
        return Etapa;
    }

    public void setEtapa(String Etapa) {
        this.Etapa = Etapa;
    }

    public String getActividades() {
        return Actividades;
    }

    public void setActividades(String Actividades) {
        this.Actividades = Actividades;
    }

    public String getEvidencias() {
        return Evidencias;
    }

    public void setEvidencias(String Evidencias) {
        this.Evidencias = Evidencias;
    }

    public String getCriterios_de_Evaluacion() {
        return Criterios_de_Evaluacion;
    }

    public void setCriterios_de_Evaluacion(String Criterios_de_Evaluacion) {
        this.Criterios_de_Evaluacion = Criterios_de_Evaluacion;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    
    
}
