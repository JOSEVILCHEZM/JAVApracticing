// ENTRADA DE NOMBRE 
//NOMBRE, EDAD, CARACTER
 import java.util.Scanner; 

       public class EntradadeDatos_1{
              public static void main(String [] args){
                     
                  System.out.println("ENTER YOUR NAME");
                  
                  Scanner leer = new Scanner(System.in);
                  
                  
                  String name = leer.nextLine();
                  
                  System.out.println("ENTER YOUR AGE");
                  int age = leer.nextInt();
                  
                  
                  System.out.println("ENTER ANY CHARACTER");
                  char character = leer.next().charAt(0);
                  
                  
                  System.out.println("Name: "+ name);
                  System.out.println("Age: "+ age);
                  System.out.println("Character: "+ character);
                  
              }
       }