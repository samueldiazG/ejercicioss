import javax.swing.JOptionPane;

public class ejercicio120 {
    public static void main(String[] abc){
		
		HolaUsuarioBucle();
		
	}

	public static void HolaUsuarioBucle(){
		
		JOptionPane.showMessageDialog(null,"120. Programa que mande a imprimir el texto “Hola usuario!” , y que pregunte al\nusuario si desea que siga imprimiendo el texto [S/N]? . De acuerdo a la respuesta\ndel usuario [S ó N], el saludo siga imprimiendo ó se detenga .","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		int op;

		do{

			JOptionPane.showMessageDialog(null,"Hola Usuario!","Respuesta",JOptionPane.INFORMATION_MESSAGE);
			
			op = JOptionPane.showConfirmDialog(null,"¿Desea repetir este mensaje?");
			
		}while(JOptionPane.OK_OPTION==op);
		
		
	}
	
}
