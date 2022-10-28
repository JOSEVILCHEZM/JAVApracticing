
package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas{
    
    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listaPeliculas = new ArrayList<>();
    }
    
    
    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
       this.listaPeliculas.add(nombrePelicula.toString());
        
    }

    @Override
    public void ListarPelicula() {
          JOptionPane.showMessageDialog(
                  null,
                  this.listaPeliculas,
                  "LISTA DE PELICULAS",
                  JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for(var pelicula: this.listaPeliculas){
              if(pelicula.equals(nombrePelicula)){
                  resultado = pelicula;
                  break;
              }else{
                  resultado = pelicula;
              }
        
    }
        if(nombrePelicula.equals(resultado)){
            JOptionPane.showMessageDialog(
            null,
            "Resultado ->"+ resultado,
            "BUSCAR PELICULA",
            JOptionPane.QUESTION_MESSAGE
            
            );
        }else{
          
             JOptionPane.showMessageDialog(
             null, 
             "NO SE ENCONTRO LA PELICULA ->" + nombrePelicula,
             "BUSCAR PELICULA",
             JOptionPane.WARNING_MESSAGE
             );
             
}
}
}
