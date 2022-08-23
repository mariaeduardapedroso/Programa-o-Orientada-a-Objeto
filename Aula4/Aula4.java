/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;

import javax.swing.JOptionPane;//importar classe

/**
 * @author a2150336
 */
public class Aula4 {

    Aula4(){
        JOptionPane entrada = new JOptionPane();//interface grafica
        String v1 = JOptionPane.showInputDialog(null,"Valor 1:");
        float valor1 = Float.parseFloat(v1);
        
        String v2 = entrada.showInputDialog(null,"Valor 2:");
        float valor2 = Float.parseFloat(v2);
        
        float soma = valor1 + valor2;
        
        entrada.showMessageDialog(null,soma,"Titulo",JOptionPane.OK_OPTION);
        
        System.exit(0);//garantir que a GUI finalizou
    }
    public static void main(String[] args) {

        Aula4 aula4 = new Aula4();
    }
    
}
