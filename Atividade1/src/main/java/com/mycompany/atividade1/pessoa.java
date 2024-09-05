/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1;

/**
 *
 * @author aluno.saolucas
 */
public class pessoa {
        private String nome;
    private int idade;
    private String profissao;

    public pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

   
    public String exibirDetalhes() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nProfissão: " + profissao;
    }
}

