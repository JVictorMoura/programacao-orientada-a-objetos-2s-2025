
package Atividades.Atividade1;

public class Computador {
    private Integer memoriaRam;
    private Integer sSD;
    private Integer nucleos;
    private Float operacoesPorSegundo;

public Computador (Integer memoriaRam, Integer sSD, Integer nucleos, Float operacoesPorSegundo){
    this.memoriaRam = memoriaRam;
    this.sSD = sSD;
    this.nucleos = nucleos;
    this.operacoesPorSegundo = operacoesPorSegundo;
}public Integer getMemoriaRam() {
    return this.memoriaRam; 
}
public Integer getSSD() {
    return this.sSD; 
}
public Integer getNucleos() {
    return this.nucleos; 
}
public Float getOperacoesPorSegundo() {
    return this.operacoesPorSegundo; 
}
public void setMemoriaRam(Integer memoriaRam){
    this.memoriaRam = memoriaRam;
}
public void setSSD(Integer sSD){
    this.sSD = sSD;
}
public void setNucleos(Integer nucleos){
    this.nucleos = nucleos;
}
public void setOperacoesPorSegundo(Float operacoesPorSegundo){
    this.operacoesPorSegundo = operacoesPorSegundo;
}
}