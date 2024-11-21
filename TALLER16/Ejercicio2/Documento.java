package Ejercicio2;

public abstract class Documento {
    private String tituloDoc;
    private String tipoArchivo;
    
    public Documento(String tituloDoc, String tipoArchivo) {
        this.tituloDoc = tituloDoc;
        this.tipoArchivo = tipoArchivo;
    }

    public String getTituloDoc() {
        return tituloDoc;
    }

    public void setTituloDoc(String tituloDoc) {
        this.tituloDoc = tituloDoc;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    abstract void procesarArchivo();

}

