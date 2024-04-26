import javax.swing.JOptionPane;

public class ejercicio121 {
    public static void main(String[] abc){
		
		SumatoriaCinco();
		
	}

	public static void SumatoriaCinco(){
		
		double[] n=new double[5];
		
		String a="",ln="";
		
		JOptionPane.showMessageDialog(null,"121. Programa que pida 5 números al usuario y muestre en pantalla la suma total de\ntodos ellos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite cualquier número"));
			
		}
		
		for (int i=0; i<n.length; i++){
			
			if (i==n.length-1){ln=" = ";}else{ln=" + ";}
			
			a+=n[i]+ln;
			
		}
		
		JOptionPane.showMessageDialog(null,a+Sumatoria(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
