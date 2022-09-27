/**
 * @author Daw120
 * 
 * 5. Diseña una aplicación que solicite al usuario que introduzca una cantidad de 
      segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay 
      en el número de segundos introducidos por el usuario
 */
package com.solomongo.ejercicio5_hoja3;
import javax.swing.JOptionPane;
public class Ejercicio5_Hoja3 {
public static void main(String[] args) {
   float horas, minutos;
   String segundos;  // va del String que mete el user
   float segundosOP; // hasta (por ejemplo float) con otra variableOPERADORA o AUX
   // ENTRADA:
   segundos=JOptionPane.showInputDialog("Mete segundos:");
   segundosOP=Float.parseFloat(segundos);  // aqui pasa el String a Float.parseFloat(ESTA VAR!!!);
   System.out.printf("\nLos segundos son: %,.0f",segundosOP); 
  
   // CALCULOS:     
   minutos=segundosOP/60;
   horas=segundosOP/3600; // 1 HORA SON 3600 SEGUNDOS!!!!!!!!!!
  
   // veo lo anterior.....;(
   System.out.print("\n\n\t- Minutos:"+minutos+"\n");
   System.out.print("\t- Horas:"+horas+"\n");
    
   // SALIDA:
   System.out.printf("\n\t\t(Hay %,.2f horas y %,.0f minutos en %,.0f segundos..)", horas,minutos,segundosOP );
   System.out.println("\n\n");
}
}
        
