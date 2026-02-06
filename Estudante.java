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
    public static void main(String[] args) {
        Estudante a1 = new Estudante("Antônio Carlos Peba da Silva", new double[]{7.5,5.0,8.75,10.0});
        System.out.println("Nome do Aluno: " + a1.nome + "\nSuas notas:");
        a1.exibirNotas();
        System.out.printf("Sua Média: %.2f",a1.calcularMedia());
    }
}
