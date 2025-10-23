public class Instituicao implements TomadorEmprestimo{
    private String nome;
    private String cnpj;
    private String cidade;
 
    @Override
    public void exibirInfo() {
       System.out.println("Nome" + this.nome);
       System.out.println("cnpj" + this.cnpj);
       System.out.println("cidade" + this.cidade);
    }

    public Instituicao(String cidade, String cnpj, String nome) {
        this.cidade = cidade;
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
