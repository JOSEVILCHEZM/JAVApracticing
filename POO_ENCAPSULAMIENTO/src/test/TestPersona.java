
package test;

import poo_encapsulamiento. *;
public class TestPersona { 
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alex", 25, false);
        System.out.println(persona1.getNombre());
        
        persona1.setNombre("Jose Vilchez");
        persona1.setEdad(25);
        
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
}
}