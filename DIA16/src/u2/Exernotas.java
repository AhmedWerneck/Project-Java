package u2;

import javax.swing.JOptionPane;

public class Exernotas {

	public static void main(String[] args) {
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Insert value"));
		
		if ((nota < 0 || nota > 100))
		{
			JOptionPane.showMessageDialog(null, "Invalid Value. Please insert a value between 0 and 100.");
			main(null);			
		}
		else
		{
		
			if (nota < 50)
				JOptionPane.showMessageDialog(null, "Bad");
			else if (nota < 70)
				JOptionPane.showMessageDialog(null, "Average");
			else if (nota < 90)
				JOptionPane.showMessageDialog(null, "Good");
			else
				JOptionPane.showMessageDialog(null, "Excelent");
		
		
		
		
		
		
		
		}	
	}
}
		
		
		
			
	

	


