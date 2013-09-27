package produtos;

public class ProdutoController {

	public void CadastrarProdutos(int Id, String nome, String fabricante, String sistemaOperacional,
			String cor, String tamanho,String tamanhoTela, String modelo, String conexao,
			String camera, String memoriaInterna, int quantidade, double preco){
		
		Produto produto= new Produto();
		
		produto.setId( produto.getPonteiro() + 1);
		produto.setNome(nome);
		produto.setFabricante(fabricante);
		produto.setSistemaOperacional(sistemaOperacional);
		produto.setCor(cor);
		produto.setTamanho(tamanho);
		produto.setTamanhoTela(tamanhoTela);
		produto.setModelo(modelo);
		produto.setConexao(conexao);
		produto.setCamera(camera);
		produto.setMemoriaInterna(memoriaInterna);
		produto.setQuantidade(quantidade);
		produto.setPreco(preco);
		produto.salvar();
	}
	
	public Produto pesquisaProduto(String nomeProduto){
			
		ProdutoDAO produtoDAO = new ProdutoDAO();	

		return produtoDAO.consultaProduto(nomeProduto);
	}
}
