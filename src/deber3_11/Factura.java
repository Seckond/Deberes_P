package deber3_11;

/*
 * Ejemplo 3.13.: PruebaFactura.java
 * Probando las capacidades de la clase Factura.
 */
public class Factura {

    // Varables:
    private String numero_pieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    //Constructor con parámetros: 
    public Factura(String numero_pieza, String descripcion, int cantidad, double precio) {
        this.numero_pieza = numero_pieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    // Métodos 
    public void setNumero(String numero_pieza) {
        this.numero_pieza = numero_pieza;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) 
            this.cantidad = 0;
        else
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        if (precio < 0) 
            this.precio = 0;
        else
        this.precio = precio;
    }

    public String getNumero() {
        return numero_pieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getMontoFactura() {
        double monto = this.precio * this.cantidad;
        return monto;
    }
}
