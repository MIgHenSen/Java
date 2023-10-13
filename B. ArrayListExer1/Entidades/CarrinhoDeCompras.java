package Entidades;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.ArrayList;

/* Um ArrayList e uma claase generica para colecoes, podendo guardar
 * colecoes de quaisquer tipo de dados */
public class CarrinhoDeCompras {
	private ArrayList<Produto> produtos;
	
//Construtor
	public CarrinhoDeCompras() {
		produtos = new ArrayList<>();
	}
	
//Metodos
	// Metodo para adicionar item a colecao
	public void adicionarProduto(Produto produto) {
		/* isEmpty e um metodo de ArrayList que verifica se a 
		 * lista esta vazia */
		if (produtos.isEmpty()) {
			/* add e o metodo de ArrayList que adiciona 
			 * objetos a colecao */ 
			produtos.add(produto);
		} else {
			for (Produto p : produtos) {
				if (p.getNome().contains(produto.getNome())) {
					p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
					break;
				}
				/* add e o metodo de ArrayList que adiciona 
				 * objetos a colecao */
				produtos.add(produto);
			}
		}
	}
	
	public void remover(String nome) {
		/* isEmpty e um metodo de ArrayList que verifica se a 
		 * lista esta vazia */
		if(produtos.isEmpty()) {
			System.out.println("Carrinho Vazio !!!");
		}
		else {
			for (int i = 0; i < produtos.size(); i++) {
				if (produtos.get(i).getNome().contains(nome)) {
					produtos.get(i).decrementarQuantidade();
					System.out.println("Um item desse produto foi removido!");
					if (produtos.get(i).getQuantidade() == 0) {
						/* remove e o metodo de ArrayList que deleta 
						 * objetos da colecao */
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
    	/* isEmpty e um metodo de ArrayList que verifica se a 
		 * lista esta vazia */
    	if(produtos.isEmpty()) {
    		System.out.println("Este produto não existe no carrinho!!!");
    	}else {
    		for (Produto produto : produtos) {
                System.out.println(produto);
            }
    	}
        
    }
}