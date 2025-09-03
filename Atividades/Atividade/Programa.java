package Atividade;

public class Programa {
    private Integer memoriaRAMalocada;
    private Integer sSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

public Programa (Integer memoriaRAMalocada, Integer sSDOcupado, Integer nucleos, Integer quantidadeOperacoes){
    this.memoriaRAMalocada = memoriaRAMalocada;
    this.sSDOcupado = sSDOcupado;
    this.nucleos = nucleos;
    this.quantidadeOperacoes = quantidadeOperacoes;
}
public Integer getMemoriaRAMalocada() {
    return this.memoriaRAMalocada; 
}
public Integer getSSDOcupado() {
    return this.sSDOcupado; 
}
public Integer getNucloesP() {
    return this.nucleos; 
}
public Integer getQuantidadeOperacoes() {
    return this.quantidadeOperacoes; 
}
public void setMemoriaRAMalocada(Integer memoriaRAMalocada){
    this.memoriaRAMalocada = memoriaRAMalocada;
}
public void setSSDOcupado(Integer sSDOcupado){
    this.sSDOcupado = sSDOcupado;
}
public void setNucleosP(Integer nucleos){
    this.nucleos = nucleos;
}
public void setQuantidadeOperacoes(Integer quantidadeOperacoes){
    this.quantidadeOperacoes = quantidadeOperacoes;
}
}