package u3.aluCar;

import java.time.LocalDate;


public class AluCarApp {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.idCarro = 1;
		carro1.model = "CR-V";
		carro1.placa = "AWFB-3006";
		carro1.fabri = "Honda";
		carro1.ano = 2008;
		carro1.cor = "Preto";
		carro1.valorD = 99.90f;
		
		
		
		Carro carro2 = new Carro();
		
		
		
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.cpf = "576.372.009-33";
		cliente1.cnh = "XZY123456";
		cliente1.nome = "Ahmed Werneck";
		
		Cliente cliente2 = new Cliente(); 
		
		
		
		
		
		
				
		
	}



	public void realizarLocacao(long idCarro, long idCliente)
	{
		Locacao locacao = new Locacao();
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
		locacao.idLocal = 1;
		locacao.dataini = LocalDate.now();
		locacao.datafim = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * 99.90f;
		
	}
	public void realizarLocacao(LocalDate dataini, LocalDate datafim)
	{
	
		float tF = 2 * 99.9f; 
			
		
		
	}

}
		
		



