/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula8;

/**
 * SUPERCLASSE
 */
public class Estudante {
private String nome;
private String endereco;
private int matricula;
private float salario;

public Estudante(String nome){
    this.nome = nome;
}

public Estudante(String nome,float salario){
    this.nome = nome;
    this.salario = salario;
}

public void setNome(String nome){
    this.nome = nome;
}
    
}
