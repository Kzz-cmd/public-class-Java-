public class Termometro {
    double tempetatura;

    void ajustarTemperatura(double novaTemp){

        if (novaTemp >= -100){
            tempetatura = novaTemp;
        } else {
            System.out.println("Temperatura menor que -100 graus celsius!");
        }
        
    }
}
