import javax.swing.JOptionPane;

public class ejercicio154 {
    public static void main(String[] abc){
		
		OlaKeTal();
		
	}

	public static void OlaKeTal(){
		
		String a;
		String olaketal = "Hola ¿Qué tal?";
		
		JOptionPane.showMessageDialog(null,"154. Crear una cadena que tenga la siguiente frase 'Hola que tal', luego crear otra\ncadena para preguntarle al usuario su nombre, por último añadir el nombre al final\nde la primera cadena y mostrar el mensaje completo Hola que tal (Nombre De\nUsuario).","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		a = JOptionPane.showInputDialog(null,olaketal+"\nDigite su nombre");
	
		JOptionPane.showMessageDialog(null,olaketal+" "+a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
