import javax.swing.JOptionPane;

public class ejercicio116 {
    public static void main(String[] abc){
		
		SecuenciaParesNonesMil();
		
	}

	public static void SecuenciaParesNonesMil(){
		
		String a="",n="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"116. Programa que sume los números enteros PARES comprendidos entre 1 y 1000,y\n que además multiplique los números enteros NONES entre 1 y 50.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=500; i++){
			
			if (i==500){ln=" = ";}else{ln=" + ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=(2*i)+""+ln+ln2;
			
		}
		
		for (int i=1; i<=25; i++){
			
			if (i==25){ln=" = ";}else{ln=" x ";}
			
			n+=(2*i-1)+""+ln;
			
		}
		
		JOptionPane.showMessageDialog(null,a+ParesSumatoria(500)+"\n\n"+n+ImparesMultiplicacion(25),"Output",JOptionPane.INFORMATION_MESSAGE);
	
	}
}
