/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio1;

/**
 *
 * @author allan
 */
public class Circulo extends Shape{
    
       @Override
       public double calcularArea(double raio){
           return 3.14 * (raio * raio);
       }
       @Override
       public double calcularPerimetro(double raio){
        return 2 * 3.14 * raio;
       }
}
