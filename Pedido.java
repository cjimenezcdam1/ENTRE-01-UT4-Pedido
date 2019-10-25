

/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2)    {
        this.fecha = fecha;
        this.cliente = cliente;
        this.linea1 = linea1;
        this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public String getFecha() {
         return fecha.toString();
    }

    /**
     * accesor para el cliente
     */
    public String getCliente() {
         return cliente.toString();
    }
    
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() {
        double precioP1 = (linea1.getProducto().getPrecio()) * linea1.getCantidad();
        double precioP2 = (linea2.getProducto().getPrecio()) * linea2.getCantidad();
        return precioP1 + precioP2;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
         return this.getImporteAntesIva() * IVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
         return this.getIva() + this.getImporteAntesIva();
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        return "Hola";
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
         return true;
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        return this;
    }

}
