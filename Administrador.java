package lista.pkg2.exe.pkg2.pkg3.pkg4.pkg5;
 
public class Administrador extends Empregado {
    private double ajudasDeCusto;

    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }

    public Administrador(double ajudasDeCusto, double salario, String nome, int idade, double altura, String sexo) {
        super(salario, nome, idade, altura, sexo);
        this.ajudasDeCusto = ajudasDeCusto;
    }
    
    public void status(){
        System.out.println("Ajudas de Custo: " + this.ajudasDeCusto);
    }
    
}