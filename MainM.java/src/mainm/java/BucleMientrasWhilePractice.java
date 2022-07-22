import java.util.Scanner;

//APLICACION QUE GENERE UNA TABLA DE MULTIPLICACION

public class BucleMientrasWhilePractice {
    public static void main( String [] args){
         Scanner leer = new Scanner(System.in);
         
         System.out.print("INGRESE EL VALOR: ");
         int n = leer.nextInt();
         
         int c= 0;
         while(c <= 10){
              System.out.printf("%s x %s = %s\n", n,c,(n*c));
                      c++;
         }
    }
    
}
