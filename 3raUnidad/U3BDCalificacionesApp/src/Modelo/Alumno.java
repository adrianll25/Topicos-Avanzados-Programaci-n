/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                Clase con métodos que se implementan en una clase 
:*        
:*  Archivo     : Alumno.java
:*  Autor       : Jesus Adrian Lopez Luevanos 18131253
:*  Fecha       : 13/16/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permite conocer e ingresar
                  los datos de un alumnos y muestra los resultados en un Jlabel en un jFrame:
                  -Matricula
                  -Nombre
                  -Apellidos
                  -Edad
                  -Promedio
                 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 
    Modificó:            
    Motivo:     
:*------------------------------------------------------------------------------------------*/
package Modelo;


public class Alumno {
    private String matricula;
    private String nombre;
    private String apellidos;
    private int    edad;
    private float  promedio;

    public Alumno(String matricula, String nombre, String apellidos, int edad, float promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public String toString () {
        return nombre + " " + apellidos;
    }
    
}
