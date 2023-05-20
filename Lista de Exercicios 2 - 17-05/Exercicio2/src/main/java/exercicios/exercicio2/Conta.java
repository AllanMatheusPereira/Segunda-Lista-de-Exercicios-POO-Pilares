/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Implemente uma classe "Conta" com atributos encapsulados "saldo" e "titular". Crie métodos para depositar, sacar e obter saldo,
garantindo o encapsulamento dos atributos. Utilize o conceito de abstração para tratar a transação de depósito e saque.

 */
package exercicios.exercicio2;
/**
 *
 * @author allan
 */
public class Conta {   
    private double saldo;
    private String titular;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void depositar(){
        saldo += 450;
        System.out.println("Deposito de:" + saldo);
    }
    public void sacar(){
        saldo -= 98;
        System.out.println("Saque efetuado de : " + saldo);
    }
    public void obterSaldo(){
        System.out.println("O seu saldo é : " + saldo);
    }


}
