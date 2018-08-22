package lista.pkg2.exe.pkg2.pkg3.pkg4.pkg5;

public class Empregado extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado(double salario, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }
    
    public double obterLucro(){
        return this.salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "salario=" + salario + '}';
    }
    
    public void Status(){
        System.out.println("Salário: " + this.salario);
    }
    
}