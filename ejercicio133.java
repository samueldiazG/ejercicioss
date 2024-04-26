import javax.swing.JOptionPane;

public class ejercicio133 {
    public static void main(String[] abc){
		
		MayorOMenor();
		
	}

	public static void MayorOMenor(){
		
		float[] n= new float[2];
		String[] a= {"un","otro"};
		
		JOptionPane.showMessageDialog(null,"133. Programa que pida 2 números enteros y determine cuál de ellos es el mayor y\ncuál el menor.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for(int i=0; i<n.length; i++){
		
			n[i]= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite "+a[i]+" número cualquiera"));
			
		}
		
		n= Ordenar(n);
	
		JOptionPane.showMessageDialog(null,"El número mayor es es "+n[0]+" y el menor es "+n[n.length-1],"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
