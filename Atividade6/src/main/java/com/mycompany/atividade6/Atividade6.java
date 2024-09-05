/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;

public class Atividade6 {

    public static void main(String[] args) {
    Contador meuContador = new Contador();
    
    
        System.out.println(meuContador);
        
        meuContador.incrementar();
        meuContador.incrementar();
        System.out.println("Apos incrementar duas vezes: "+ meuContador);
        
        meuContador.decrementar();
        System.out.println("Apos decrementar uma vez: "+meuContador);
        
        meuContador.incrementar();
        meuContador.incrementar();
        meuContador.incrementar();
        System.out.println("Apos incrementar tres vezes: "+ meuContador);
    }
}
