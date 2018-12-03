/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber8_11;

/**
 *
 * @author seckond
 */
public class Complejo {
     // Variables:
     private double real;
     private double imaginario;
     
     // Constructores:
     public Complejo (){   
         real = 0.0;
         imaginario = 0.0;
     }
     public Complejo (double real, double imaginario){
         this.real = real;
         this.imaginario = imaginario;
     }
 
     // Métodos establecer y obtener:
     public void setReal(double real){
         this.real = real;
     } 
     public double getReal(){
         return this.real;
     }  
     public void setImaginario(double imaginario){
         this.imaginario = imaginario;
     }     
     public double getImaginario(){
         return this.imaginario;
     }   
     
     // Método para obtener suma:
     public Complejo suma (Complejo sumando){ // Tiene como parámetro un dato de su clase.
         Complejo resultado = new Complejo(); // Creamos un objeto de nuestra clase.
         // Realizamos las operaciones con los objetos:
         resultado.setReal(this.real + sumando.getReal() );         
         resultado.setImaginario(this.imaginario + sumando.getImaginario());      
         return resultado; // Devuelve un dato de su clase.
     }    
     
     // Método para obtener resta:
     public Complejo resta (Complejo resta){ // Tiene como parámetro un dato de su clase.
         Complejo resultado = new Complejo(); // Creamos un objeto de nuestra clase.
         // Realizamos las operaciones con los objetos:
         resultado.setReal(this.real - resta.getReal());
         resultado.setImaginario(this.imaginario - resta.getImaginario());         
         return resultado; // Devuelve un dato de su clase.
     }    
     
     // Método para imprimir números ingresados:
     public Complejo imprimir(Complejo numero){ // Tiene como parámetro un dato de su clase.
         return numero; // Devuelve un dato de su clase.
     }
 }
