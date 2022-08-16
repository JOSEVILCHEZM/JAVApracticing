package mainm.java;



//length:NOS VA A DEVOLVER CUANTOS DATOS TIENE ALMACENADO( CANTIDAD DE DATOS)
public class Array1 {
        public static void main(String [] args){
            String nombres []; //DEFINE UN ARRAY
            nombres = new String[3]; // DEFINA UNA CANTIDAD DE ESPACIO
            
            nombres[0]= "Jose";
            nombres[1]= "Vilchez";
            nombres[2]= "Masquez";
            
            System.out.println(nombres[2]);
            
            nombres[2]= "ROGER";
            
            System.out.println(nombres[2]);
            System.out.println(nombres.length);
            
            // DEFINIR UN ARRAY CON DATOS DEFINIDOS
            
            int[] array1 = {1,2,3,4,5};
            System.out.println(array1[0]);
            array1[0] = 100;
            System.out.println(array1[0]);
            System.out.println(array1.length);
            
            int[] array2 = new int[5];

        }
    
}
