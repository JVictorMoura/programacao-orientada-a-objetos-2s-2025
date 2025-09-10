package Heranca;

public class Characa {
    private Municipio municipio;
    private Double areaM2;
    private Boolean possuiElevador;
    private Integer vagas;
    private Boolean possuiPocoArtesiano;

   
public Boolean getPossuiPocoArtesiano() {
    return this.possuiPocoArtesiano;
}
public void setPossuiPocoArtesiano(Boolean PossuiPocoArtesiano){
    this.possuiPocoArtesiano = possuiPocoArtesiano;
}



public Double calcularIPTU(){

    return this.areaM2 * this.municipio.getPrecoM2() *1.005;
}
}