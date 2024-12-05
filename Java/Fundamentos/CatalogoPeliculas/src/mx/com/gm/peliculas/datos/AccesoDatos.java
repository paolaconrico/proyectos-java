
package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.exepciones.*;


public interface AccesoDatos {
    boolean existe (String nombreArchivo)throws AccesoDatosEx;
    
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    
    void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    String buscar (String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    void crear (String nombreArchivo) throws AccesoDatosEx;
    
    void borrar (String nombreArchivo) throws AccesoDatosEx;
    
}
