package contabancaria.entities;

public abstract class Conta implements ContaBancaria {

	private Titular titular;
	private Integer numero;
	private Double saldo;
	private Boolean status;

	public Conta(Titular titular, Integer numero) {
		this.titular = titular;
		this.numero = numero;
		this.abrirConta();
		this.setSaldo(0.0);
		this.chequeEspecial();
		this.pagarMensalidade();
		this.juros();
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	// Métodos

	@Override
	public void abrirConta() {
		this.setStatus(true);
	}

	@Override
	public void fecharConta() {
		this.setStatus(false);
	}

	@Override
	public boolean depositar(double valor) {
		if (status) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean sacar(double valor) {
		if (status) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double saldo() {

		return this.saldo();
	}

	@Override
	public void chequeEspecial() {

	}

	@Override
	public void pagarMensalidade() {

	}
	
	@Override
	public void juros() {
		
	}

	@Override
	public String toString() {
		var aberta = "";
		if (status) {
			aberta = "Ativa";
		} else {
			aberta = "Inativa";
		}
		return titular.toString() + "\nNúmero da conta: " + numero + "\nSaldo R$: " + saldo + "\nStatus da conta: "
				+ aberta;
	}

}
