import javax.swing.JOptionPane;

public class ejercicio155 {
    public static void main(String[] abc){
		
		Palindroma();
		
	}

	public static void Palindroma(){
		
		String a;
		
		JOptionPane.showMessageDialog(null,"155. Hacer un programa que determine si una palabra es palíndroma.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		a = JOptionPane.showInputDialog(null,"\nDigite una palabra");
		if (IgnoreTilde(a).equalsIgnoreCase(IgnoreTilde(TurnAround(a)))==true){
			
			JOptionPane.showMessageDialog(null,"La palabra "+a+" es una palabra palíndroma","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"La palabra "+a+" no es una palabra palíndroma","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}

    private static String TurnAround(String a) {
        throw new UnsupportedOperationException("Unimplemented method 'TurnAround'");
    }

    private static String IgnoreTilde(String a) {
        throw new UnsupportedOperationException("Unimplemented method 'IgnoreTilde'");
    }
	
}
