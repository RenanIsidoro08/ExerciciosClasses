/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4;

/**
 *
 * @author aluno.saolucas
 */
public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int exemplaresDisponiveis;

    public Livro(String titulo, String autor, int numeroPaginas, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
    
    public boolean emprestar(){
        if(exemplaresDisponiveis > 0){
            exemplaresDisponiveis--;
            return true;
        }else{
            return false;
        }
    }
    
    public void devolver(){
      exemplaresDisponiveis++;
    }
    
    public int getExemplaresDisponiveis(){
        return exemplaresDisponiveis;
    } 
    @Override
    public String toString(){
        return "Título: "+titulo+",Autor:"+autor+",Numero de paginas: "+numeroPaginas+",Exemplares Disponiveis:"+exemplaresDisponiveis;
    }
}
