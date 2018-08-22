package lista.pkg2.exe.pkg1;

public class Cachorro extends Animal {
    private String nome;
    private String raca; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String nome, String raca, String tipo, String cor) {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "nome = " + nome + ", raca = " + raca + '}';
    }
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
    }
    
}
