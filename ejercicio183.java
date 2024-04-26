import javax.swing.JOptionPane;

public class ejercicio183 {
    public static void main(String[] abc){
		
		Aburrido();
		
	}

	public static void Aburrido(){
		
		String wd = "";
		
		JOptionPane.showMessageDialog(null,"183. Crear un programa que permita almacenar el nombre completo de una persona\nen un Arreglo y que muestre en pantalla el total de vocales y cuantas veces se\nrepite cada vocal en el nombre del dinosaurio.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{wd = JOptionPane.showInputDialog(null,"Digite su nombre");}while(FuncionaesNumericas.Allowed(wd)==true);
		
		JOptionPane.showMessageDialog(null,"El nombre tiene "+Vocales(wd)+" vocales y son: "+OrdenarVocales(wd),"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}

