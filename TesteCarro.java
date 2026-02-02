public class TesteCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Corsa";
        carro1.ano = 1994;
        carro2.modelo = "Maverick";
        carro2.ano = 1975;

        carro1.apresentar();
        carro2.apresentar();
    }

}
