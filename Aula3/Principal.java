/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

/**
 *
 * @author a2150336
 */
public class Principal {

    public Principal(){
        Estudante joao = new Estudante("Ruan","Casa do caralho","7070vaisefude");
        
        
        //joao.setNome("RUANZINHO");
        System.out.println(joao.getNome() + "\n" + joao.getEndereco() + "\n" + joao.getRegistroAcademico());
        
        Estudante lorena = new Estudante("Lorena","meu coracao","S2");     
        
        Estudante suelen = new Estudante("Suelen","meu coracao","420");

        
        Estudante natan = new Estudante("Natan","Raposão","69");
        

        
    }
            
    public static void main(String[] args) {
       Principal objeto = new Principal();
       
    }
    
}
