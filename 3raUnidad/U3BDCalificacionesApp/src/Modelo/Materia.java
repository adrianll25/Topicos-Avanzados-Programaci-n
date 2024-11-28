
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
                  datos de las materias.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha:  
    Modificó:   
    Motivo:     
:*------------------------------------------------------------------------------------------*/
package Modelo;


public class Materia {
   
    private String idmateria;
    private String materia;
    private int creditos;

    public Materia(String idmateria, String materia, int creditos) {
        this.idmateria = idmateria;
        this.materia = materia;
        this.creditos = creditos;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    @Override
    public String toString(){
        return materia + " ";
        
    }
    
}
