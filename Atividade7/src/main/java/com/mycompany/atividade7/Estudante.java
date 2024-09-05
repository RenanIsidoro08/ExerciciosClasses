package com.mycompany.atividade7;

import java.util.ArrayList;
import java.util.List;


public class Estudante {
    private String nome;
    private int idade;
    private List<String> disciplinasMatriculadas;


    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinasMatriculadas = new ArrayList<>();
    }
    

    public void adicionarDisciplina(String disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }
    

    public void exibirDisciplinas() {
        System.out.println("Disciplinas matriculadas de " + nome + ":");
        for (String disciplina : disciplinasMatriculadas) {
            System.out.println("- " + disciplina); 
        }
    }
    

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
}
