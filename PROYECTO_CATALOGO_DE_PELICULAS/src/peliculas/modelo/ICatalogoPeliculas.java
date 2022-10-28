
package peliculas.modelo;


public interface ICatalogoPeliculas {
    
      void insertarPelicula(Pelicula nombrePelicula);
      void ListarPelicula();
      void buscarPelicula(String nombrePelicula);
    
}
