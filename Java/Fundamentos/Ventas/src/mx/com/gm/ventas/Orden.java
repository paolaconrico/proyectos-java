
package mx.com.gm.ventas;


public class Orden {
    //private int ;
    private Producto productos [];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos;
    private final int idOrden;

    public Orden (){
        this.idOrden= ++Orden.contadorOrdenes;
        this.productos =new Producto [Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto (Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }
        else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    } //fin de agregar producto
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto =this.productos[i];
            total += producto.getPrecio(); 
        }
        return total;
    }
    
    public void mostrarOrden (){
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Total de la orden: $" +this.calcularTotal());
        System.out.println("productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
    
}
