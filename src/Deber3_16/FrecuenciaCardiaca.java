package Deber3_16;

/**
 *
 * @author seckond
 */
public class FrecuenciaCardiaca {
     // Variables:
     public String nombre;
     public String apellido;
     public int dia;
     public int mes;
     public int anio;
 
     // Constructor con parámetros:
     public FrecuenciaCardiaca(String nombre, String apellido, int dia, int mes, int anio) {
         this.nombre = nombre;
         this.apellido = apellido;
         this.dia = dia;
         this.mes = mes;
         this.anio = anio;
     }
 
     // Métodos establecer y obtener:
     public void establecerNombre(String nombre) {
         this.nombre = nombre;
     }
 
     public String obtenerNombre() {
         return nombre;
     }
 
     public void establecerApellido(String apellido) {
         this.apellido = apellido;
     }
 
     public String obtenerApellido() {
         return apellido;
     }
 
     public void establecerDia(int dia) {
         this.dia = dia;
     }
 
     public int obtenerDia() {
         return dia;
     }
 
     public void establecerMes(int mes) {
         this.mes = mes;
     }
 
     public int obtenerMes() {
         return mes;
     }
 
     public void establecerAnio(int anio) {
         this.anio = anio;
     }
 
     public int obtenerAnio() {
         return anio;
     }
 
     // Método para calcular edad:
     public int calcularEdad(int dia, int mes, int anio) {
         int edad;
         if (dia >= this.dia) {
             if (mes >= this.mes){
                 mes = 0;
             } else {
                 mes = -1;
             }
         } else {
             if (mes > this.mes){
                 mes = 0;
             } else {
                 mes = -1;
             }
         }
         edad = anio - this.anio + mes;
         return edad;
     }
 
     // Método para calcular Frecuencia Máxima:
     public int frecuenciaMaxima(int edad) {
         int frecmax;
         frecmax = 220 - edad;
 
         return frecmax;
     }
 
     // Método para calcular Frecuencia Esperada:
     public String frecuenciaEsperada(int frecmax) {
 
         int fesmax;
         int fesmin;
         String p;
         String presentacion = "";
 
         fesmax = (frecmax * 85) / 100;
         fesmin = (frecmax * 50) / 100;
 
         p = String.format("Su frecuencia se estima entre " + fesmin + " y " + fesmax + ".");
         presentacion = presentacion + p;
         return presentacion;
     }
 }
