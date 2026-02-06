public class Contador {
    int valor;

    int incrementar(int inteiro){
        return inteiro + 1;
    }

    void exibirAteAtual(){
        int acum = 0;
        while (acum != valor + 1){
            System.out.println(acum);
            acum = incrementar(acum);
        }

    }
    public static void main(String[] args) {
        Contador contar = new Contador();
        contar.valor = 50;

        System.out.printf("Valor atual: %d \n",contar.valor);
        
        System.out.println("Incrementando o valor atual");
        contar.valor = contar.incrementar(contar.valor);

        System.out.printf("Valor atual: %d \n",contar.valor);

        System.out.printf("Contando do 0 até %d \n",contar.valor);
        contar.exibirAteAtual();
    }
}
