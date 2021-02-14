package contabancaria;

import contabancaria.entities.Conta;
import contabancaria.entities.ContaCorrente;
import contabancaria.entities.ContaJuridica;
import contabancaria.entities.ContaPoupanca;
import contabancaria.entities.Titular;

public class Program {
	public static void main(String[] args) {

		System.out.println("Conta corrente");

		Titular titular = new Titular("alexandre", "alexandre@gmail.com", "11967860484");

		Conta cc = new ContaCorrente(titular, 123);
		cc.depositar(1100);
		cc.depositar(300);
		cc.sacar(130);
		System.out.println(cc);
		System.out.println();

		System.out.println("Conta poupança");

		Titular titular2 = new Titular("Maria", "maria@gmail.com", "11985159148");

		Conta cp = new ContaPoupanca(titular2, 567);
		cp.depositar(1000.00);
		cp.juros();
		System.out.println(cp);
		System.out.println();

		System.out.println("Conta juridica");

		Titular titular3 = new Titular("Pedro", "pedro@gmail.com", "11982196781");
		Conta cj = new ContaJuridica(titular3, 456);
		cj.depositar(5000.00);
		System.out.println(cj);

	}
}
