import javax.swing.JOptionPane;

public class ejercicio156 {
    public static void main(String[] abc){
		
		CadenaIgualdad();
		
	}

	public static void CadenaIgualdad(){
		
		String[] a = new String[2];
		
		JOptionPane.showMessageDialog(null,"156. Convertir dos cadenas de minúsculas a MAYÚSCULAS. Compararlas, y decir si\nson iguales o no.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<a.length; i++){
		
			a[i] = JOptionPane.showInputDialog(null,"Digite lo que sea en minúsculas");
			a[i] = a[i].toUpperCase();
			
		}
		
		for (int i=1; i<a.length; i++){
			
			if (a[i].equals(a[i-1])==true){
				
				JOptionPane.showMessageDialog(null,"Las cadenas son iguales","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}else{
				
				JOptionPane.showMessageDialog(null,"Las cadenas no son iguales","Output",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
	}
	
}
