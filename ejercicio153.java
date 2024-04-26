import javax.swing.JOptionPane;

public class ejercicio153 {
    public static void main(String[] abc){
		
		CadenaLongitudV2();
		
	}

	public static void CadenaLongitudV2(){
		
		String[] a = new String[2];
		
		JOptionPane.showMessageDialog(null,"153. Pedir al usuario que digite 2 cadenas de caracteres, e indicar si ambas cadenas\nson iguales, en caso de no serlo, indicar cuál es mayor alfabéticamente.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<a.length; i++){
		
			a[i] = JOptionPane.showInputDialog(null,"Digite lo que sea");
			
		}
		
		for (int i=1; i<a.length; i++){
			
			if (a[i].length()==a[i-1].length()){
				
				JOptionPane.showMessageDialog(null,"El tamaño de las cadenas son iguales","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}else if (a[i].length()<a[i-1].length()){
				
				JOptionPane.showMessageDialog(null,"La primera cadena es más grande","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}else{
				
				JOptionPane.showMessageDialog(null,"La segunda cadena es más grande","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
	}
	
}
