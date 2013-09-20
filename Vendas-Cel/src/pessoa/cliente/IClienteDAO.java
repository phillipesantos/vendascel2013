package pessoa.cliente;


public interface IClienteDAO {
	
	public void addCliente(Cliente cliente);
	public boolean isExisteCliente(String nomeCliente);
	public Cliente consultaProduto(String nomeCliente);

}