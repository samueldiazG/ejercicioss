import javax.swing.JOptionPane;

public class ejercicio148 {
    public static void main(String[] abc){
		
		DatosEstadisticos();
		
	}

	public static void DatosEstadisticos(){
		
		int es=0,au=0,ue=0;
		float ta=0;
		
		JOptionPane.showMessageDialog(null,"148. Realice un programa que permita la lectura de los datos y el cálculo de las\nestadísticas.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (es<=1){es = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de datos númericos a ingresar"));}
		
		float[] n= new float[es];
		double[] bup= new double[es];
		
		for (int f=0; f<n.length; f++){
			
			n[f] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el dato N°"+(f+1)));
			bup[f]= n[f]*1.0d;
		}
		
		n=Ordenar(n);
		
		JOptionPane.showMessageDialog(null,"Número total de datos: "+n.length+"\nDato mayor: "+n[0]+"\nDato menor: "+n[n.length-1]+"\nPromedio: "+Promedio(bup)+"\nMediana: "+Mediana(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
}
}