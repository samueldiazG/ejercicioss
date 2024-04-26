import javax.swing.JOptionPane;

public class ejercicio103 {
    public class NumeroMenor_103roEjercicio extends FuncionaesNumericas{
	
	public static void main(String[] abc){
		
		NumeroMenor();
		
	}

	public static void NumeroMenor(){
		
		float[] n = new float[3];
		
		JOptionPane.showMessageDialog(null,"103. Desarrolle un programa que solicite ingrese tres números distintos e indique de\nmanera visual en la pantalla cuál de ellos es el número menor ingresado.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			do{
			
				n[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el número N°"+(i+1)));
				
			}while(Verify(n,n[i],i)==true);
			
		}
		
		n = Ordenar(n);
		
		JOptionPane.showMessageDialog(null,"El número menor es "+n[n.length-1],"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static boolean Verify(float[] n, float f, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'Verify'");
    }

    private static float[] Ordenar(float[] n) {
        throw new UnsupportedOperationException("Unimplemented method 'Ordenar'");
    }
	
}
}
