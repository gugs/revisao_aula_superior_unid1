package revisao.superior.model;

import java.util.Date;
import java.util.Objects;

public class Conta {

	String numero;
	private float saldo;
	Date dataAbertura;
	boolean status;
	
	private static int CONTADOR = 0;
	
	
	public Conta(String numero, float saldo, Date dataAbertura, boolean status) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.status = status;
	}

	public Conta(String numero) {
		this.saldo = 0f;
		this.numero = numero;
		this.status = true;
		this.dataAbertura = new Date();
		CONTADOR++;
	}
	
	public Conta() {
		CONTADOR++;
	}
	
	public void depositar(float quantia) {
		if(quantia > 0 && this.status)
			this.saldo +=quantia;
		else
			System.out.println("Não foi possível realizar o depósito");
	}
	
	public void sacar(float quantia) {
		if(quantia <= this.saldo && status)
			this.saldo -= quantia;
		else
			System.out.println("Não foi possível realizar o saque");
	}
	
	public void transferir(float quantia, Conta destino) {
		if(quantia <= this.saldo && this.status && destino.status && quantia > 0) {
			this.saldo -= quantia;
			destino.saldo += quantia;
		}else
			System.out.println("Não foi possível realizar a transferência");
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status=" + status
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numero, other.numero);
	}
	
	
	public static int getContador() {
		return CONTADOR;
	}

	
}
