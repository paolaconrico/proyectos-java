
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando un nuevo objeto de tipo persona
        Persona personaNueva = new Persona("Carlos", "Muñoz", "munozz@gmail.com", "5855455255");
        personaDao.insertar(personaNueva);
        
        //Modificar un objeto de persona existente 
        Persona personaModificar = new Persona (4, "Roberto", "Lopez", "lopiz@gmail.com", "55822565545");
        personaDao.actualizar(personaModificar);
        
        //Que carajos estoy haciendo, yo no quiero ser adulto
        
        //Eliminar un registro
        Persona personaEliminar = new Persona (4);
        personaDao.eliminar(personaEliminar);
        
        //Listar personas
        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }

    }

}
