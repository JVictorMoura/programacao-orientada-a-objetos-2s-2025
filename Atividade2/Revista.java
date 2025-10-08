

public class Revista extends Material {
    private Integer edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Revista:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer autor) {
        this.edicao = edicao;
    }
}
