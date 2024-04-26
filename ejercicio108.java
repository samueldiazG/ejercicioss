import javax.swing.JOptionPane;

public class ejercicio108 {
    public static void main(String[] abc){
		
		ParOImparV2();
		
	}

	public static void ParOImparV2(){
		
		int n=0;
		
		JOptionPane.showMessageDialog(null,"108. Programa que determine si un número dado por el usuario es par o impar.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));}

		if (n%2==0){
			
			JOptionPane.showMessageDialog(null,n+" es par.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,n+" es impar.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}

}
