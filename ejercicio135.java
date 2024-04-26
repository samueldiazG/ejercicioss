import javax.swing.JOptionPane;

public class ejercicio135 {
    public static void main(String[] abc){
		
		MayorOMenorV3();
		
	}

	public static void MayorOMenorV3(){
		
		String[] a= {"un","otro"};
		
		JOptionPane.showMessageDialog(null,"135. Programa que lea una cantidad de números N , dados por el usuario y\ndetermine cuál de ellos es el mayor y cuál es el menor. Pedir la cantidad límite de\nnúmeros al usuario.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		int ca= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos números va a ingresar?"));
		
		float[] n= new float[ca];
		
		for(int i=0; i<n.length; i++){
		
			n[i]= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite "+a[i%2]+" número cualquiera"));
			
		}
		
		n= Ordenar(n);
	
		JOptionPane.showMessageDialog(null,"El número mayor es es "+n[0]+" y el menor es "+n[n.length-1],"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
