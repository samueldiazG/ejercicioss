import javax.swing.JOptionPane;

public class ejercicio100 {
    public static void main(String[] abc){
		
		SumatoriaPar();
		
	}

	public static void SumatoriaPar(){
		
		double[] n= new double[2];
		String[] a= {"un","otro"};
		
		JOptionPane.showMessageDialog(null,"100. Desarrollar un algoritmo que lea dos números, e indique si la suma de los dos\nnúmeros es par, caso contrario visualizar la suma es impar.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite "+a[i]+" número cualquiera"));
			
		}
		
		if (Sumatoria(n)%2==0){
			
			JOptionPane.showMessageDialog(null,"La sumatoria de los números es par ("+Sumatoria(n)+")","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (Sumatoria(n)%2==1){
			
			JOptionPane.showMessageDialog(null,"La sumatoria de los números es impar ("+Sumatoria(n)+")","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"La sumatoria de los números no es ni par ni impar ("+Redondear(Sumatoria(n),4)+")","Output",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

    private static String Redondear(String sumatoria, int i) {
    
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }
    private static String Sumatoria(double[] n) {
        throw new UnsupportedOperationException("Unimplemented method 'Sumatoria'");
    }
	
}
