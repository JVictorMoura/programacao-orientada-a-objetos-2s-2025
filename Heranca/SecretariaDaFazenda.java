package Heranca;

public class SecretariaDaFazenda {
    public static void main(String[] args) {
        Municipio a = new Municipio("Brasilia", "DF", 2.0);
    
    Apartamento Apt1 = new Apartamento(a, 52.0, 3, true);

    System.out.printf("%f", Apt1.calcularIPTU());
} 

 } 