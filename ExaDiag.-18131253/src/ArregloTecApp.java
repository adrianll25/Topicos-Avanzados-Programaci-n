
/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*          Main donde se mandan a llamar los metodos creados en la clase ArregloTec
:*  Archivo     : ExaDiag-18131253
:*  Autor       : jesus Adrian Lopez Luevanos 18131253
:*  Fecha       : 20/09/2020
:*  Compilador  : NetBeans
:*  Descripción : En esta clase se crea un arreglo y se le asigna valores, despues se manda a llamar 
                  metodos creados en la clase arregloTec y se imprimen
                  para mostrar el resultado en forma consola.
:*           
:*Ultima modificacion:
Fecha        Modifico                      Motivo
20/09/2020   jesus Adrian Lopez L.         Documentacion del codigo
*------------------------------------------------------------------------------------------*/

/**
 *
 * @author adria
 */
public class ArregloTecApp {
     public static void main(String[] args) {
        int vector[] ={12, 8, 47, 61, 26, 3, 55 };
        
        ArregloTec arreglo = new ArregloTec(vector);
        
        System.out.println("Datos en ascendente: ");
        arreglo.getAscendente();
        
        System.out.println("Datos en descendente: ");
        arreglo.getDescendente();
        
        System.out.println("Dato Mayor: ");
        arreglo.getMayor();
        
        System.out.println("Dato Menor: ");
        arreglo.getMenor();
        
        System.out.println("Promedio de los Cuadros: ");
        arreglo.getPromedioCuadrados();
        
    }
}
