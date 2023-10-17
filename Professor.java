package model;

public class Professor extends Usuario implements Autenticavel {
    
    private int matricula;
    private String formacao;
    private String email; 
    private String senha;

    public Professor(String nome,String cpf,int matricula,String formacao,String email,String senha){
        super(nome,cpf);
        this.matricula = matricula;
        this.formacao=formacao;
        this.email=email;
        this.senha=senha;
        
    }

    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean autenticar(String email, String senha){
        return this.email.equals(email) && this.senha.equals(senha);
    }
}
