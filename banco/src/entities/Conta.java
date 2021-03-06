package entities;

public class Conta {
	private int nConta;
	private String nome;
	private double saldo;
	

	public Conta(int nConta, String nome, double initialDeposit) {
		this.nConta = nConta;
		this.nome = nome;
		depositar(initialDeposit);
	}
	
	public Conta(int nConta, String nome) {
		super();
		this.nConta = nConta;
		this.nome = nome;
	}




	public int getConta() {
		return nConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return  + nConta 
				+ ", Holder: " + nome 
				+ ", Balance: " + String.format("$ %.2f%n", saldo); 
				
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor + 5.0;
	}
	
	
	
	
	
}
