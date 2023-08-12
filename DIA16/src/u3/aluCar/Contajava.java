package u3.aluCar;

public class Contajava {

	int numero;
	double saldo;
	double limite;
	String nome;
	
	public boolean saca(double valor)
	{	
		return false;
	}
	
	public void deposita(double valor)
	{
		
	}

	public void transfere(Contajava destino, double valor)
	{
		
	}
	public static void main(String[] args) {
		
		Contajava conta1 = new Contajava ();
		Contajava conta2 = new Contajava ();
		
		conta1.transfere(conta2, 50);
		
	}
	
}