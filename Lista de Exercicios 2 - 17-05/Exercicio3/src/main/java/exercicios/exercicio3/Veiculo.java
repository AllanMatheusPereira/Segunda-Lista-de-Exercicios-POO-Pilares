/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Crie uma interface "Veiculo" com métodos "acelerar" e "frear". Implemente as classes "Carro", "Moto" e "Caminhão" 
que implementam a interface de forma polimórfica. Utilize herança para compartilhar atributos e métodos comuns entre as classes.

 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 */
public class Veiculo {
    
    public void acelerar(){
        System.out.println("Veiculo não definido, ele não irá se mover!");
    }        
    public void frear(){
        System.out.println("Veiculo não definido, ele não irá parar!");
    }
    
}
