import javax.swing.JOptionPane;

public class ejercicio118 {
    public static void main(String[] abc){
		
		DiezProductos();
		
	}

	public static void DiezProductos(){
		
		double[] n=new double[10];
		
		JOptionPane.showMessageDialog(null,"118. Escribir un programa que pida los montos de 10 artículos (de una tienda) y\nmuestre en pantalla el monto total a pagar","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i]=0;
			
			while (n[i]<=0){n[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el monto de el/los producto N°"+(i+1)));}
			
		}
		
		JOptionPane.showMessageDialog(null,"El total a pagar es "+Sumatoria(n)+"$","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	

}

