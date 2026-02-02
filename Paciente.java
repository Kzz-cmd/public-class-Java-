public class Paciente {
    double peso;
    double altura;
    double temperatura;
    String nome;
    public Paciente(double peso, double altura, double temperatura, String nome){
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }
    void exibirPaciente(){
        System.out.printf("Ficha de %s\n",nome);
        System.out.printf("Peso: %.2f\n",peso);
        System.out.printf("Altura: %.2f\n",altura);
        System.out.printf("Temperatura: %.2f\n",temperatura);
    }
    
    double calcularIMC(){
        return peso/(altura * altura);
    }

}
