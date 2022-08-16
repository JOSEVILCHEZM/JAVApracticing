public class FUNCION {

public static void main ( String [] args){
        multiplicacion(30, 1000);
        saludar("JOSE VILCHEZ", 25);
        
}

static void multiplicacion (int a,int b){
    int multiplicacion = a * b;
    System.out.println("LA MULTIPLICACION ES : "+multiplicacion);
}


static void saludar(String nombre ,int edad){
    System.out.printf("HOLA %sTU EDAD ES %d \n", nombre, edad);
}

}