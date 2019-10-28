
/**
 *  Clase para probar el resto de clases
 *  
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
        Fecha fecha1 = new Fecha(4, 9, 2019);
        Cliente cliente1 = new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra");
        Producto producto1 = new Producto("Rotulador fosforescente", 6.7);
        Producto producto2 = new Producto("Memoria USB 64GB", 14.8);
        LineaPedido linea1 = new LineaPedido(producto1, 20);
        LineaPedido linea2 = new LineaPedido(producto2, 10);
        pedido1 = new Pedido(fecha1, cliente1, linea1, linea2);
       
        // crear pedido2
        Fecha fecha2 = new Fecha(8, 10, 2019);
        Cliente cliente2 = new Cliente("Elisa Nuin", "C/ Río Alzania 7", "Pamplona", "Navarra");
        Producto producto3 = new Producto("Sacapuntas manual", 16.64);
        Producto producto4 = new Producto("Corrector tippex", 5.99);
        LineaPedido linea3 = new LineaPedido(producto3, 8);
        LineaPedido linea4 = new LineaPedido(producto4, 20);
        pedido2 = new Pedido(fecha2, cliente2, linea3, linea4);

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        String pedidoHechoAntes = "";
        if(pedido1.masAntiguoQue(pedido2)){
            pedidoHechoAntes = "El pedido 1 se ha realizado antes que el pedido 2";
        }else{
            pedidoHechoAntes = "El pedido 2 se ha realizado antes que el pedido 1";
        }
        System.out.println("Pedido 1" +
                            "\n------------------------------\n" + 
                            pedido1.toString() +
                            "\n\nPedido 2" +
                            "\n------------------------------\n" + 
                            pedido2.toString() +
                            "\n\n" + pedidoHechoAntes);
    }
}
