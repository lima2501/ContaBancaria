package contabancaria.entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Titular titular, Integer numero) {
		super(titular, numero);
		this.juros();
	}

	public void juros() {
		var juros = getSaldo() + getSaldo() * 0.1;
		this.setSaldo(juros);
	}

}
