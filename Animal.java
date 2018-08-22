package lista.pkg2.exe.pkg1;

public class Animal {
    private String tipo;
    private String cor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo = " + tipo + ", cor = " + cor + '}';
    }
    
    public void status(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cor: " + this.cor);
    }
    
}
