
package mx.com.gm.peliculas.servicios;


public interface IcatagoloPeliculas {
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula (String nombrePelicula);
    
    void listarPeliculas ();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
    
}
