import javax.swing.JOptionPane;

public class ejercicio114 {
    public static void main(String[] abc){
		
		SecuenciaMil();
		
	}

	public static void SecuenciaMil(){
		
		String a="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"114. Programa que muestre en pantalla todos los números comprendidos entre 1 y 1000.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=1000; i++){
			
			if (i==1000){ln="";}else{ln=", ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=i+""+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
}
