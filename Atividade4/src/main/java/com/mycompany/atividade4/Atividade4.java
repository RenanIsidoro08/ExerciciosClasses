/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade4 {

    public static void main(String[] args) {
     Livro meuLivro = new Livro ("O senhor dos aneis","J.R.R Tolkien", 1000, 3);
     
        System.out.println(meuLivro);
        
        if (meuLivro.emprestar()){
            System.out.println("Livro emprestado com Sucesso!");
        }else{
            System.out.println("Nao ha exemplares Dsiponiveis");
        }
        
        System.out.println("meulivro");
        
        meuLivro.devolver();
        System.out.println("Livro devolvido com Sucesso.");
        
        System.out.println(meuLivro);
    }
}
