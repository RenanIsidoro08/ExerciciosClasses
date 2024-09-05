/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade7;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade7 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante ("Renan", 16);
        
        estudante.adicionarDisciplina("matematica");
        estudante.adicionarDisciplina("Historia");
        estudante.adicionarDisciplina("Programação");
        
        estudante.exibirDisciplinas();
    }
}
