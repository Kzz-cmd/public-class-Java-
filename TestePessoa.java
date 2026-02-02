public class TestePessoa {
    public static void main(String[] args){

        Endereco e1 = new Endereco();
        e1.cidade = "Uberlândia";
        e1.rua = "Resende Coelho";

        Pessoa p1 = new Pessoa("Cleber",18,e1);

        System.out.println("Me chamo " + p1.nome + " e tenho " + p1.idade + " anos.");

        p1.saudar();
        
        System.out.println(p1.nome + " é maior de idade? " + p1.maiordeidade());
    }    
}
