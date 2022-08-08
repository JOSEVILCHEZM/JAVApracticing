
import classes.Persona;


public class Main {

   
    public static void main(String[] args) {
        // PARA EJECUTAR TODO LO QUE ES DE LA CLASE PERSONA
        //LO QUE TENEMOS QUE HACER ES INSTANCIAR EN LA CLASE MAIN
        // TENEMOS QUE CREAR EL OBJETO EN LA CLASE MAIN, INSTANCIANDO EN LA CLASE PERSONA
        
        //VAMOS A CREAR UN OBJETO DE LA CLASE PERSONA , PERSONA ES EL NOMBRE DE LA CLASE
        Persona persona1;
        // vamos a crear un nuevo objeto
        persona1 = new Persona();
        
        persona1.nombre = "Alex";
        persona1.edad = 25;
        persona1.mostrarDatos();
        
        Persona persona2 = new Persona();
        
        persona2.nombre="Jose";
        persona2.edad = 24;
        
        persona2.mostrarDatos();
    }
    
}
