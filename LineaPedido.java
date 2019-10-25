
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;
     

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto, int cantidad){
         this.cantidad = cantidad;
         this.producto = producto;
    }

     /**
     * accesor para el producto
     */
    public Producto getProducto() {
         return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public void obtenerCopia() {
         Producto nuevoProducto = new Producto(producto.getNombre(), producto.getPrecio());
         LineaPedido nuevaLinea = new LineaPedido(nuevoProducto, getCantidad());
    }
     
    /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() {
        String lineaFormateada = String.format(producto.toString() + " |");
        lineaFormateada += String.format("%4d", cantidad);
        lineaFormateada += String.format(" unidades");
        return lineaFormateada;
    }
}
