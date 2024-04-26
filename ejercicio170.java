import javax.swing.JOptionPane;

public class ejercicio170 {
    public static void main(String[] abc){

		SumaDeFracciones();
		
	}

	public static void SumaDeFracciones() {
		
	    float n=0,d=0;
		double[] ns = new double[2];
		String a="",a2="",ln="";
	    
	    JOptionPane.showMessageDialog(null,"170. Programa que realice la suma y resta de 2 fracciones, el numerador y\ndenominador de cada una serán capturados por el usuario. Ambas fracciones\ndeberán tener el mismo denominador. Ejemplo 2/6 + 8/6 = ¿?.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	    
		for (int i=0; i<ns.length; i++){
		
			if (i==0){while (n==0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el denominador de las fracciones"));}}
			d = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite d para d/"+n+" de la fracción N°"+(i+1)));
			
			ns[i]=d/n*1.0d;
			
			if (i==ns.length-1){ln=" = ";}else{ln=" + ";}
			a+=d+"/"+n+ln;
			
			if (i==ns.length-1){ln=" = ";}else{ln=" - ";}
			a2+=d+"/"+n+ln;
			
		}
	    
	    JOptionPane.showMessageDialog(null,a+Redondear(Sumatoria(ns),4)+"\n\n"+a2+Redondear(Resta(ns),4),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
