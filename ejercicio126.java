import javax.swing.JOptionPane;

public class ejercicio126 {
    	public static void main(String[] abc){
		
		FechaDate();
		
	}

	public static void FechaDate(){
		
		int[] n=new int[3];
		int[][] condición= {{0,9999999},{0,12},{0,31}};
		String[] ti = {"año","mes","día"};
		String[] tiem = {"AAAA","MM","DD"};
		
		JOptionPane.showMessageDialog(null,"126. Programa que de acuerdo a la fecha dada por el usuario en formato AAAA MM\nDD y la muestre en formato texto. Ejemplo: 2012 01 23 deberá ser mostrado como:\n23 Enero de 2012.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
		
			while (n[i]<=condición[i][0] || n[i]>condición[i][1]){n[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el "+ti[i]+" ("+tiem[i]+")"));}
			
		}
		
		JOptionPane.showMessageDialog(null,BigDate(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}

