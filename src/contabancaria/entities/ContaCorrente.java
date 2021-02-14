package contabancaria.entities;

public class ContaCorrente extends Conta {
		
	public ContaCorrente(Titular titular, Integer numero) {
		super(titular, numero);
	}

	@Override
	public void chequeEspecial() {
		this.setSaldo(300.00);
	}
	
	@Override
	public void pagarMensalidade() {
		this.setSaldo(getSaldo() - 10);
	}
	
}
