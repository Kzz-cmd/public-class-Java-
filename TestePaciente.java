public class TestePaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(70.5,1.75,32,"Cleber");
        p1.exibirPaciente();
        System.out.printf("O IMC do paciente é %.2f",p1.calcularIMC());
    }
}