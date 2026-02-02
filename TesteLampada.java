public class TesteLampada {
    public static void main(String[] args) {

        Lampada luz = new Lampada();

        System.out.println("A lâmpada está ligada? " + luz.estaligado);
        luz.ligar();
        System.out.println("A lâmpada está ligada? " + luz.estaligado);
        luz.desligar();
        System.out.println("A lâmpada está ligada? " + luz.estaligado);
        
    }
}
