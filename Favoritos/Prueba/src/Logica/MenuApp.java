package Logica;
import java.util.*;
public class MenuApp {
    private  List<Cliente> clientes = new ArrayList<>();
    private final int salir = 5;
    int opcion;
    int idCambio;
    int ciclo;
    Scanner scan = new Scanner(System.in);
    public void Comienzo() {
        while (opcion != salir) {
            Menu();
            opcion = scan.nextInt();
            Opcion();
        }
    } // fin while
    public void Menu() {
        System.out.print("""
                         ---------------------
                                 Menu
                         ---------------------
                           1.Ingresar cliente
                           2.Mostrar cliente
                           3.Editar Cliente
                           4.Eliminar cliente 
                           5. Salir
                           """);
        System.out.print("Que numero desea seleccionar: ");
    }
    public void Opcion() {
        switch (opcion) {
            case 1 -> {
                Ingreso();
            }
            case 2 -> {
                Mostrar();
            }
            case 3 -> {
                Editar();
            }
            case 4 -> {
               Eliminar();
            }
            case 5 -> {
                System.out.println("Usted ha salido del menu");
                System.out.println("Hasta luego");
            }
            default -> {
                System.out.println("Usted debe seleccionar entre el 1 al 4");
            }
        }
    }
    public void Ingreso() {
        System.out.println("Usted ha seleccionado Ingresar Cliente");
        System.out.print("Ingrese su nombre: ");
        String nombre = scan.next();
        System.out.print("Ingrese su apellido paterno: ");
        String apellidoP = scan.next();
        System.out.print("Ingrese su apellido materno: ");
        String apellidoM = scan.next();
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        System.out.print("Ingrese su carrera: ");
        String carrera = scan.next();
        Cliente cliente = new Cliente(nombre, apellidoP, apellidoM, carrera, edad);
        clientes.add(cliente);
    }
    public void Mostrar() {
        System.out.println("Usted ha seleccionado Mostrar Cliente");
        System.out.println("------------------------------------------------------------------------------------------");
        clientes.forEach((cliente) -> System.out.println(cliente));
         System.out.println("-----------------------------------------------------------------------------------------  ");
    }
    public void Editar() {
        System.out.println("Se ha seleccionado Editar");
        System.out.println("""
                           -------------------------
                           Ingrese el ID del cliente 
                           -------------------------
                           """);
        System.out.print("ID: ");
        try{
            idCambio = scan.nextInt();
                    System.out.println("Datos Del cliente: ");
        System.out.println(clientes.get(idCambio).getNombre() + " " + clientes.get(idCambio).getApellidoP() + " "
                + clientes.get(idCambio).getApellidoM() + "\n" + "Edad: " + clientes.get(idCambio).getEdad() + "\n" + "Carrera: " 
                + clientes.get(idCambio).getCarrera());
                while (ciclo != 6) {
            MenuEdicion();
            ciclo = scan.nextInt();
            OpcionesEdicion();
        }
        }catch(Exception e){
            System.out.println("Id no encontrado");
            System.out.println("Ocurrio un error:" +e.getMessage());        
        }//fin del try
            
      
    }
    public void MenuEdicion() {
        System.out.println("""
                           --------------------------------
                           Elija el numero que desea editar
                           --------------------------------
                           
                           1.Nombre
                           2.Apellido Paterno
                           3.Apellido Materno
                           4.Edad
                           5.Carrera
                           6.Salir
                                                       """);
        
    }
    public void OpcionesEdicion() {
        System.out.print("Editar: ");
        switch (ciclo) {
            case 1 -> {
                System.out.println("Nombre actual: " + clientes.get(idCambio).getNombre());
                System.out.print("Nombre Nuevo: ");
                String nombre = scan.next();
                clientes.get(idCambio).setNombre(nombre);
            }
            case 2 -> {
                System.out.println("Apellido Paterno actual: " + clientes.get(idCambio).getApellidoP());
                System.out.print("Apellido Paterno Nuevo: ");
                String apellidoP = scan.next();
                clientes.get(idCambio).setApellidoP(apellidoP);
            }
            case 3 -> {
                System.out.println("Apellido materno actual: " + clientes.get(idCambio).getApellidoM());
                System.out.print("Nombre Nuevo: ");
                String apellidoM = scan.next();
                clientes.get(idCambio).setApellidoM(apellidoM);
            }
            case 4 -> {
                System.out.println("Edad actual: " + clientes.get(idCambio).getEdad());
                System.out.print("Ingresar Edad: ");
                int Edad = scan.nextInt();
                clientes.get(idCambio).setEdad(Edad);
            }
            case 5 -> {
                System.out.println("Carrera actual: " + clientes.get(idCambio).getCarrera());
                System.out.print("Ingresar carrera: ");
                String carrera = scan.next();
                clientes.get(idCambio).setCarrera(carrera);
            }
            case 6 -> {
                System.out.println("Ha salido del menu Edicion");
            }
            default -> {
                System.out.println("Se debe ingresar una opcion valida");
            }
        }
    }
    
    public void Eliminar (){
        System.out.println("Se ha seleccionado Eliminar cliente");
        System.out.println("""
                           --------------------------
                           Ingrese el ID del cliente
                           --------------------------
                           """);
        System.out.print("ID: ");
        try{
        int idEliminar = scan.nextInt();
        System.out.println("El cliente que eliminara es: ");
        System.out.println(clientes.get(idEliminar).getNombre());
        clientes.remove(idEliminar);
        System.out.println("Se ha eliminado con exito");
        
        }catch(RuntimeException re){
            System.out.println("ID no encontrado");
            System.out.println("Ocurrio un error: "+ re.getMessage());
        }               
    }
}//fin de MenuApp