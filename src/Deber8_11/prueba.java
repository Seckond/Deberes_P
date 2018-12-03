package Deber8_11;

import java.util.Scanner;

/**
 *
 * @author seckond
 */
public class prueba {
    public static void main(String args[]) {
 
         Scanner teclado = new Scanner(System.in);
         Complejo resultado;
         /// Variables:
         double real;
         double imaginario;
         int operacion;
         int control;
         boolean cont = true;
         boolean calculo = true;
 
         // Proceso:
         System.out.println("=========================================================");
         System.out.println("Bienvenido al programa para operar con números complejos.");
         System.out.println("=========================================================");
         while (cont) {
             System.out.println("Ingrese el primer número real:");
             real = teclado.nextDouble();
             System.out.println("-----------------------------------");
             System.out.println("Ingrese el primer número imaginario");
             imaginario = teclado.nextDouble();
             System.out.println("-----------------------------------");
             Complejo complejo = new Complejo(real, imaginario);
             System.out.println("Ingrese el segundo número real:");
             real = teclado.nextDouble();
             System.out.println("-----------------------------------");
             System.out.println("Ingrese el segundo número imaginario");
             imaginario = teclado.nextDouble();
             Complejo complejo1 = new Complejo(real, imaginario);
             do {
                 System.out.println("*******************************************");
                 System.out.println("Operación a realizar:");
                 System.out.println("(1)Suma\n(2)Resta\n(3)Imprimir\n(Otro)Salir");
                 operacion = teclado.nextInt();
                 switch (operacion) { 
                     case 1: 
                         System.out.println("*******************************************");
                         resultado = complejo.suma(complejo1);
                         System.out.println("El resultado es: "
                                 + resultado.getReal() +", "+ resultado.getImaginario() + "i");
                         break;
                     case 2: 
                         System.out.println("*******************************************");
                         resultado = complejo.resta(complejo1);
                         System.out.println("El resultado es: "
                                 + resultado.getReal() +", "+ resultado.getImaginario() + "i");
                         break;
                     case 3:
                         System.out.println("*******************************************");
                         System.out.println("El número 1 es: "
                                 + complejo.getReal() +", "+ complejo.getImaginario() + "i.");
                         System.out.println("El número 2 es: "
                                 + complejo1.getReal() +", "+ complejo1.getImaginario() + "i.");
 
                     default:
                         calculo = false;
                         break;
                 }
             } while (calculo);
             System.out.println("=========================================================");
             System.out.println("Nueva operación (1)Continuar (Otro)Salir");
             control = teclado.nextInt();
             switch (control) {
                 case 1:
                     complejo.setReal(0.0);
                     complejo.setImaginario(0.0);
                     complejo1.setReal(0.0);
                     complejo1.setImaginario(0.0);
                     System.out.println("=========================================================");
                     break;
                 default: 
                     System.out.println("=========================================================");
                     System.out.println("Programa finalizado...");
                     System.out.println("=========================================================");
                     cont = false; 
                     break;
             }
         }
     }
 }
