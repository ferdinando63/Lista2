package lista.pkg2.exe.pkg1;

public class CockerTeste {

    public static void main(String[] args) {
        Animal a = new Animal("Dócil", "Preto e branco");
        Cachorro c = new Cachorro("Malik", "Husky Siberiano", "Dócil", "Preto e branco");
        Cocker ck = new Cocker("Malik", "Husky Siberiano", "Dócil", "Preto e branco");
        
        a.status();
        c.status();
        ck.status();
        
    }
    
}
