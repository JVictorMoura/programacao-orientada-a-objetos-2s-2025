
public class Simulacao {

    public static void main(String[] args) {
        Carro opala = new Carro(96, "Comodoro", "DSAE422", 0);
        Carro fusca = new Carro(80, "Fusca", "ASDQE123", 0);

        Radar radar = new Radar(60, "pardal", "Pistao Sul");

        for (int i = 1; i <= 150; i++) {
            opala.acelerar(); //75km
        }
        for (int i = 1; i <= 4; i++) {
            opala.freiar(); //75km
        }
        fusca.acelerar();
        radar.avaliarVelocidade(fusca);
    }
}
