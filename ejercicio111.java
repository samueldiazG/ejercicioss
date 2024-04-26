import javax.swing.JOptionPane;

public class ejercicio111 {
    public static void main(String[] abc){
		
		DiaSemana();
		
	}

	public static void DiaSemana(){
		
		int n=0;
		
		JOptionPane.showMessageDialog(null,"111. Programa que pida un número de día y lo muestre en formato de texto, ejemplo:\n1=Domingo, 2=Lunes… 7=Sábado .","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0 || n>7){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número natural del 1 al 7"));}
		
		JOptionPane.showMessageDialog(null,"El "+Date(n)+" es el día número "+n+"  de la semana.","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}

