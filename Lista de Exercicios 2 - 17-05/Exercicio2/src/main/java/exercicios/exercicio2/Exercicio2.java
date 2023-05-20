/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Implemente uma classe "Conta" com atributos encapsulados "saldo" e "titular". Crie métodos para depositar,
sacar e obter saldo, garantindo o encapsulamento dos atributos. Utilize o conceito de abstração para tratar a transação de depósito e saque.

 */

package exercicios.exercicio2;

/**
 *
 * @author allan
 */
public class Exercicio2 {

    public static void main(String[] args) {
       
            Conta conta = new Conta(150, "EU");
            conta.depositar();
            conta.sacar();
            conta.obterSaldo();
            
            
    }
}
