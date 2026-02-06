public class Termometro {
    double tempetatura;

    void ajustarTemperatura(double novaTemp){

        if (novaTemp >= -100){
            tempetatura = novaTemp;
        } else {
            System.out.println("Temperatura menor que -100 graus celsius!");
        }
        
    }
    public static void main(String[] args) {
        Termometro t1 = new Termometro();

        t1.tempetatura = 32;
        System.out.println("Temperatura atual:" + t1.tempetatura + " graus celsius\n");

        System.out.println("Mudando temperatura para 40 graus celsius\n");
        t1.ajustarTemperatura(40);

        System.out.println("Temperatura atual:" + t1.tempetatura + " graus celsius\n");
        System.out.println("Mudando temperatura para -101 graus celsius\n");

        t1.ajustarTemperatura(-101);
    }
}
