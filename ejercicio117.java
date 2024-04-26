import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ejercicio117 {
    public static void main(String[] abc){
		
		HastaCeroV3();
		
	}

	public static void HastaCeroV3(){
		
		List<Float> n = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null,"117. Escribir un programa que lea números indefinidamente hasta que llegue el\nnúmero 0, y antes de finalizar indique la cantidad de números leídos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
			
			n.add(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un número cualquiera")));
			
		}while(n.get(n.size()-1)!=0);
		
		JOptionPane.showMessageDialog(null,"Usted a ingresado "+n.size()+" números","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}

