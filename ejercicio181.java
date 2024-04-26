import javax.swing.JOptionPane;

public class ejercicio181 {
    public static void main(String[] abc){
		
		NumeroPerfecto();
		
	}

	public static void NumeroPerfecto(){
		
		long n = 0;
		
		JOptionPane.showMessageDialog(null,"181. Programa que me permita calcular si un número dado por el usuario es un\nnúmero perfecto (un número es perfecto, cuando la suma de sus divisores, sin\nincluirlo al número es exactamente el mismo número). El 6 es un número perfecto\nporque sus divisores son 1,2 y 3.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n==0){n = Long.parseLong(JOptionPane.showInputDialog(null,"Digite un número entero"));}
		
		if (Perfecto(n)==true){
			
			JOptionPane.showMessageDialog(null,"El número "+n+" es perfecto.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"El número "+n+" no es perfecto.","Output",JOptionPane.ERROR_MESSAGE);
			
		}
		
}
