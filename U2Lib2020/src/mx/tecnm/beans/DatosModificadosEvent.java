/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                          Clase con metodos
:*        
:*  Archivo     : DatosModificadosEvent.java
:*  Autor       : Jesus Adrian Lopez Luevanos
:*  Fecha       : 05/10/2020
:*  Compilador  : JAVA v.8.2
:*  Descripción : Clase con atributos, constructores y metodos 
                  get/set. Se usa para implementar los metodos en los
                  distintos Paneles:
                        -JCilindro, 
                        -JPanelRectangular, 
                        -JPanelTriangular.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 27/Noviembre/20202 
    Modificó: Jesus Adrian Lopez Luevanos             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.beans;

public class DatosModificadosEvent {
    
    //Atributos de la clase
    private double antRadioCilindro;
    private double antAlturaCilindro;
    private double nvoRadioCilindro;
    private double nvoAlturaCilindro;
    
    private double antAlturaPrismaRec;
    private double antAnchoPrismaRec;
    private double antLargoPrismaRec;
    private double nvoAlturaPrismaRec;
    private double nvoAnchoPrismaRec;
    private double nvoLargoPrismaRec;
    
    private double antAlturaPrismaTrian;
    private double antAlturaBasePrisamTrian;
    private double antBasePrismaTrian;
    private double nvoAlturaPrismaTrian;
    private double nvoAlturaBasePrisamTrian;
    private float nvoBasePrismaTrian;
    //---------------------------------------------------------------------------------------
    
    //Constructores
    
    //Consturctor de Cilindro
     public DatosModificadosEvent( double antRadioCilindro, double antAlturaCilindro, 
                                  double nvoRadioCilindro, double nvoAlturaCilindro ) {
        this.antRadioCilindro  = antRadioCilindro;
        this.antAlturaCilindro = antAlturaCilindro;
        this.nvoRadioCilindro  = nvoRadioCilindro;
        this.nvoAlturaCilindro = nvoAlturaCilindro;
    }
    //---------------------------------------------------------------------------------
    
    //Constructor de prisma Rectangular
     public DatosModificadosEvent(double antAnchoPrismaRec, double antLargoPrismaRec, 
                                 double antAlturaPrismaRec, double nvoAnchoPrismaRec,  
                                 double nvoLargoPrismaRec,  double nvoAlturaPrismaRec) {
        this.antAlturaPrismaRec = antAlturaPrismaRec;
        this.antAnchoPrismaRec  = antAnchoPrismaRec;
        this.antLargoPrismaRec  = antLargoPrismaRec;
        this.nvoAlturaPrismaRec = nvoAlturaPrismaRec;
        this.nvoAnchoPrismaRec  = nvoAnchoPrismaRec;
        this.nvoLargoPrismaRec  = nvoLargoPrismaRec;
    }
    //-------------------------------------------------------------------------------------------
    
    //Constructor de prisma Triangular
      public DatosModificadosEvent(double antBasePrismaTrian,       double antAlturaBasePrisamTrian,
                                  double antAlturaPrismaTrian,      float nvoBasePrismaTrian,  
                                  double nvoAlturaBasePrisamTrian,  double nvoAlturaPrismaTrian ) {
        this.antAlturaPrismaTrian     = antAlturaPrismaTrian;
        this.antAlturaBasePrisamTrian = antAlturaBasePrisamTrian;
        this.antBasePrismaTrian       = antBasePrismaTrian;
        this.nvoAlturaPrismaTrian     = nvoAlturaPrismaTrian;
        this.nvoAlturaBasePrisamTrian = nvoAlturaBasePrisamTrian;
        this.nvoBasePrismaTrian       = nvoBasePrismaTrian;
    }

    public double getAntRadioCilindro() {
        return antRadioCilindro;
    }

    public void setAntRadioCilindro(double antRadioCilindro) {
        this.antRadioCilindro = antRadioCilindro;
    }

