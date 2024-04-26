import javax.swing.JOptionPane;

public class ejercicio138 {
    public static void main(String[] args) {

		AreasDeFiguras();
		
	}
	
	public static void AreasDeFiguras() {
	    
		Object opcion;
		Object [] Figuras = {"Seleccione","Triángulo","Círculo","Rombo","Salir"};
		
		JOptionPane.showMessageDialog(null,"138. Programa que muestre un menú de 3 opciones para calcular 3 áreas de figuras\ngeométricas diferentes para que el usuario pueda elegir cuál área calcular. El\nalgoritmo termina al teclear un 0.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
		
			do{

				opcion = JOptionPane.showInputDialog(null,"¿Qué area desea calcular?", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Figuras, Figuras[0]);
				
			}while(opcion==Figuras[0]);
		
			if (opcion==Figuras[1]){
				
				float b =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la base del triángulo (cm)"));
			
				float a =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la altura del triángulo (cm)"));
				
				JOptionPane.showMessageDialog(null,"El area de su triangulo es "+AreaT(b,a)+" cm^2","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}else if (opcion==Figuras[2]){
				
				float r =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el radio del círculo (cm)","Output",JOptionPane.INFORMATION_MESSAGE));
				
				JOptionPane.showMessageDialog(null,"El area de su círculo es "+AreaC(r,3.1416f)+" cm^2","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}else if (opcion==Figuras[3]){
				
				float dmy =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la diagonal mayor del rombo (cm)"));

				float dmn =Float.parseFloat(JOptionPane.showInputDialog(null,"la diagonal menor del rombo (cm)"));
				
				JOptionPane.showMessageDialog(null,"El area de su rombo es "+AreaR(dmy,dmn)+" cm^2","Output",JOptionPane.INFORMATION_MESSAGE);
		    
			}
			
		}while(opcion!=Figuras[4]);
		
	}
}
}
