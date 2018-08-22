package lista.pkg2.exe.pkg2.pkg3.pkg4.pkg5;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Vendedor(double valorVendas, double comissao, double salario, String nome, int idade, double altura, String sexo) {
        super(salario, nome, idade, altura, sexo);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    
    @Override
    public double obterLucro(){
        return (this.comissao + (this.valorVendas / 0.05));
    }
    
}