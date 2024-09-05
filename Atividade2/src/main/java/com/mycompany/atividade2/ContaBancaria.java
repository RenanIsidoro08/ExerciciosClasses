/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2;

/**
 *
 * @author aluno.saolucas
 */
public class ContaBancaria {
        private String titular;
    private double saldo;
    private String numeroDaConta; 

    public ContaBancaria(String titular, double saldo, String numeroDaConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso."); 
        } else {
            System.out.println("Valor de depósito inválido."); 
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor de saque inválido."); 
        }
    }

    public double getSaldo() {
        return saldo;
    }
   
    public String getInformacoesConta() {
        return "Titular: " + titular + ", Número da Conta: " + numeroDaConta + ", Saldo: R$" + saldo; 
    }
}

