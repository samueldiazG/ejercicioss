import javax.swing.JOptionPane;

public class ejercicio151 {
    public static void main(String[] abc){
		
		CadenaLongitud();
		
	}

	public static void CadenaLongitud(){
		
		String a;
		
		JOptionPane.showMessageDialog(null,"151. Hacer un programa que pida al usuario que digite una cadena de caracteres,\nluego verificar la longitud de la cadena, y si ésta supera a 10 caracteres mostrarla\nen pantalla, caso contrario no mostrarla.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		a = JOptionPane.showInputDialog(null,"Digite lo que sea");
	
		if (a.length()>10){JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);}
		
	}
}
