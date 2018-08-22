package lista.pkg2.exe.pkg2.pkg3.pkg4.pkg5;

public class Fornecedor extends Pessoa {
    private double creditoMaximo;
    private double valorEmDivida;

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public Fornecedor(double creditoMaximo, double valorEmDivida, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }
    
    public double obterLucro(){
        return this.creditoMaximo - this.valorEmDivida;
    }
    
    public void Status(){
        System.out.println("Crédito Máximo: " + this.creditoMaximo);
        System.out.println("Valor Em Dívidas: " + this.valorEmDivida);
    }
}