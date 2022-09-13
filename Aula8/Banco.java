/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author a2152177
 */
public class Banco {
       private ArrayList<Cliente>lista;
       private String nome;

       public Banco(){
            lista = new ArrayList<>();
            this.nome = "BANCO";
       }
      public void add(Cliente cliente){
           lista.add( cliente );
      }
      public void del(Cliente cliente) {
      }
}//fim classe

