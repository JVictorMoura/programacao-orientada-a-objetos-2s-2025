public class Carro {
    public Integer ano;//int para objeto
    public String modelo;
    public String placa;
    public Integer velocidade;

    public void acelerar(){
    this.velocidade += 18738;
    }
    public void freiar(){
        if (this.velocidade > 0 && this.velocidade <= 5){
            this.velocidade = 0;
        }
        if (this.velocidade > 0){
        this.velocidade -= 5;
        }
        }
}
