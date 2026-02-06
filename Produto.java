public class Produto {
    String nome;
    int quantidade;
    double precoUnitario;
    double exibirTotalEstoque(){
        return precoUnitario * quantidade;
    }
    public static void main(String[] args) {
        Produto p1 = new Produto(); 
        p1.nome = "Teclado";
        p1.precoUnitario = 15.00;
        p1.quantidade = 2;
        System.out.println("Nome do Produto: " + p1.nome);
        System.out.println("Preço Unitário do Produto: " + p1.precoUnitario + " reais");
        System.out.println("Quantidade de " + p1.nome + "s: " + p1.quantidade);
        System.out.println("Exibição do preço total: " + p1.exibirTotalEstoque() + " reais");
    }  
}
