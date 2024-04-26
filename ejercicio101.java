import javax.swing.JOptionPane;

public class ejercicio101 {
    public class DivisibleONo_101roEjercicio extends FuncionaesNumericas{
	
	public static void main(String[] abc){
		
		DivisibleONo();
		
	}

	public static void DivisibleONo(){
		
		int[] n= new int[2];
		String[] a= {"un","otro"};
		
		JOptionPane.showMessageDialog(null,"101. Determinar si un número entero es divisible por otro e imprimir divisible, caso\ncontrario visualizar no es divisible.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite "+a[i]+" número entero"));
			
		}
		
		if (Divisible(n)==true){//La función Divisible() se encuentra en la clase "FuncionaesNumericas"
			
			JOptionPane.showMessageDialog(null,"Los números son divisibles entre si.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"Los números no son divisibles entre si.","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

    private static boolean Divisible(int[] n) {
        throw new UnsupportedOperationException("Unimplemented method 'Divisible'");
    }
	
}
}
