package Atividades.Atividade1;

public class Main {
    public static void main(String[] args) {

        Computador pc1 = new Computador(8, 512, 4, Float.valueOf(500.0f));

        Sistema s1 = new Sistema(pc1);

        Programa prog1 = new Programa(8, 200, 4, 150000); 
        Programa prog2 = new Programa(2, 600, 2, 5000); 
        Programa prog3 = new Programa(32, 100, 2, 8000); 

        System.out.println("Programa 1");
        s1.executarPrograma(prog1);

        System.out.println("\n Execução Programa 2");
        s1.executarPrograma(prog2);

        System.out.println("\n Execução Programa 3");
        s1.executarPrograma(prog3);
    }
}
