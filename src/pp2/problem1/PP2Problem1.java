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
    
    }
    public static int solicitarDatos(String d){
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static String verificarAño(int a){
        
        if (a % o/4 == 0) && (a % 100 != 0) || (a % 400 == 0){
        
    }
        return 
    }
    public static void muestraVeridicto(int a){
        String b;
        if (a==1){
            b="bisiesto";
        }else{
            b="no es bisiesto";
        }
        System.out.print ("El año es " + b);
    }
}
