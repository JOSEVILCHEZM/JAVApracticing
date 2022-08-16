import java.util.Scanner;

public class SumaDeDosNumeros {
    
      public static void main(String [] args){
            
          
          Scanner leer = new Scanner(System.in);
          System.out.println("ENTER FIRST NUMBER");
          
          int a = leer.nextInt();
          
          System.out.println("ENTER SECOND NUMBER");
          
          int b = leer.nextInt();
          
          
          System.out.println("THE SUM OF THE NUMBERS: "+ (a + b));
          
      }
    
}
