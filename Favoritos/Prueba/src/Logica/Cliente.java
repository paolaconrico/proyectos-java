package Logica;
public class Cliente {
    private String nombre, apellidoP, apellidoM, carrera;
    private int edad;
    private int id;
    private static int contadorId;
    public Cliente() {
        this.id = contadorId++;
    }
    public Cliente(String nombre, String apellidoP, String apellidoM, String carrera, int edad) {
        this();
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Cliente:" +
                " id=" + id+
                 " Nombre Completo: "+ nombre + ' ' +
                 apellidoP + ' ' +
                apellidoM + ' ' +
                ", Edad: "+ edad +
                ", Carrera: " +
                carrera + ' '
                ;
    }
}