    public double getAntAlturaCilindro() {
        return antAlturaCilindro;
    }

    public void setAntAlturaCilindro(double antAlturaCilindro) {
        this.antAlturaCilindro = antAlturaCilindro;
    }

    public double getNvoRadioCilindro() {
        return nvoRadioCilindro;
    }

    public void setNvoRadioCilindro(double nvoRadioCilindro) {
        this.nvoRadioCilindro = nvoRadioCilindro;
    }

    public double getNvoAlturaCilindro() {
        return nvoAlturaCilindro;
    }

    public void setNvoAlturaCilindro(double nvoAlturaCilindro) {
        this.nvoAlturaCilindro = nvoAlturaCilindro;
    }

    public double getAntAlturaPrismaRec() {
        return antAlturaPrismaRec;
    }

    public void setAntAlturaPrismaRec(double antAlturaPrismaRec) {
        this.antAlturaPrismaRec = antAlturaPrismaRec;
    }

    public double getAntAnchoPrismaRec() {
        return antAnchoPrismaRec;
    }

    public void setAntAnchoPrismaRec(double antAnchoPrismaRec) {
        this.antAnchoPrismaRec = antAnchoPrismaRec;
    }

    public double getAntLargoPrismaRec() {
        return antLargoPrismaRec;
    }

    public void setAntLargoPrismaRec(double antLargoPrismaRec) {
        this.antLargoPrismaRec = antLargoPrismaRec;
    }

    public double getNvoAlturaPrismaRec() {
        return nvoAlturaPrismaRec;
    }

    public void setNvoAlturaPrismaRec(double nvoAlturaPrismaRec) {
        this.nvoAlturaPrismaRec = nvoAlturaPrismaRec;
    }

    public double getNvoAnchoPrismaRec() {
        return nvoAnchoPrismaRec;
    }

    public void setNvoAnchoPrismaRec(double nvoAnchoPrismaRec) {
        this.nvoAnchoPrismaRec = nvoAnchoPrismaRec;
    }

    public double getNvoLargoPrismaRec() {
        return nvoLargoPrismaRec;
    }

    public void setNvoLargoPrismaRec(double nvoLargoPrismaRec) {
        this.nvoLargoPrismaRec = nvoLargoPrismaRec;
    }

    public double getAntAlturaPrismaTrian() {
        return antAlturaPrismaTrian;
    }

    public void setAntAlturaPrismaTrian(double antAlturaPrismaTrian) {
        this.antAlturaPrismaTrian = antAlturaPrismaTrian;
    }

    public double getAntAlturaBasePrisamTrian() {
        return antAlturaBasePrisamTrian;
    }

    public void setAntAlturaBasePrisamTrian(double antAlturaBasePrisamTrian) {
        this.antAlturaBasePrisamTrian = antAlturaBasePrisamTrian;
    }

    public double getAntBasePrismaTrian() {
        return antBasePrismaTrian;
    }

    public void setAntBasePrismaTrian(double antBasePrismaTrian) {
        this.antBasePrismaTrian = antBasePrismaTrian;
    }

    public double getNvoAlturaPrismaTrian() {
        return nvoAlturaPrismaTrian;
    }

    public void setNvoAlturaPrismaTrian(double nvoAlturaPrismaTrian) {
        this.nvoAlturaPrismaTrian = nvoAlturaPrismaTrian;
    }

    public double getNvoAlturaBasePrisamTrian() {
        return nvoAlturaBasePrisamTrian;
    }

    public void setNvoAlturaBasePrisamTrian(double nvoAlturaBasePrisamTrian) {
        this.nvoAlturaBasePrisamTrian = nvoAlturaBasePrisamTrian;
    }

    public float getNvoBasePrismaTrian() {
        return nvoBasePrismaTrian;
    }

    public void setNvoBasePrismaTrian(float nvoBasePrismaTrian) {
        this.nvoBasePrismaTrian = nvoBasePrismaTrian;
    }

}

   