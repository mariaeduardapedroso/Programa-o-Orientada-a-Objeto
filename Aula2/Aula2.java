/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author a2150336
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    private String nome;
    private String cpf;
    
    
    public Aula2(){ //Construtor
        setNome("RUAN GADO");
        imprimirNome();
        
        setCpf("43");
        imprimirCpf();
    }
    
    public static void main(String[] args) {
        Aula2 objeto; //objeto é uma variavel do tipo da classe (STRUCT)
        objeto = new Aula2(); //instanciando, alocando memoria
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("DIGITE O VALOR 1:");
        int valor1 = obj.nextInt();
        
        System.out.println("DIGITE O VALOR 2:");
        int valor2 = obj.nextInt();
        
        int result = valor1+valor2;
        System.out.println("Soma:" + result);
    }

    //--------------------GET E SET CPF-------------------------
    public void setCpf(String cpf){ //METODO MUTADOR
        this.cpf = cpf;
    }
    
    public String getCpf(){ //METODO ACESSOR
        return this.cpf;
    }
    
        private void imprimirCpf() {
        System.out.println(getCpf());
    }
    //--------------------GET E SET NOME-------------------------
    public void setNome(String nome) { //METODO MUTADOR
       this.nome = nome;
    }
    
    public String getNome(){ //METODO ACESSOR
        return this.nome;
    }
    
    public void imprimirNome() {
        System.out.println(this.nome);
    }


}
