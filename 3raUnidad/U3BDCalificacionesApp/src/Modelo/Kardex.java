/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*              Clase kardex con métodos que se implementan en una clase 
:*        
:*  Archivo     : Kardex.java
:*  Autor       : Jesus Adrian Lopez Luevanos 18131253
:*  Fecha       : 21/09/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permite saber e ingresar
                  datos de un alumnos y sus materias.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha:  
    Modificó:   
    Motivo:     
:*------------------------------------------------------------------------------------------*/


package Modelo;

public class Kardex {
   
    private int    idcalif;
    private String matricula;
    private String idmateria;
    private String periodo;
    private int    calificacion;

    public Kardex(int idcalif, String matricula, String idmateria, String periodo, int calificacion) {
        this.idcalif = idcalif;
        this.matricula = matricula;
        this.idmateria = idmateria;
        this.periodo = periodo;
        this.calificacion = calificacion;
    }

    public int getIdcalif() {
        return idcalif;
    }

    public void setIdcalif(int idcalif) {
        this.idcalif = idcalif;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
