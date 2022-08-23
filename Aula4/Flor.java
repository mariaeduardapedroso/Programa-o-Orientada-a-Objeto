/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;


/**
 * @author a2150336
 */
public class Flor {
    private String tipo;
    private String cor;
    private String nome;
    private float preco;
    
    
    public Flor(String tipo,String cor, String nome, float preco){
        setTipo(tipo);
        setCor(cor);
        setNome(nome);
        setPreco(preco);
    }    
        
    public Flor(){ 
    
        setTipo("rosa");
        setCor("vermelha");
        setNome("rosa");
        setPreco(0);   
    }
    
    
    public void cadastrar(String tipo){
        this.tipo = tipo;
    }
    
    public void modificar(String cor, String nome, float preco){
        setCor(cor);
        setNome(nome);
        setPreco(preco);
    }

    public void setPreco(float preco) {
        this.preco=preco;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
    

    public void setCor(String cor) {
        this.cor=cor;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }


}
