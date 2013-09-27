package pessoa.cliente;

import pessoa.Endereco;




public class ClienteController {
	
	

	public void CadastrarClientes(String nome, String sobrenome,
			String datadenascimento, String cpf, String identidade,
			String telefone, String email, String senha) 
		{
			
			Cliente cliente= new Cliente();
			
			
			cliente.setNome(nome);
			cliente.setSobrenome(sobrenome);
			cliente.setDatadenascimento(datadenascimento);
			cliente.setCpf(cpf);
			cliente.setIdentidade(identidade);
			cliente.setTelefone(telefone);
			cliente.setEmail(email);
			cliente.setSenha(senha);
			cliente.salvar();
		}

		
			// TODO Auto-generated method stub
			
		}
	
	


