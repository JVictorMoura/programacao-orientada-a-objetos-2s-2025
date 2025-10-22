

public abstract class Pessoa implements TomadorEmprestimo{
    private String nome;
    private String email;

    @Override
    public void exibirInfo() {
        System.out.println("nome" + nome);
        System.out.println("email" + email);
    }



    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
