package vendas;

import java.util.Collection;
import java.util.LinkedList;

public class VendaDAO implements IVendaDAO {

	private static Collection<Venda> minhasVendas = new LinkedList<Venda>();
	
	public void addVenda(Venda venda) {
		
		minhasVendas.add(venda);
		
	}


	
}
