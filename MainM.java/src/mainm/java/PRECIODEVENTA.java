
import java.util.Scanner;
// INGRESAR EL VALOR DE VENTA DEL PRODUCTO, y que nos SAQUE EL PRECIO DE VENTA + EL IGV
// PRECIO DE VENTA ES VALOR DE VENTA + IGV
public class PRECIODEVENTA {
    public static void main (String [] args){
         Scanner leer = new Scanner(System.in);
         
         
         System.out.print("INGRESE EL VALOR DE VENTA: ");
         double vv = leer.nextDouble();
         
         double igv = vv * 0.18;
         
         double pv = vv + igv;
         
         System.out.println("EL VALOR DE VENTA DEL PRODUCTO ES: " +vv);
         System.out.println("EL IGV ES: " +igv);
         System.out.println("EL PRECIO DE VENTA: " +pv);
         
         
         
    
    }
}
