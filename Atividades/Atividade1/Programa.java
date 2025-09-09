package Atividades.Atividade1;

public class Programa {

    private Integer memoriaRAMAlocada;
    private Integer sSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRAMalocada, Integer sSDOcupado, Integer nucleos, Integer quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMalocada;
        this.sSDOcupado = sSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() {
        return this.memoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return this.sSDOcupado;
    }

    public Integer getQuantidadeOperacoes() {
        return this.quantidadeOperacoes;
    }

    public void setMemoriaRAMalocada(Integer memoriaRAMalocada) {
        this.memoriaRAMAlocada = memoriaRAMalocada;
    }

    public void setSSDOcupado(Integer sSDOcupado) {
        this.sSDOcupado = sSDOcupado;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    Integer getNucleosp() {
        return this.nucleos;
    }
}
