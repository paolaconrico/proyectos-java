
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("pantalon", 100.00);
        Producto producto3 = new Producto("Falda", 56.00);
        Producto producto4 = new Producto("vestido", 250.00);
        Producto producto5 = new Producto("crema", 18.00);
        Producto producto6 = new Producto("Carcasa de celular", 10.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.mostrarOrden();
    }

}
