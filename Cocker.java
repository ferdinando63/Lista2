package lista.pkg2.exe.pkg1;

public class Cocker extends Cachorro {
    public boolean tosa;

    public Cocker(String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public void precisaTosa(){
        this.tosa = true;
    }
    
    public void naoPrecisaTosa(){
        this.tosa = false;
    }
    
    public void status(){
        System.out.println("Tosa: " + this.tosa);
    }
    
}
