
public class DefinirFuncion {// ESTAMOS TRABAJANDO DENTRO DE UNA CLASE DefinirFuncion
     public static void main(String[] args) { // AQUI TENEMOS NUESTRO METODO MAIN
        //Llamar a una función
        saludar("Alex");
        // Llamar a un método
        DefinirFuncion s = new DefinirFuncion();
        s.myMetodo("Hola Mundo");
    }
     //Definición de una función
    static void saludar(String nombre){// UNA FUNCION SE DEFINE CON LA INSTRUCCION STATIC
        System.out.println("Hola "+ nombre+" Desde la Función");
    }
    //Definición de un Método
    public void myMetodo(String saludo){ // UN METODO SE PUEDE DEFINIR DEFINIR SIN LA INSTRUCCION STATIC
        System.out.println(saludo);
    }
    
    
}


