package pessoa.cliente;

import java.util.Collection;
import java.util.LinkedList;


public class ClienteDAO implements IClienteDAO {
	
private static Collection<Cliente> meusClientes = new LinkedList<Cliente>();
	


	
	public  void addCliente(Cliente cliente) {
	meusClientes.add(cliente);
		
	}

	
	public Cliente isExisteCliente(String email, String senha) {
	
		Cliente cliente1 = new Cliente();
		for ( Cliente cliente : meusClientes) {
			if(cliente.getEmail().equals(email)){
				
				
				cliente1.setEmail(email); 
				cliente1.setSenha(senha);
			
			}
	    }	
		
		
		return cliente1;
		
	}




	public static Collection<Cliente> getMeusClientes() {
		return meusClientes;
	}


	public static void setMeusClientes(Collection<Cliente> meusClientes) {
		ClienteDAO.meusClientes = meusClientes;
	}


	public Cliente consultaCpfCliente(String cpfCliente) {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : meusClientes) {
			if(cliente.getCpf().equals(cpfCliente)){
				clienteEncontrado = cliente;
			}
		}
		return clienteEncontrado;	
	}

}
