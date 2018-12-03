package deber3_11;

import java.util.Scanner;

/**
 *
 * @author seckond
 */
public class PruebaFactura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Factura factura1 = new Factura("00", "Descripción", 0, 0.0);
        // Variable:
        int cont = 1;
        //Proceso
        System.out.println("====================================");
        System.out.println("Bienvenido al sistema de Facturación.");
        while (cont == 1) {
            System.out.println("================================");
            System.out.println("Ingrese el número de la factura:");
            factura1.setNumero(teclado.nextLine());
            System.out.println("Ingrese una descripción:");
            factura1.setDescripcion(teclado.nextLine());
            System.out.println("Ingrese la cantidad de artículos:");
            factura1.setCantidad(teclado.nextInt());
            System.out.println("Ingrese el precio por artículo:");
            factura1.setPrecio(teclado.nextDouble());
            // Presentación de los datos:
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Numero\tDescripción\tCantidad\tPrecio\t\tTotal");
            System.out.printf("%s\t%s\t\t%d\t\t%.2f\t\t%.2f\n", factura1.getNumero(), factura1.getDescripcion(), factura1.getCantidad(), factura1.getPrecio(), factura1.getMontoFactura());
            System.out.println("------------------------------------------------------------------------");
            System.out.println("======================================");
            System.out.println("Nueva factura (1)Continuar (Otro)Salir");
            cont = teclado.nextInt();
        }
    }
}
