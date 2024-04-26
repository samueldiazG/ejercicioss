import javax.swing.JOptionPane;

public class ejercicio186 {
    public static void main(String[] abc){
		
		InvertirCadena();
		
	}

	public static void InvertirCadena(){
		
		String wd = "";
		
		JOptionPane.showMessageDialog(null,"186. Programa que pida una cadena de caracteres e imprima la palabra en orden\ninverso.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		wd = JOptionPane.showInputDialog(null,"Digite su lo que sea");
		
		JOptionPane.showMessageDialog(null,wd+" Alrevés es: "+TurnAround(wd),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
