/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade6;

/**
 *
 * @author aluno.saolucas
 */

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }
    
    public void incrementar(){
        valor++;
    }
    
    public void decrementar(){
        valor--;
    }
     
    public int getValor(){
        return valor;
       
    }
    
    @Override
    public String toString(){
    return "Valor do Contador: " +valor;}
    
}
