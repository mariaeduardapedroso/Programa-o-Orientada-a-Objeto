/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

/**
 *
 * @author a2150336
 */
public class Aula1 {

    /**
     * Propridedades = variaveis e instancia
     * 
     */
    static String nome = "POO";
    String horario = "15:50";
     
    
    public static void main(String[] args) {
        System.out.println("Olá corninho");
        Estudante cornin = new Estudante(); //declarar e instanciou (alocou memoria)
        System.out.println(cornin.nome);
        
        Estudante cornin2 = new Estudante();
        cornin2.setNome("Natan");
        System.out.println(cornin2.nome);

        
        imprimirNome();
    }
    
    //Comportamento/Ação/Funções == METODO
    public static void imprimirNome(){
        System.out.println(nome);
    }
    
}
