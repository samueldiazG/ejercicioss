import javax.swing.JOptionPane;

public class ejercicio152 {
    public static void main(String[] abc){
		
		CadenaBackUp();
		
	}

	public static void CadenaBackUp(){
		
		String[] a = new String[1];
		
		JOptionPane.showMessageDialog(null,"152. Pedir al usuario una cadena de caracteres, almacenarla en un arreglo y copiar\ntodo su contenido hacia otro arreglo de caracteres.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<a.length; i++){
		
			a[i] = JOptionPane.showInputDialog(null,"Digite lo que sea");
			
		}
		
		String[] bup = a;
	
		for (int i=0; i<bup.length; i++){
			
			JOptionPane.showMessageDialog(null,bup[i],"Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
}
