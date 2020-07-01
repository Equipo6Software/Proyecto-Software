
package datos;


public class DEvaluacion {
    private int Identificador;
    private int Unidad;
    private String Etapa;
    private String Actividades;
    private String Evidencias;
    private String Criterios_de_Evaluacion;
    private int ClaveM;
    private String RutaImagen;
    private String Imagen;
     private String RutaImagen2;
    private String Imagen2;
    public DEvaluacion(int Identificador,int Unidad, String Etapa, String Actividades, String Evidencias, String Criterios_de_Evaluacion, String c,int ClaveM, String RutaImagen, String Imagen,String RutaImagen2, String Imagen2) {
        this.Identificador=Identificador;
        this.Unidad = Unidad;
        this.Etapa = Etapa;
        this.Actividades = Actividades;
        this.Evidencias = Evidencias;
        this.Criterios_de_Evaluacion = Criterios_de_Evaluacion;
        this.ClaveM=ClaveM;
        this.RutaImagen=RutaImagen;
        this.Imagen=Imagen;
        this.RutaImagen2=RutaImagen2;
        this.Imagen2=Imagen2;
    }

    public String getRutaImagen2() {
        return RutaImagen2;
    }

    public void setRutaImagen2(String RutaImagen2) {
        this.RutaImagen2 = RutaImagen2;
    }

    public String getImagen2() {
        return Imagen2;
    }

    public void setImagen2(String Imagen2) {
        this.Imagen2 = Imagen2;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public int getId() {
        return Identificador;}

    public void setId(int Identificador) {
        this.Identificador = Identificador;
    }

    public int getClaveM() {
        return ClaveM;
    }

    public void setClaveM(int ClaveM) {
        this.ClaveM = ClaveM;
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

    
    
    
}
