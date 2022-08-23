/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

/**
 *
 * @author a2150336
 */
public class Campus {


    private String nome;
    private String endereco;
    private String registroAcademico;

    public Campus(String nome,String end,String RA) {
//        this.nome = nome;
          setNome(nome);
          setEndereco(end);
          setRegistroAcademico(RA);
    }
    
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setRegistroAcademico(String ra){
        this.registroAcademico = ra;
    }
        
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRegistroAcademico(){
        return this.registroAcademico;
    }
  

    
}
