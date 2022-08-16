//HACER UNA APLICACION QUE DETECTE SI ES PAR POSITIVO O PAR NEGATIVO
// Y SI ES CERO QUE DIGA QUE ES NUMERO NEUTRO
    
import java.util.Scanner;

public class CondicionesAnidadas{
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE NÚMERO: ");
        int a = leer.nextInt();
        
        
       if(a!= 0){
           if(a > 0){
               if(a % 2 == 0){
               System.out.print("ES NUMERO PAR POSITIVO ");
               }else{
               System.out.print("ES NUMERO IMPAR POSITIVO ");
               }
             }else{
                if(a % 2 == 0){
                    if(a < 0){
                        System.out.print("ES NUMERO PAR NEGATIVO");
                        }else{ 
                          System.out.print("ES NUMERO PAR NEGATIVO");
                    }
                     
               }else{
                    System.out.print("ES UN NUMERO NEUTRO");
                       }
                       }
              
        }
    }
    
}

