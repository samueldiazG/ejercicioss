import javax.swing.JOptionPane;

public class ejercicio158 {
    public static void main(String[] abc){
		
		CadenaNumerosSumatoria();
		NumeroVocales();
		
	}

	public static void CadenaNumerosSumatoria(){
		
		double[] n = new double[2];
		int[] parts;
		String[] a = {"entero","real"};
		String bup="",ln="",ca="";
		
		JOptionPane.showMessageDialog(null,"158 1ra Parte. Pedir al usuario 2 cadenas de caracteres de números, uno entero y\nel otro real, convertirlos a sus respectivos valores y por último sumarlos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			do{
				
				do{bup = JOptionPane.showInputDialog(null,"Digite un número "+a[i]);}while(Allowed(bup)==false);//La función Allowed() se encuentra en la clase "FuncionaesNumericas"
				n[i] = Double.parseDouble(bup);
				
				parts = Partir(bup);
				
			}while(parts[1]!=0 && i==0);
			
		}
		
		for (int i=0; i<n.length; i++){
			
			if (i==n.length-1){ln=" = ";}else{ln=" + ";}
			
			ca+=n[i]+ln;
			
		}
	
		JOptionPane.showMessageDialog(null,ca+Sumatoria(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	private static int[] Partir(String bup) {

        throw new UnsupportedOperationException("Unimplemented method 'Partir'");
    }

    private static boolean Allowed(String bup) {
        /
        throw new UnsupportedOperationException("Unimplemented method 'Allowed'");
    }

    private static String Sumatoria(double[] n) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Sumatoria'");
    }

    public static void NumeroVocales(){
		
		String a = "";
		
		JOptionPane.showMessageDialog(null,"158 2da Parte.  Realice un programa que lea una cadena de caracteres de la entrada estándar y muestre en la\nsalida estándar cuántas ocurrencias de cada vocal existen en la cadena.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	
		a = JOptionPane.showInputDialog(null,"Digite lo que sea");

        JOptionPane.showMessageDialog(null,"Hay "+fu.Vocales(a)+" vocales en la cadena","Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
}
