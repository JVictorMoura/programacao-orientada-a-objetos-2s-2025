

public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula) throws Exception {
        super(nome, email);
        this.matricula = matricula;
        if(nome == null || nome.length() < 1){
            // System.out.println("Nome invalido!");
            throw new NomeInvalidoException();
    
        }
        if(email == null || email.length() < 4){
            // System.out.println("Nome invalido!");
            throw new EmailInvalidoException();
         
        }
    }

    @Override
    public void exibirInfo() { //implementacao de comando
        System.out.println("Usuário:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Matrícula: " + this.matricula);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
