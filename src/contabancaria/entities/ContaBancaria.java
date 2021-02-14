package contabancaria.entities;

public interface ContaBancaria {
	
	public abstract void abrirConta();
	public abstract void fecharConta();
	public abstract boolean depositar(double valor);
	public abstract boolean sacar(double valor);
	public abstract double saldo();
	public abstract void chequeEspecial();
	public abstract void pagarMensalidade();
	public abstract void juros();
	
}
