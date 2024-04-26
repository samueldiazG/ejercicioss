import javax.swing.JOptionPane;

public class ejercicio168 {
    public static void main(String[] abc){
		
		OrdenamientoVocales();
		
	}
	
	public static void OrdenamientoVocales(){
		
		String a = "";
		
		JOptionPane.showMessageDialog(null,"168. Programa que permita leer las 5 letras vocales en desorden y mostrarlas en\npantalla ordenadas.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	
		a = JOptionPane.showInputDialog(null,"Digite las cinco vocales en desorden");

		JOptionPane.showMessageDialog(null,OrdenarVocales(a),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static Object OrdenarVocales(String a) {
        throw new UnsupportedOperationException("Unimplemented method 'OrdenarVocales'");
    }
	
}
