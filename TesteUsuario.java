public class TesteUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Peba","12345");

        System.out.printf("Tentando nome: %s\n","Kzz");
        System.out.printf("Tentando senha: %s\n","898");
        System.out.printf("O retorno de verificarAcesso é: %b\n\n",u1.verificarAcesso("Kzz","898"));

        System.out.printf("Tentando nome: %s\n","Peba");
        System.out.printf("Tentando senha: %s\n","12345");
        System.out.printf("O retorno de verificarAcesso é: %b\n",u1.verificarAcesso("Peba","12345"));
    }
}
