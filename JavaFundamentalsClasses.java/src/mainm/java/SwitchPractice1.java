
// DIAS DE LA SEMANA EJEMPLO SWITCH
import java.util.Scanner;

public class SwitchPractice1 {
    public static void main (String [] args){
          Scanner leer = new Scanner(System.in);
          
          System.out.print("INGRESE EL DIA: ");
          int dia = leer.nextInt();
          String nombreDia = null;
          
          switch(dia){
              case 1:
                  nombreDia = "LUNES";
                  break;
              case 2:
                  nombreDia = "MARTES";
                  break;
              case 3:
                  nombreDia = "MIERCOLES";
                  break;
              case 4:
                  nombreDia = "JUEVES";
                  break;
              case 5:
                  nombreDia = "VIERNES";
                  break;
              case 6:
                  nombreDia = "SABADO";
                  break;
              case 7:
                  nombreDia = "DOMINGO";
                  break;
              default:
                  System.out.print("EL NUMERO INGRESADO ES INCORRECTO");
                  
                  
              
                  
          }
          
          
          System.out.println("EL DIA ES : "+ nombreDia);
        
          // CON printf = ,
          // CON println = +
          
         
    }
    
}
