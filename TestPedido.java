
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
        pedido1 = new Pedido();
       
       
       

        // crear pedido2
        pedido2 = new Pedido(); 

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
                            "\n------------------------------" + 
                            pedido1.toString() +
                            "Pedido 2" +
                            "\n------------------------------" + 
                            pedido2.toString() +
                            "\n" + pedidoHechoAntes);
    }
}
