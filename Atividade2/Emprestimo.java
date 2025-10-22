public class Emprestimo implements TomadorEmprestimo{  
    private TomadorEmprestimo tomadorEmprestimo;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;
    private Colecao colecao;

    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, Material material, String dataEmprestimo, String dataDevolucao, Colecao colecao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.colecao = colecao;
    }

    public void exibirDetalhes() {
        System.out.println("          Detalhes do Empréstimo ");
        System.out.println("Data do Empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolução: " + this.dataDevolucao);
        System.out.println();
        tomadorEmprestimo.exibirInfo();
        System.out.println("Material vinculado.");
        material.descricao();
        System.out.println("------------------------------\n");
        
    }

    public TomadorEmprestimo getall() {
        return tomadorEmprestimo;
    }

    public Material getMaterial() {
        return material;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }
}
