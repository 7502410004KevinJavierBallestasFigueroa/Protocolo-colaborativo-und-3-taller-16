package Ejercicio2;

public class DocumentoPdf extends Documento {

    public DocumentoPdf(String tituloDoc, String archivoDoc){
        super(tituloDoc, archivoDoc);
    }

    @Override
    public void procesarArchivo(){
        if("PDF".equals(getTipoArchivo())){
            System.out.println("Se está guardando su archivo...");
            System.out.println("Archivo guardado con éxito");
        } else{
            System.out.println("Su archivo no es compatible para ser guardado");
        }
    }
    
}
