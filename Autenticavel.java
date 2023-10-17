package model;

public interface Autenticavel {
    
    <String> boolean autenticar(String email, String senha);
}
