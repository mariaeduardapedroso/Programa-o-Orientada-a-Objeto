package aula4;

public class Transportadora {

     private String tipo;   //caminhao ou van
     private float precoFrete;
     private float capacidade;

      //Construtor
      public Transportadora(String tipo, float precoFrete, float capacidade){
            cadastrar(tipo, precoFrete, capacidade);
     }

     public void cadastrar(String tipo, float precoFrete, float capacidade){
              this.tipo = tipo;
              this.precoFrete = precoFrete;
              this.capacidade = capacidade;
     }

     public void inserir(float carga){
           if ( capacidade >= carga )                //100      → 50
                  capacidade -= carga;              //50         →50
                                                                    //0            
     }

}
