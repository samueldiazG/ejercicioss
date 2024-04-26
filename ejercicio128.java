import javax.swing.JOptionPane;

public class ejercicio128 {
    public static void main(String[] abc){
		
		BisiestoV3();
		
	}

	public static void BisiestoV3(){
		
		int n=0;
		
		JOptionPane.showMessageDialog(null,"128. Programa para determinar si el año (en formato de 4 dígitos) indicado por el\nusuario es bisiesto (todo año múltiplo de 4 es bisiesto, excepto aquellos múltiplos\nde 100, aunque si también son múltiplos de 400, entonces, sí serán bisiestos. Ej.\n2000 si es bisiesto, pero 1800 no).","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=1000 || n>9999){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un año"));}
		
		if (DetectorBisiesto(n)==true){
			
			JOptionPane.showMessageDialog(null,"El año "+n+" es bisiesto","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"El año "+n+" no es bisiesto","Output",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
}

