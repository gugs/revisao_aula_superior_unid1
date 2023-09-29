package revisao.superior.model;

public class Aplicacao {

	
	public static void main(String[] args) {
		
		
		Cliente cl1 = new Cliente("000", "Gustavo");
		
		Conta c1 = new Conta("321B");
		
		Conta c2 = new Conta("123A");
				
		c1.depositar(100f);
		
		c1.sacar(10f);
		
		c1.transferir(15, c2);

		cl1.adicionarConta(c1);
		cl1.adicionarConta(c2);
		
		cl1.telefones.add("83-999996655");
		
		System.out.println(Conta.getContador());
		
		System.out.println(cl1);
		cl1.removerConta(c2);
		System.out.println(cl1);
	}
}
