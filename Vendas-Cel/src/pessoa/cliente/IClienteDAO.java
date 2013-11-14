package pessoa.cliente;

import java.sql.SQLException;


public interface IClienteDAO {
	
	public void addCliente(Cliente cliente) throws ClassNotFoundException, SQLException;


}