
/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS
:*
:*          Clase donde se crean los metodos para ordenar ascendente y desendente, sacar el mayor y menor
                                       y el promedio 
:*  Archivo     : ExaDiag-18131253
:*  Autor       : jesus Adrian Lopez Luevanos 18131253
:*  Fecha       : 20/09/2020
:*  Compilador  : NetBeans
:*  Descripción : Este programa usa la clase para la elaboracion de un arreglo que ayudara para 
                  realizacion de metodos que nos pide el examen de diagnostico como por ejemplo la 
                  ordenacion en forma ascendente y descendete, sacar el mayor y menor y su promedio.
                  Utilizaremos un arreglo y varios ciclos para comparar y acomodar y encontrar el resultado.
:*           
:*
Ultima modificacion:
Fecha        Modifico                      Motivo
20/09/2020   jesus Adrian Lopez L.         Documentacion del codigo
:*------------------------------------------------------------------------------------------*/

/**
 *
 * @author adria
 */
public class ArregloTec {
private int numero [];
    
    public ArregloTec(int vector [])
    {
        this.numero = vector;
    }
    
    //getAscendente 
    public void getAscendente()
    {
        int arregloaux [] = new int[numero.length];
        int aux;
        for(int i=0; i< numero.length; i++)
            arregloaux [i] = numero[i];
        for(int i=0;i<numero.length; i++)
            for(int j=numero.length-1; i<j; j--)
            {
                if(arregloaux[i]>arregloaux[j])
                {
                    aux = arregloaux[i];
                    arregloaux[i]=arregloaux[j];
                    arregloaux[j] =aux;
                }
            }
        for(int i=0; i< arregloaux.length; i++)
        {
            if(i==arregloaux.length-1)
                System.out.println(arregloaux[i]);
            else
                System.out.print(arregloaux[i]+", ");
        }
           
    }
    
    //getDesendente
    public void getDescendente()
    {
        int arregloAux [] = new int[numero.length];
        int Aux;
        for(int i=0; i< numero.length; i++)
            arregloAux [i] = numero[i];
        for(int i=0;i<numero.length; i++)
            for(int j=numero.length-1; i<j; j--)
            {
                if(arregloAux[i]<arregloAux[j])
                {
                    Aux = arregloAux[i];
                    arregloAux[i]=arregloAux[j];
                    arregloAux[j] =Aux;
                }
            }
        for(int i=0; i< arregloAux.length; i++)
        {
            if(i==arregloAux.length-1)
                System.out.println(arregloAux[i]);
            else
            System.out.print(arregloAux[i]+", ");
        }
          
    }
    
    //getMayor
    public void getMayor()
    {
        int Mayor=numero[0];
        for(int i=1;i<numero.length; i++)
            for(int j=numero.length-1; i<j; j--)
                if(Mayor<=numero[j])
                    Mayor = numero[j];
        System.out.println(Mayor);
    }
    
    //getmenor
    public void getMenor()
    {
        int Menor=numero[0];
        for(int i=1;i<numero.length; i++)
            for(int j=numero.length-1; i<j; j--)
                if(Menor>=numero[j])
                    Menor = numero[j];
        System.out.println(Menor);
    }

    //getpromedio 
    public void getPromedioCuadrados()
    {
        int sumaCuadrados=0;
        double prom;
        for(int i=0; i< numero.length; i++)
            sumaCuadrados += Math.pow(numero[i], 2);
        prom = sumaCuadrados/Double.parseDouble(numero.length+"");
        System.out.println(prom);
       }
    
    }
