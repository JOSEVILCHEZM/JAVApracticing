//LA FUNCION SE DEFINE CON UNA INSTRUCCION STATIC 
// STATIC VOID SALUDAR(String nombre) 

// UN METODO LO PODEMOS DEFINIR SIN LA FUNCION STATIC
// O SIMPLEMENTE PODEMOS PONER PUBLIC VOID

// LA FUNCION Y EL METODO SE DEFINEN EN UNA CLASE MAIN EN ESTE CASO defFUNCION 
// Y TAMBIÉN TENEMOS NUESTRO METODO MAIN

public class defFuncion {
// ESTAMOS TRABAJANDO DESDE UN METODO MAIN EN ESTE CASO defFuncion 
    public static void main(String []args){
        //Llamar a una función
        saludar("Alex");
        // Llamar a un método
        defFuncion s= new defFuncion();
        s.myMetodo("Hola Mundo");
    
        //SI NOSOTROS INVOCAMOS LA FUNCION saludar
        
    }
    //Definición de una función
    static void saludar(String nombre){
        System.out.println("Hola "+ nombre+" Desde la Función");
    }
    //Definición de un Método
    public void myMetodo(String saludo){
        System.out.println(saludo);
    
   }
}
