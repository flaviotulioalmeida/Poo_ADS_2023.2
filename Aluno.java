package model;

public abstract class Aluno extends Usuario implements Autenticavel{
    
   private int matricula;
   private String curso;
   private String email;
   private String senha;

    public Aluno(String cpf,String nome,int matricula,String curso,String email,String senha){
        super(nome,cpf);
        this.matricula = matricula;
        this.curso= curso;
        this.email = email;
        this.senha = senha;

        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
