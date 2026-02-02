public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = "A532";
        c1.saldo = 300;
        System.out.println("A conta de número " + c1.numero + " possui " + c1.saldo + " reais de saldo");
        c1.saldo = c1.saldo + 200;
        System.out.println("Depósito de 200 reais feito em:" + c1.numero);
        System.out.println("Saldo atual de " + c1.numero + " é de:" + c1.saldo + " reais");

    }
}