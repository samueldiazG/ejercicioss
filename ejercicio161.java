import javax.swing.JOptionPane;

public class ejercicio161 {
    public static void main(String[] abc){
		
		IntercambioV2();
		
	}

	public static void IntercambioV2(){
		
		float a=0,b=0,c=0;
		
		JOptionPane.showMessageDialog(null,"161. Programa que intercambia los valores de dos variables numéricas dadas por el\nusuario.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		a = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor de la variable A"));
		b = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor de la variable B"));
		
		c=a;
		a=b;
		b=c;
		
		JOptionPane.showMessageDialog(null,"A = "+a+"\nB = "+b,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
