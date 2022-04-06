package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		
	Cliente adam = new Cliente();
	adam.setNome("Adam");
		
	Conta cc = new ContaCorrente(adam); //cc: conta corrente
	cc.depositar(100);
	cc.abrirConta();
		
	Conta cp = new ContaPoupanca(adam);// cp: conta poupanca
	cc.transferir(100, cp);
	
	cc.imprimirExtrato();
	cp.imprimirExtrato();
	}

}
