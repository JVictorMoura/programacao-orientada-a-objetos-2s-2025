
public class Carro {

    public Integer ano;//int para objeto
    public String modelo;
    private String placa;
    private Integer velocidade;//privando atributo

    public Carro(Integer ano, String modelo, String placa, Integer velocidade) {//construtor: força a informaçao dos dados
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = velocidade;

    }//pode-se ter varios metodos contrutores

    public Integer getVelocidade() {
        return this.velocidade;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setVelocidade(Integer velocidade) { {
        if (velocidade != null && velocidade >= 0) {
            this.velocidade = velocidade;
        }
    }

    public void acelerar() {
        this.velocidade += 5;
    }

    public void freiar() {
        if (this.velocidade > 0 && this.velocidade <= 5) {
            this.velocidade = 0;
        }
        if (this.velocidade > 0) {
            this.velocidade -= 5;
        }
    }
}
