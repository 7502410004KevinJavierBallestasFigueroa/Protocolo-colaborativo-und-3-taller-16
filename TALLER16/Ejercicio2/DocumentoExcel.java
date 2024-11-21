package Ejercicio2;

public class DocumentoExcel extends Documento {
    public DocumentoExcel(String tituloDoc, String tipoArchivo){
        super(tituloDoc,tipoArchivo);
    }
    
    @Override
    public void procesarArchivo(){
        if("XLSX".equals(getTipoArchivo())){
            System.out.println("Se está guardando su archivo...");
            System.out.println("Archivo guardado con éxito");
        } else{
            System.out.println("Su archivo no es compatible para ser guardado");
        }
    }
}
