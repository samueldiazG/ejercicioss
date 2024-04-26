import javax.swing.JOptionPane;

public class ejercicio159 {
    public static void main(String[] abc){

		NumeroPrimoV2();
		
	}

	public static void NumeroPrimoV2() {
		
	    int n=0;
	    
	    JOptionPane.showMessageDialog(null,"159. Programa que pueda determinar si un número es primo (un número primo es\naquel que solo es divisible entre la unidad y él mismo por ejemplo el 7).","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	    
	    while(n<=0){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número natural"));}
		
		if (DetectorPrimo(n)==true){
	    
			JOptionPane.showMessageDialog(null,"El número "+n+" es primo","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"El número "+n+" no es primo","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
	    
	}

    private static boolean DetectorPrimo(int n) {
        
        throw new UnsupportedOperationException("Unimplemented method 'DetectorPrimo'");
    }
	
}
