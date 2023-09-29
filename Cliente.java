package revisao.superior.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Cliente {

	String cpf;
	String nome;

	HashSet<String> telefones = new HashSet<>();
	private ArrayList<Conta> contas = new ArrayList<>();

	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefones=" + telefones + ", contas=" + contas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	public void adicionarConta(Conta obj) {
		if(contas.contains(obj))
			System.out.println("elemento já cadastrado");
		else
			this.contas.add(obj);
	}
	
	public void removerConta(Conta obj) {
		if(contas.contains(obj))
			this.contas.remove(obj);
		else
			System.out.println("elemento inexistente");
	}
	
	public Conta localizarContaPorNumero(String numero) {
		return null;
	}

}
