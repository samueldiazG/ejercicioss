import javax.swing.JOptionPane;

public class ejercicio134 {
    public static void main(String[] abc){
		
		MayorOMenorV2();
		
	}

	public static void MayorOMenorV2(){
		
		float[] n= new float[3];
		String[] a= {"un","otro"};
		
		JOptionPane.showMessageDialog(null,"134. Programa que pida 3 números enteros y determine cuál de ellos es el mayor y\ncuál el menor. Incluir una validación que evite que los 2 de esos números sean\niguales.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for(int i=0; i<n.length; i++){
			
			do{
		
				n[i]= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite "+a[i%2]+" número cualquiera"));
				
			}while(Verify(n,n[i],i));
			
		}
		
		n = Ordenar(n);
	
		JOptionPane.showMessageDialog(null,"El número mayor es es "+n[0]+" y el menor es "+n[n.length-1],"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}

