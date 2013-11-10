package pessoa.cliente;


public interface IClienteDAO {
	
	public void addCliente(Cliente cliente);
	public Cliente isExisteCliente(String emal,String senha);
	public Cliente consultaCpfCliente(String cpfCliente);

}