public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();//objeto de carro
        opala.velocidade = 0;
        opala.placa = "DSAE422";
        opala.modelo = "Comodoro";
        opala.ano = 1976;
    
    Radar radar = new Radar();
    radar.modelo = "pardal";
    radar.limiteVelocidade = 60;
    radar.localizacao = "Pistao Sul";

    
    for (int i = 1; i <= 15; i++) {
        opala.acelerar(); //75km
}
radar.avaliarVelocidade(opala);
for (int i = 1; i <= 4; i++) {
    opala.freiar(); //75km
}
radar.avaliarVelocidade(opala);
}
}