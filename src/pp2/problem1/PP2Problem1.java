/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problem1;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    verificarAño(solicitarDatos("año")); //Se solicita el año y mediante el metodo verficiarAño se obtiene el resultado
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static void verificarAño(int a){
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0){ //Si el residuo de la division del año entre 4 es igual a 0
                                                         // y si el residuo de la division del año entre 100 es diferente de 0
                                                         // o si el residuo de la division del año entre 400 es igual a 0
              muestraVeredicto("es bisiesto"); //Se muestra que es bisiesto
    }else                                      //sino
              muestraVeredicto("no es bisiesto"); //Se muestra que no es bisiesto
    }
    public static void muestraVeredicto(String d){ //Metodo para mostrar el resultado de la verificacion
        System.out.print ("El año " + d);
    }
}