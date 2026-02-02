public class Estudante {
    double[] lista;
    String nome;
        public Estudante(String nome, double[] lista){
            this.lista = lista;
            this.nome = nome;
        }
    void exibirNotas(){
        int acum = 1;
        for (double item : lista){
            System.out.printf("Nota %d: %.2f \n",acum,item);
            acum = acum + 1;
        }
    }
    double calcularMedia(){
        double total = 0;
        for (double itens : lista){
            total = total + itens;
        }
        return total/lista.length;
    }
}
