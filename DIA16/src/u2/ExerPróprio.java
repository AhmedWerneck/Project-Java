package u2;

import javax.swing.JOptionPane;

public class ExerPróprio {

	public static void main(String[] args) {
		//essa é a minha versão do exercício para fixação.
		/*numa situação fictícia, o povão do meu antigo trabalho me pediu para somar todo o
		 * faturamento dos 12 meses de 2022, sendo respectivamente:
		 * Janeiro= 999.459,00
		 * Fevereiro= 528.000,00
		 * Março= 1.239.428,00
		 * Abril= 949.237,48
		 * Maio= 527.388,00
		 * Junho= 123.982,00
		 * Julho= 888.322,00
		 * Agosto= 907.188,00
		 * Setembro= 565.982,00
		 * Outubro= 178.297,00
		 * Novembro= 987.018,00
		 * Dezembro= 1.987.527,00
		 * *Isso aqui também vai servir de base para futuros exercícios, como margem, pontuação de
		 * expressões numericas em java e outras coisas, n apague!
		 */
		  
				double ja = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Janeiro: ")); 
				double	fe = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Feveireiro: "));
			    double	ma = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Março: "));
				double	abr = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Abril: "));
				double	mai = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Maio: "));
				double	jun = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Junho: "));
				double	jul = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Julho: "));
				double	ago = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Agosto: "));
				double	set = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Setembro: "));
				double	out = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Outubro: "));
				double	nov = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Novembro: "));
				double	dez = Double.parseDouble(JOptionPane.showInputDialog("Insira o faturamento de Dezembro: "));
					
					double faturamento_anual = ja + fe + ma + abr + mai + jun + jul + ago + set + out + nov + dez;
					
					JOptionPane.showMessageDialog(null, "Faturamento Anual: "+faturamento_anual);

	}
}
