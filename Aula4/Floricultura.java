/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;



/**
 * @author a2150336
 */
public class Floricultura {

    Floricultura(){
        Flor rosa = new Flor();
        Flor margarida = new Flor();
        
        rosa.cadastrar("rosa");
        margarida.cadastrar("margarida");
        margarida.setTipo("margarida");
        margarida.modificar("amarela", "margarfa", 20f);
        
        Flor violeta = new Flor("violeta","azul","VIOLETA",50f);
    }
    
        public static void main(String[] args) {

        new Floricultura();
    }
    
}
