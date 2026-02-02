public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    boolean verificarAcesso(String loginDigitado,String senhaDigitada){
        return loginDigitado == nome & senhaDigitada == senha;
    }
}
