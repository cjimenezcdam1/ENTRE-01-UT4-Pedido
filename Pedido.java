

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
    public Fecha getFecha() {
         return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
         return cliente;
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
         return getImporteAntesIva() * IVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
         return getIva() + getImporteAntesIva();
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String lineaFormateada = String.format("FECHA PEDIDO: " + fecha.toString());
        lineaFormateada += String.format("\nDATOS DEL CLIENTE"
                                            + "\n" + cliente.toString()
                                            + "\n"
                                            + "\n**** Artículos en el pedido ***"
                                            + "\n"
                                            + "\n" + linea1.toString()
                                            + "\n" + linea2.toString()
                                            + "\n"
                                            + "\n**** A pagar ***"
                                            + "\n"
                                            + "\n");
        lineaFormateada += String.format("%20s", "IMPORTE SIN IVA:");
        lineaFormateada += String.format("%8.2f", getImporteAntesIva());
        lineaFormateada += String.format("€\n");
        lineaFormateada += String.format("%20s", "IVA:");
        lineaFormateada += String.format("%8.2f", getIva());
        lineaFormateada += String.format("€\n");
        lineaFormateada += String.format("%20s", "IMPORTE TOTAL:");
        lineaFormateada += String.format("%8.2f", getImporteTotal());
        lineaFormateada += String.format("€");
        return lineaFormateada;
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
         return fecha.antesQue(otro.getFecha());
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        return this;
    }
}
