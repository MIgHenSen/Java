package Entidades;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Produto> produtos;
	
//Construtor
	public CarrinhoDeCompras() {
		produtos = new ArrayList<>();
	}
	
//Metodos - Gets/Sets
	public void adicionarProduto(Produto produto) {
		if (produtos.isEmpty()) {
			produtos.add(produto);
		} else {
			for (Produto p : produtos) {
				if (p.getNome().contains(produto.getNome())) {
					p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
					break;
				}
				produtos.add(produto);
			}
		}
	}
	
	public void remover(String nome) {
		if(produtos.isEmpty()) {
			System.out.println("Carrinho Vazio !!!");
		}
		else {
			for (int i = 0; i < produtos.size(); i++) {
				if (produtos.get(i).getNome().contains(nome)) {
					produtos.get(i).decrementarQuantidade();
					System.out.println("Um item desse produto foi removido!");
					if (produtos.get(i).getQuantidade() == 0) {
						produtos.remove(i);
						System.out.println("Este produto foi totalmente removido do carrinho!");
						break;
					}else {
						break;	
					}
				}
			}
		}
	}

    public void exibirProdutos() {
    	if(produtos.isEmpty()) {
    		System.out.println("Este produto não existe no carrinho!!!");
    	}else {
    		for (Produto produto : produtos) {
                System.out.println(produto);
            }
    	}
        
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}