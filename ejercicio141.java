import javax.swing.JOptionPane;

public class ejercicio141 {
    public static void main(String[] abc){
		
		RaizV2();
		
	}

	public static void RaizV2(){
		
		float n=0;
		int x=0;
		
		JOptionPane.showMessageDialog(null,"141. Usando la función para truncar números con decimales (ejemplo : trunc() )\nrealizar un programa que pida un número al usuario y calcule su raíz cuadrada.\nNota. Solo debe usarse las operaciones : + ,- ,*, / y % .","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el radicando x para 2Raiz(x)"));}
		
		int[] parts = Partir(""+n);//La función Math.trunc no me quiso funcinar, copié y pequé el como se escribia, importe el java.lang y nada, al final decidí usar mi función que hace lo mismo
		
		x = parts[0]; 
		
		JOptionPane.showMessageDialog(null,"El programa sufrirá una pequeña pausa, esto es completamente normal","Output",JOptionPane.INFORMATION_MESSAGE);//horas/minima/tarifa/incremento

		JOptionPane.showMessageDialog(null,"2Raiz("+x+") = "+Redondear(Raiz(x,2),5),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
