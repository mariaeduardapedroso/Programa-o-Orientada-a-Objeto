/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author a2152177
 */
public class Estudante extends Cliente {
         private String nome;
         private String endereco;
         public Estudante( String nome, String endereco ){
                   this.nome = nome;
                   this.endereco = endereco;
         }
         public Estudante( String nome, String endereco, Conta conta ){
                   super( conta );
                   this.nome = nome;
                   this.endereco = endereco;
         }
}

