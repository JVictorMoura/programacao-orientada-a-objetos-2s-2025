public class Emprestimo{  
    private TomadorEmprestimo tomadorEmprestimo;
    private ItemEmprestavel itemEmprestavel;
    private String dataEmprestimo;
    private String dataDevolucao;


    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, ItemEmprestavel itemEmprestavel, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.itemEmprestavel = itemEmprestavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        
    }


    public Material getTomadorEmprestimo() {
        return tomadorEmprestimo;
    }
     public void setTomadorEmprestimo(TomadorEmprestimo tomadorEmprestimo) {
        this.tomadorEmprestimo = tomadorEmprestimo;
    }






    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void set dataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }



    public String getDataDevolucao() {
        return dataDevolucao;
    }
        public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;

   

public String getItemEmprestavel() {
        return itemEmprestavel;
    }
    public void setItemEmprestavel(ItemEmprestavel itemEmprestavel) {
        this.itemEmprestavel = itemEmprestavel;
}

    public void exibirDetalhes() {
        System.out.println("          Detalhes do Emprestimo ");
        System.out.println("Data do Emprestimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolucao: " + this.dataDevolucao);
        System.out.println();
        tomadorEmprestimo.exibirInfo();
        System.out.println("Material vinculado.");
        material.descricao();
        System.out.println("------------------------------\n");
        
    }