import javax.swing.JOptionPane;

public class ejercicio182 {
    public static void main(String[] abc){
		
		NumeroRomano();
		
	}

	public static void NumeroRomano(){
		
		int n = 0;
		
		JOptionPane.showMessageDialog(null,"182. Programa que permita convertir un número menor o igual a 1000 en números\nromanos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0 || n>1000){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));}
		
		JOptionPane.showMessageDialog(null,"El "+n+" en Romano es "+Romano(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}

