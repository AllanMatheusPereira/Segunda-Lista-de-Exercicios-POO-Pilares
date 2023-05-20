/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio1;

/**
 *
 * @author allan
 */
public class Retangulo extends Shape{
    
    public double calcularArea(double base, double altura){
        return base * altura;
    }
    public double calcularPerimetro(double base, double altura){
        return base * 2 + altura * 2;
    }
}
