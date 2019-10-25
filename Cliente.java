

/**
 *  Representa a un cliente que hace un pedido 
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;

    /**
     * Constructor  
     */
    public Cliente(String nombre, String direccion, String ciudad, String provincia)    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /**
     * accesor para el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * accesor para la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * accesor para la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * accesor para la provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * representación textual del cliente
     */
    public String toString() {
          String lineaFormateada = String.format("%10s","NOMBRE:");
          lineaFormateada += String.format("%-10s"," " + nombre);
          lineaFormateada += String.format("\n%10s","DIRECCIÓN:");
          lineaFormateada += String.format("%-10s"," " + direccion);
          lineaFormateada += String.format("\n%10s","CIUDAD:");
          lineaFormateada += String.format("%-10s"," " + ciudad);
          lineaFormateada += String.format("\n%10s","PROVINCIA:");
          lineaFormateada += String.format("%-10s"," " + provincia);
          return lineaFormateada;
    }
    
    /**
     * 
     */
    public void print() {
        System.out.println(this.toString());
    }

}
