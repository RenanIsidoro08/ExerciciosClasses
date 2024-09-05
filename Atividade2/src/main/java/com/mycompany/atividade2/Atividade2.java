/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade2 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 1000.00, "123456789");

        System.out.println(conta.getInformacoesConta());

        conta.depositar(500.00); 
        conta.sacar(200.00);    
        conta.sacar(1500.00);    

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}