package lista.pkg2.exe.pkg2.pkg3.pkg4.pkg5;

import java.util.Scanner;

public class Lista2Exe2345 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        Empregado e = new Empregado(2.548, "Marcos", 26, 1.75, "M");
        
        Fornecedor f = new Fornecedor(5.256, 3.954, "João", 30, 1.80, "M");
        
        Pessoa p = new Pessoa("Pedro", 36, 1.85, "M");
        
        Administrador a = new Administrador(5.525, 3.687, "Maria", 30, 1.70, "F");
        
        e.Status();
        f.Status();
        p.Status();
        a.Status();
    }
    
}
