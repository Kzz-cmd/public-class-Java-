public class TesteEstudante {
    public static void main(String[] args) {
        Estudante a1 = new Estudante("Antônio Carlos Peba da Silva", new double[]{7.5,5.0,8.75,10.0});
        System.out.println("Nome do Aluno: " + a1.nome + "\nSuas notas:");
        a1.exibirNotas();
        System.out.printf("Sua Média: %.2f",a1.calcularMedia());
    }
}
