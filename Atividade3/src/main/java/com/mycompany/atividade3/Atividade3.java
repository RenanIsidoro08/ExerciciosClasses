
package com.mycompany.atividade3;


public class Atividade3 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro ("Toyota","Corolla", 2020);
        
        meuCarro.acelerar(50);
        System.out.println("Velocidade apos acelerar:" + meuCarro.getVelocidade() + "km/h");
        
        meuCarro.desacelerar(20);
        System.out.println("Velocidade Apos desacelerar" +meuCarro.getVelocidade()+ "km/h");
        
        meuCarro.desacelerar(40);
        System.out.println("Velocidade apos desacelerar mais:"+ meuCarro.getVelocidade()+ "Km/h");
        
        System.out.println(meuCarro);
    }
}
