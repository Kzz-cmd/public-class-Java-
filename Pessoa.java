public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;
    
    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    void saudar(){
        System.out.println("Olá! Eu sou o " + nome + " e tenho " + idade +" anos e moro na cidade de " + endereco.cidade + ", na rua " + endereco.rua);
    }

    boolean maiordeidade(){
        return idade >= 18;
    }
    

}
