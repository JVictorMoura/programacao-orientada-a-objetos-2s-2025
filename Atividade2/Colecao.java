public class Colecao implements ItemEmprestavel{
 
    private String proprietario;
    private Integer quantidadeItens;

    public void descricao(){
System.out.println("proprietario" + this.proprietario);
System.out.println("quantidade de itens" + this.quantidadeItens);

 }

    

    public Colecao(String proprietario, Integer quantidadeItens) {
        this.proprietario = proprietario;
        this.quantidadeItens = quantidadeItens;
    }




    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}