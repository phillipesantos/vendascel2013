package pessoa.funcionario;

import pessoa.Pessoa;

public class ExecutorPoli {

	  public static void main(String[] args) {

		  /*------------------------------------------*/
		  Pessoa p = new Pessoa();
		  Funcionario f = new Funcionario();
		  
		  p.setCpf("000.000.000-00");
		  f.setCtps("000000");		  
		  /*------------------------------------------*/
		  Pessoa p2 = new Funcionario();
		  ((Funcionario)p2).setCpf("111.111.111-11");
		  ((Funcionario)p2).setCtps("11111111");
		  ((Funcionario)p2).setMatricula("11111");
		  /*------------------------------------------*/
		  System.out.println(p.getCpf());
		  System.out.println(f.getCtps());
		  System.out.println("----------------------------");
		  System.out.println(((Funcionario)p2).getCpf());
		  System.out.println(((Funcionario)p2).getCtps());
		  System.out.println(((Funcionario)p2).getMatricula());
		  /*------------------------------------------*/
		 
	  }
}
