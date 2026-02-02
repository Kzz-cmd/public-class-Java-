public class Funcionario {
    double salario;

    void aumentarSalario(double percentual){
        salario = salario + (salario * percentual);
    }
}
