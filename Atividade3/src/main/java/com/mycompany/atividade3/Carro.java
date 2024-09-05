package com.mycompany.atividade3;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

   
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

  
    public void acelerar(int aumento) {
        if (aumento > 0) {
            velocidade += aumento;
        }
    }

    
    public void desacelerar(int reducao) {
        if (reducao > 0) {
            velocidade -= reducao;
            if (velocidade < 0) {
                velocidade = 0; 
            }
        }
    }

    
    public int getVelocidade() {
        return velocidade;
    }


    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Velocidade: " + velocidade + " km/h";
    }
}
