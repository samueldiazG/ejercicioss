import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ejercicio167 {
    public static void main(String[] abc){
		
		HastaCeroV4Promedio();
		
	}

	public static void HastaCeroV4Promedio(){
		
		List<Float> n = new ArrayList<>();
		float bup=0;
		
		JOptionPane.showMessageDialog(null,"167. Programa que calcule el promedio de una lista de números positivos indicados\npor el usuario, para terminar debe teclear 0.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
			bup =-1;
			while(bup<0){bup = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));}
			n.add(bup);
			
		}while(n.get(n.size()-1)!=0);
		
		double[] ns = new double[n.size()-1];
		
		for (int i=0; i<ns.length; i++){
			
			ns[i] = n.get(i)*1.0d;
			
		}
		
		JOptionPane.showMessageDialog(null,"El promedio de los números es "+Promedio(ns),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
