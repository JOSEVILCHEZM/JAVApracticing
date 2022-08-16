
// PARA INTERCTUAR CON EL PROGRAMA SE TIENE QUE IMPORTAR LA CLASE SCANNER

import java.util.Scanner;

public class EntradadeDatos {
    
    public static void main(String [] args){
        
        Scanner leer = new Scanner(System.in);
        // SE CREA EL NOMBRE DEL OBJETO "LEER", SE CREA NUEVO OBJETO 
        //DENTRO DE AQUÍ VAMOS A PONER EL FLUJO DE ENTRADA System.in
        
        System.out.println("INGRESE SU NOMBRE: ");
        //MENSAJE PARA QUE INGRESE SU NOMBRE
        String nombre = leer.nextLine(); 
        // SI QUEREMOS INGRESAR UN NOMBRE DESDE TECLADO
        System.out.println("Nombre: "+ nombre);
                //+ nombre: LO VA A ALMACENAR LA VARIBALE NOMBRE
    }
}