import javax.swing.JOptionPane;

public class ejercicio157 {
    public static void main(String[] abc){
		
		NombreMayuscula();
		
	}

	public static void NombreMayuscula(){
		
		String a = "";
		
		JOptionPane.showMessageDialog(null,"157. Pedir su nombre al usuario en MAYÚSCULA, si su nombre comienza por la letra\nA, convertir su nombre a minúsculas, caso contrario no convertirlo.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	
		a = JOptionPane.showInputDialog(null,"Digite su nombre en mayusculas");

		if ("A".equals(a.charAt(0)+"")==true){
			
			JOptionPane.showMessageDialog(null,a.toLowerCase(),"Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
	
}
