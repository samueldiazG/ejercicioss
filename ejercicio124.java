import javax.swing.JOptionPane;

public class ejercicio124 {
    public static void main(String[] abc){
		
		MultiplosDe();
		
	}

	public static void MultiplosDe(){
		
		String a="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"124. Escribir un programa que muestre en pantalla todos los múltiplos de 3 de los\nnúmeros comprendidos del 1 al 3000.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);

		for (int i=1; i<=1000; i++){
			
			if (i==1000){ln="";}else{ln=", ";}
			if (i%50==0 && i!=0){ln2="\n";}else{ln2="";}
			
			a+=Multiplo(3,i)+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
}
