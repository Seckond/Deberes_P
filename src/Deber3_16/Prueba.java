package Deber3_16;

import java.util.Scanner;

/**
 *
 * @author seckond
 */
public class Prueba {
    public static void main(String[] args) {
 
         Scanner teclado = new Scanner(System.in);
         FrecuenciaCardiaca persona1 = new FrecuenciaCardiaca("", "", 0, 0, 0);
 
         // Variables:
         String nombre;
         String apellido;
         int dia, d = 0;
         int mes, m = 0;
         int anio, a = 0;
         int control;
         boolean cont = true;
 
         // Proceso:
         System.out.println("==========================================");
         System.out.println("Programa para medir la frecuencia cardiaca.");
         System.out.println("==========================================");
         System.out.println("Por favor ingrese la fecha actual:");
         do{
         System.out.print("Dia:");
         d = teclado.nextInt();
         System.out.print("Mes:");
         m = teclado.nextInt();
         System.out.print("Año:");
         a = teclado.nextInt();
         if ((d >= 32 || d <= 0) || (m >= 13 || m <= 0) || (a != 2016)){
             System.out.println("Valores fuera de rango. Intente nuevamente.");
         }        
         } while((d >= 32 || d <= 0) || (m >= 13 || m <= 0) || (a != 2016));
         System.out.println("-------------------------------------------");
         while (cont) {
             System.out.println("Ingrese su primer nombre:");
             nombre = teclado.nextLine();
             nombre = teclado.nextLine();
             System.out.println("Ingrese su(s) apellido(s):");
             apellido = teclado.nextLine();
             System.out.println("Ingrese su fecha de nacimiento:");
             System.out.print("Dia:");
             dia = teclado.nextInt();
             System.out.print("Mes:");
             mes = teclado.nextInt();
             System.out.print("Año:");
             anio = teclado.nextInt();
             if ((dia < 32 && dia > 0) && (mes < 13 && mes > 0) && (anio < 2017 && anio > 0)) {               
                 persona1.establecerNombre(nombre);
                 persona1.establecerApellido(apellido);
                 persona1.establecerDia(dia);
                 persona1.establecerMes(mes);
                 persona1.establecerAnio(anio);
                 System.out.println("----------------------------------------------------");
                 int e = persona1.calcularEdad(d, m, a);
                 int frecmax = persona1.frecuenciaMaxima(e);
                 System.out.println("Para " + persona1.obtenerNombre() + " "
                         + persona1.obtenerApellido() + " nacido el "
                         + persona1.obtenerDia() + "/" + persona1.obtenerMes()
                         + "/" + persona1.obtenerAnio() + ".");
                 System.out.println("Con edad de " + e + " tiene una frecuencia máxima de " + frecmax + ".");
                 System.out.println(persona1.frecuenciaEsperada(frecmax));
 
             } else { 
                 System.out.println("----------------------------------------------------");
                 System.out.println("Valores fuera de rango.");
             }
             System.out.println("----------------------------------------------------");
             System.out.println("==========================================");
             System.out.println("Nueva Frecuencia (1)Continuar (Otro)Salir");
             control = teclado.nextInt();
             switch (control) { 
                 case 1: 
                     System.out.println("==========================================");
                     break;
                 default:
                     System.out.println("==========================================");
                     System.out.println("Fin del programa...");
                     System.out.println("==========================================");
                     cont = false;
                     break;
             }
         }
     }
 }
