
// SI UNA LETRA ES PAR O NO ES PAR 
import java.util.Scanner;

public class MultCondPractice {
    public static void main ( String [] args){
         Scanner leer = new Scanner(System.in);
         
         System.out.print("INGRESA LA LETRA: ");
         char n = leer.next().charAt(0);
         if( n == 'a' || n == 'A'){
             System.out.printf("%s ES VOCAL\n", n);
         }else if( n == 'b' || n == 'B'){
             System.out.printf("%s ES VOCAL\n", n);
         }else if( n == 'c'|| n == 'C'){
             System.out.printf("%s ES VOCAL\n", n);
         }else if( n == 'd'|| n == 'D'){
             System.out.printf("%s ES VOCAL\n", n); 
         }else if( n == 'e'|| n == 'E'){
             System.out.printf("%s ES VOCAL\n", n); 
         }else{
             System.out.printf("%s LA LETRA NO ES UNA VOCAL: ", n); 
         }
             
         
        
         
         
         
            
    }
        
    
}
