package produtos.exception;

public class ProdutoInvalidoException extends Exception{
	public ProdutoInvalidoException(){super("Este produto já foi cadastrado!");}

}
