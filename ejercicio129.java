import javax.swing.JOptionPane;

public class ejercicio129 {
    public static void main(String[] abc){
		
		DiasCantidad();
		
	}

	public static void DiasCantidad(){
		
		int[] n=new int[3];
		int[][] condición= {{0,9999999},{0,12},{0,31}};
		String[] ti = {"año","mes","día"};
		String[] tiem = {"AAAA","MM","DD"};
		
		JOptionPane.showMessageDialog(null,"129. Programa que a partir del número del mes (1-12) y el año, indique el número\ntotal de días que corresponden a cada mes, el número de mes será indicado por el\nusuario.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
		
			while (n[i]<=condición[i][0] || n[i]>condición[i][1]){n[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el "+ti[i]+" ("+tiem[i]+")"));}
			
		}
		
		JOptionPane.showMessageDialog(null,"Hasta el momento del "+BigDate(n)+" han pasado "+(n[1]*30-(30-n[2]))+" días en el año","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
