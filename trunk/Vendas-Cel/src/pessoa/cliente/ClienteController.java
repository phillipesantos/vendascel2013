package pessoa.cliente;

import pessoa.Endereco;




public class ClienteController {
	
	

		public void CadastrarCliente
		( String email,String senha,String confirmarsenha,String nome,String sobrenome,String datadenascimento,boolean sexo,
		 Endereco endereco,String cpf,String identidade,String telefone)
		{
			
			Cliente cliente= new Cliente();
			
			
			cliente.setNome(nome);
			cliente.setSobrenome(sobrenome);
			cliente.setDatadenascimento(datadenascimento);
			cliente.setSexo(sexo);
			cliente.setEndereco(endereco);
			cliente.setCpf(cpf);
			cliente.setIdentidade(identidade);
			cliente.setTelefone(telefone);
			cliente.setEmail(email);
			cliente.setSenha(senha);
			cliente.setConfirmarsenha(confirmarsenha);
			cliente.salvar();
		}
	}
	

}
