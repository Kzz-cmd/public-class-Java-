public class Produto {
    String nome;
    int quantidade;
    double precoUnitario;
    double exibirTotalEstoque(){
        return precoUnitario * quantidade;
    }    
}
