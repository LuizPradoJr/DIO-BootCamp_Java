package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoque.adicionarProduto(8L, "Produto D", 8, 20.0);

        estoque.exibirProdutos();

        System.err.println("Valor total do estoque R$" + estoque.calculaValorTotalEstoque() );

        System.err.println("Produtomais caro: " + estoque.obterProdutoMaisCaro());

        
    }

    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long cod, String nome, int quantidade, double preco ){
        estoqueProdutosMap.put(cod, new Produto(nome,quantidade,preco));
    }
    
    public void exibirProdutos( ){
       System.out.println(estoqueProdutosMap);
    }


    public double calculaValorTotalEstoque( ){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){

            for(Produto p: estoqueProdutosMap.values() ){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
     }



     public Produto obterProdutoMaisCaro( ){
        Produto produtoMaisCaro =null;
        Double maiorPreço = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){

            for(Produto p: estoqueProdutosMap.values() ){
                if(p.getPreco() > maiorPreço){
                    produtoMaisCaro =p;
                }
            }
        }
        return produtoMaisCaro;
     }

}
