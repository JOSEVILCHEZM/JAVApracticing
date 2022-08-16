import java.util.Scanner;

public class Ifelse2{
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE NÚMERO: ");
        int a = leer.nextInt();
        if(a % 2 == 0){
            System.out.print("ES NUMERO PAR");
        }else{
            System.out.print("ES NUMERO IMPAR");
            
        }
    }
    
}
