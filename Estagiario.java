
package aula8;
//SUBCLASSE
public class Estagiario extends Estudante{
    private String empresa;
    private String horarioEstagio;
    
    public Estagiario(String empresa,String horarioEstagio){
        this.empresa = empresa;
        this.horarioEstagio = horarioEstagio;
    }

    public Estagiario(String nome, String empresa, String horarioEstagio) {
      super(nome);//construtor passando como argumento
      this.empresa = empresa;
      this.horarioEstagio = horarioEstagio;
    }
    
    public Estagiario(String nome, String empresa, String horarioEstagio,float salario) {
      super(nome,salario);//construtor passando como argumento
      this.empresa = empresa;
      this.horarioEstagio = horarioEstagio;
    }
}
