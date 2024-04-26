import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ejercicio122 {
    public static void main(String[] abc){
		
		SumatoriaInfinito();
		
	}

	public static void SumatoriaInfinito(){
		
		List<Double> ns = new ArrayList<>();
		String a="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"122. Modificar el programa anterior para que en lugar de leer 5 números, se puedan\nleer tantos números como el usuario quiera, hasta que se teclee un cero.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
			
			ns.add(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un número cualquiera"))*1.0d);
			
		}while(ns.get(ns.size()-1)!=0);
		
		double[] n=new double[ns.size()];
		
		for (int i=0; i<n.length; i++){
			
			n[i] = ns.get(i);
			
		}
		
		for (int i=0; i<n.length; i++){
			
			if (i==n.length-1){ln=" = ";}else{ln=" + ";}
			if (i%50==0 && i!=0){ln2="\n";}else{ln2="";}
			
			a+=n[i]+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a+Sumatoria(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	

}
