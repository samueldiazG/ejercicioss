import javax.swing.JOptionPane;

public class ejercicio119 {
    public static void main(String[] abc){
		
		WeirdLogin();
		
	}

	public static void WeirdLogin(){
		
		String n="";
		String password="passwd";
		
		JOptionPane.showMessageDialog(null,"119. Programa que pida al usuario una contraseña a el usuario, y muestre un\nmensaje de “contraseña incorrecta” ó “contraseña aceptada” según corresponda,\ncolocando un contador de intentos, si excede 3 intentos deberá mostrar “Intentos\nexcedidos” y finalice. La contraseña correcta será “passwd”.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=4; i++){

			n = JOptionPane.showInputDialog(null,"Digite su contraseña (Intento "+i+"/4)");
			
			if (password.equalsIgnoreCase(n)==true){break;}
			
		}
		
		if (password.equalsIgnoreCase(n)==true){
			
			JOptionPane.showMessageDialog(null,"Bienvenido","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"Su contraseña era "+password,"Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
	}
	

}
