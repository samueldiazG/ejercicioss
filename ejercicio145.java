import javax.swing.JOptionPane;

public class ejercicio145 {
    public static void main(String[] abc){
		
		DetectorTriangulo();
		
	}

	public static void DetectorTriangulo(){
		
		float a=0,b=0,c=0;
		
		JOptionPane.showMessageDialog(null,"145. Programa que lea tres números e indique el tipo de triángulo que forman\n(isósceles, equilátero, escaleno). Comprobar que los números realmente formen un\ntriángulo, sino emitir el error.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		a = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el lado a"));
		b = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el lado b"));
		c = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el lado c"));
		
		if (a<=0 || b<=0 || c<=0){
			
			JOptionPane.showMessageDialog(null,"Los lados no forman ningún triángulo","Output",JOptionPane.ERROR_MESSAGE);
			
		}else if (a!=b && a!=c && b!=c){
			
			JOptionPane.showMessageDialog(null,"El triángulo es escaleno.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (a==b && a==c && b==c){
			
			JOptionPane.showMessageDialog(null,"El triángulo es equilátero.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (a==b || a==c || b==c){
			
			JOptionPane.showMessageDialog(null,"El triángulo es isósceles.","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
	
}
