import javax.swing.JOptionPane;

public class ejercicio177 {
    public static void main(String[] abc){
		
		DivisoresNumero();
		
	}

	public static void DivisoresNumero(){
		
		long n = 0;
		long[] d;
		String a="";
		
		JOptionPane.showMessageDialog(null,"177. Programa que muestre los divisores de un número introducido por el usuario. (ej. 27 -> 9,3,1)","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n==0){n = Long.parseLong(JOptionPane.showInputDialog(null,"Digite un número entero"));}
		
		d = Divisor(n);

		for (int i=d.length-1; i>=0; i--){

			a+=d[i]+", ";
			
		}
		
		a = fu.DeleteChar(a,a.length()-1);
		
		JOptionPane.showMessageDialog(null,"Los divisores de "+n+" son "+a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}

