
public class Simulacao {

    public static void main(String[] args) {
        Carro opala = new Carro(96, "Comodoro", "DSAE422", 0);

        Radar radar = new Radar(60, "pardal", "Pistao Sul");

        for (int i = 1; i <= 15; i++) {
            opala.acelerar(); //75km
        }
        for (int i = 1; i <= 4; i++) {
            opala.freiar(); //75km
        }
        opala.setVelocidade(-60);
        radar.avaliarVelocidade(opala);
    }
}
