import javax.swing.JOptionPane;

public class ejercicio107 {
    public static void main(String[] abc){
		
		EdadV2();
		
	}

	public static void EdadV2(){
		
		int n=0;
		
		JOptionPane.showMessageDialog(null,"107. Programa que de acuerdo al dato de la edad, indicado por el usuario, determine\nsi una persona es mayor o menor de edad, incluir una verificación para que solo se\nacepten valores entre 1 y 100.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0 || n>100){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la edad de la persona"));}
		
		if(n<18){
		
			JOptionPane.showMessageDialog(null,"La persona es menor de edad","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"La persona es mayor de edad","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
}
