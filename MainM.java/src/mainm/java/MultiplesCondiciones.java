

//CREAR UNA APLICACION QUE DETECTE SI UNA LETRA QUE VAMOS A 
//INGRESAR POR TECLADO ES VOCAL O NO
import java.util.Scanner;

public class MultiplesCondiciones {
    
      public static void main(String [] args){
            Scanner leer = new Scanner(System.in);
            
            System.out.print("INGRESE LETRA: ");
            char c = leer.next().charAt(0);
            
            if ( c == 'a' || c == 'A'){
                System.out.printf("%s es VOCAL\n", c);
            }else if( c == 'e' || c == 'E'){
                 System.out.printf("%s es VOCAL\n", c);
            
            
            }
      }
      }
         
    

