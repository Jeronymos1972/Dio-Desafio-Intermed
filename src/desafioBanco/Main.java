package desafioBanco;

public class Main {

	public static void main(String[] args) {
		
		cliente marcelo = new cliente();
		marcelo.setNome("marcelo");
		
		
		conta cc = new contacorrente(marcelo);
		conta poupanca = new contaPoupanca(marcelo);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}

}
