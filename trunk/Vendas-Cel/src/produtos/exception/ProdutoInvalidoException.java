package produtos.exception;

public class ProdutoInvalidoException extends Exception{
	public ProdutoInvalidoException(){super("Este produto j� foi cadastrado!");}

}
