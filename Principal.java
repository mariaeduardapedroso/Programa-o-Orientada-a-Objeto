/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;


public class Principal {
    
    public Principal(){
        Estagiario jorge = new Estagiario("caralh", "manha");
        jorge.setNome("madu");
        
        Estagiario maria = new Estagiario("mary","caralh", "manha");
        
        Estagiario ruan = new Estagiario("ruan","caralh", "manha",2800);
    }
    
        public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
        
    }

    private void iniciar() {
    }
}
