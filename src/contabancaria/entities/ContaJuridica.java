package contabancaria.entities;

public class ContaJuridica extends Conta {

	public ContaJuridica(Titular titular, Integer numero) {
		super(titular, numero);
		
	}

	@Override
	public void chequeEspecial() {
		this.setSaldo(getSaldo() + 200);
	}

	@Override
	public void pagarMensalidade() {
		this.setSaldo(getSaldo() - 20);
	}
	
}
