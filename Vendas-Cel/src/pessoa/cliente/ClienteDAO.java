package pessoa.cliente;

import java.util.Collection;
import java.util.LinkedList;


public class ClienteDAO implements IClienteDAO {
	
private static Collection<Cliente> meusClientes = new LinkedList<Cliente>();
	
	

	@Override
	public void addCliente(Cliente cliente) {
	meusClientes.add(cliente);
		
	}

	@Override
	public boolean isExisteCliente(String nomeCliente) {
		boolean existe = false;
		for (Cliente cliente : meusClientes) {
			if(cliente.getNome().equals(nomeCliente)){
				existe = true;
			}
	    }
		return existe;
	}

	@Override
	public Cliente consultaProduto(String nomeCliente) {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : meusClientes) {
			if(cliente.getNome().equals(nomeCliente)){
				clienteEncontrado = cliente;
			}
		}
		return clienteEncontrado;	
	}

}
