/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Crie uma interface "Veiculo" com métodos "acelerar" e "frear". Implemente as classes "Carro", "Moto" e "Caminhão" que 
implementam a interface de forma polimórfica. Utilize herança para compartilhar atributos e métodos comuns entre as classes.

 */

package exercicios.exercicio3;

/**
 *
 * @author allan
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        Veiculo Carro = new Carro();
        Carro.acelerar();
        Carro.frear();
        
        Veiculo Moto = new Moto();
        Moto.acelerar();
        Moto.frear();
        
        Veiculo Caminhao = new Caminhao();
        Caminhao.acelerar();
        Caminhao.frear();
        
        
    }
}
