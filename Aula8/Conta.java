/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author a2152177
 */
public class Conta {
      private int numero;
      private float saldo;

      public Conta( int numero, float saldo ){
             this.numero = numero;
             this.saldo = saldo;
      }

         public void saque(float valor){
               this.saldo -= valor;
         }
         public void deposito(float valor){
               this.saldo += valor;
         }
         public float getValor(){
              return this.saldo;
         }
}//fim classe

