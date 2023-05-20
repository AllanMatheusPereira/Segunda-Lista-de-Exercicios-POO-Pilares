/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio1;

/**
 *
 * @author allan
 */
public class Triangulo extends Shape{
    
    public double calcularArea(double ladoEquilatero){
           return ((ladoEquilatero*ladoEquilatero) * Math.sqrt(3) / 4);
    }
    
    public double calcularArea(double baseIsoceles, double alturaIsoceles){
           return (baseIsoceles * alturaIsoceles) / 2;
    }
    
    public double calcularArea(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2;   
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
    
    public double calcularPerimetro(double ladoA,double ladoB, double ladoC){
        return ladoA + ladoB + ladoC;
    }
}
