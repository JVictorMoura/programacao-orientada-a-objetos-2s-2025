public class Radar {
    public Integer limiteVelocidade;
    public String modelo;
    public String localizacao;
    private String placa;
    
    public Radar (Integer limiteVelocidade, String modelo, String localizacao){
        this.limiteVelocidade = limiteVelocidade;
        this.modelo = modelo;
        this.localizacao = localizacao;
    }
    

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de velocidade:" +this.limiteVelocidade);
        System.out.println("Velocidade avaliada:"+ velocidadeAvaliada +"Km/h");
        System.out.println("Placa: "+placa);
        System.out.println("Localizacao: "+this.localizacao); 
    }

    public void avaliarVelocidade (Carro c){
        if (c.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(c.getPlaca(), c.getVelocidade());
        }else {
            System.out.println("boa, chefe, ce tava a: " + c.getVelocidade()+"Km/h");
        }
    }
}