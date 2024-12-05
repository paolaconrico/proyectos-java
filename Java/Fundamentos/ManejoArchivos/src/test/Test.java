
package test;

import static manejoarchivos.ManejoArchivos.*;

public class Test {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivos(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola desde javaa");
        agregar(nombreArchivo, "pruebaaaaa para ver ");
        leerArchivos(nombreArchivo); 
     }
}
