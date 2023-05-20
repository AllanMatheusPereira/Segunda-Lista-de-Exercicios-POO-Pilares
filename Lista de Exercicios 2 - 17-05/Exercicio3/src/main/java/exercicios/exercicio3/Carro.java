/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio3;

/**
 *
 * @author allan
 */
public class Carro extends Veiculo {
    
    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("O carro freiou!");
    }
    
}
