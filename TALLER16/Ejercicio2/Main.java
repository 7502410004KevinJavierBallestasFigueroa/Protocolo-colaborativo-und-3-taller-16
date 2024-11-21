package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Documento doc1 = new DocumentoPdf("La odisea", "DOCX");
        Documento doc2 = new DocumentoWord("La odisea", "DOCX");
        Documento doc3 = new DocumentoExcel("La odisea", "DOCX");

        System.out.println("*****************************************************");
        System.out.println("Información del guardado del primer documento en PDF: "+doc1.getTipoArchivo());
        doc1.procesarArchivo();
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Información del guardado del segundo documento en WORD: "+doc2.getTipoArchivo());
        doc2.procesarArchivo();
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Información del guardado del tercero documento en EXCEL: "+doc3.getTipoArchivo());
        doc3.procesarArchivo();
        System.out.println("*****************************************************");
    }
}
