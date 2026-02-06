public class Funcionario {
    double salario;

    void aumentarSalario(double percentual){
        salario = salario + (salario * percentual);
    }
        public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.salario = 1300.25;

        System.out.println("Salário atual:" + f1.salario);

        System.out.println("Aumentando Salário em 10%");
        f1.aumentarSalario(0.1);
        
        System.out.println("Salário atual:" + f1.salario);

    }
}
