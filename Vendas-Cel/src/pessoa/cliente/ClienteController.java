package pessoa.cliente;

import pessoa.Endereco;


public class ClienteController {
	
	

	public void CadastrarClientes(String nome, String sobrenome,
			String datadenascimento, String cpf, String rg,
			String telefone, String email, String senha, Endereco endereco) 
		{
			
			Cliente cliente= new Cliente();
			
			
			cliente.setNome(nome);
			cliente.setSobrenome(sobrenome);
			cliente.setDatadenascimento(datadenascimento);
			cliente.setCpf(cpf);
			cliente.setRg(rg);
			cliente.setTelefone(telefone);
			cliente.setEmail(email);
			cliente.setSenha(senha);
			cliente.setEndereco(endereco);
			cliente.salvar();
		}

	
			
}
	
	


