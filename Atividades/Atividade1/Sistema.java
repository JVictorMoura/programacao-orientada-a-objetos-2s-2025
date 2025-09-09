
package Atividades.Atividade1;
public class Sistema {
    private Computador computador;

    public Sistema(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() { return computador; }
    public void setComputador(Computador computador) { this.computador = computador; }

    public boolean executarPrograma(Programa p) {
     
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro na instalação do programa, SSD insuficiente.");
            return false;
        }

       
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRam()) {
            System.out.println("Erro na execução do programa, Memória RAM insuficiente.");
            return false;
        }

        if (p.getNucleosp() > computador.getNucleos()) {
            System.out.println("Erro na execução do programa, Núcleos insuficientes.");
            return false;
        }

       
        System.out.println("Programa executado com sucesso!");

       
        float tempoExecucao = (float)p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.printf("Tempo de execução: %.2f segundos%n", tempoExecucao);

        return true;
    }
}