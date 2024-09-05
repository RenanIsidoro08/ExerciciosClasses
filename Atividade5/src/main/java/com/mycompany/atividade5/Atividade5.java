/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade5 {

    public static void main(String[] args) {
  retangulo meuRetangulo = new retangulo (5.0,3.0);
  
        System.out.println(meuRetangulo);
        
        double area = meuRetangulo.caucularArea();
        System.out.println("Area do retangulo: " +area);
        
       double perimetro = meuRetangulo.caucularPerimetro();
        System.out.println("Perimetro do retangulo: " +perimetro);
    }
}
