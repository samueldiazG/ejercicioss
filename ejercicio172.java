import javax.swing.JOptionPane;

public class ejercicio172 {
    public static void main(String[] abc){
		
		FechaPeriodo();
		
	}

	public static void FechaPeriodo(){
		
		int[] n=new int[2];
		int[][] condición= {{1,12},{0,9999999}};
		String[] ti = {"mes","año"};
		String[] tiem = {"MM","AAAA"};
		String a ="";
		
		JOptionPane.showMessageDialog(null,"172. Programa que muestre los 12 periodos(meses), anteriores de acuerdo al\nperiodo indicado por el usuario en formato MM AAAA. Ejemplo : 10-2011 = 09-2011\n, 08-2011, 07-2011 , 06-2011, 05-2011 , 04-2011 , 03-2011 , 02-2011 , 01-2011 ,\n12-2010 , 11-2010, 10-2010 .","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
		
			while (n[i]<=condición[i][0] || n[i]>condición[i][1]){n[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el "+ti[i]+" ("+tiem[i]+")"));}
			
		}
		
		for (int i=n[0]-2; i>=0; i--){
			
			a+=PeriodDate(i,n[1])+"\n";
			
		}
		
		JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
