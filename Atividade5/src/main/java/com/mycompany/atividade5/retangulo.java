/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author aluno.saolucas
 */
public class retangulo {
    private double largura;
    private double altura;

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double caucularArea(){
        return largura * altura;
    }
    public double caucularPerimetro(){
        return 2*(largura+altura);
        
    }
    
    public double getlargura(){
        return largura;
    }
    
    public double getaltura(){
        return altura;
        
    }
    @Override
    public String toString(){
        return "largura: "+largura+", Altura"+altura+", Area:" + caucularArea()+ ", Perimetro" +caucularPerimetro();
    }  
    
}
