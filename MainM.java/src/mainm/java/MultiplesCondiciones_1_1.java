

//CREAR UNA APLICACION QUE DETECTE SI UNA LETRA QUE VAMOS A 
//INGRESAR POR TECLADO ES VOCAL O NO
//ES VOCAL O NO
import java.util.Scanner;

public class MultiplesCondiciones_1_1{
    
      public static void main(String [] args){
            Scanner leer = new Scanner(System.in);
            System.out.print("INGRESE LETRA: ");
            char n = leer.next().charAt(0);
            
            if(n == 'a' || n == 'A'){
                System.out.printf("%s la letra es: ", n);
            }else if(n == 'e' || n == 'E'){
                System.out.printf("%s la letra es: ", n);
            }else if(n == 'i' || n == 'I'){
                System.out.printf("%s la letra es: ", n);
            }else if(n == 'o' || n == 'O'){
                System.out.printf("%s la letra es: ", n);
            }else if(n == 'u' || n == 'U'){
                System.out.printf("%s la letra es: ", n);
            }else{
                System.out.printf("%s NO ES UNA VOCAL: ", n);
                
            } 
            }
            }
      
         
    

