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
}
