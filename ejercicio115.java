import javax.swing.JOptionPane;

public class ejercicio115 {
    public static void main(String[] abc){
		
		SecuenciaParesMil();
		
	}

	public static void SecuenciaParesMil(){
		
		String a="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"115. Programa que sume los números enteros PARES comprendidos entre 1 y 1000.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=500; i++){
			
			if (i==500){ln=" = ";}else{ln=" + ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=(2*i)+""+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a+ParesSumatoria(500),"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}
