import javax.swing.JOptionPane;

public class ejercicio125 {
    public static void main(String[] abc){
		
		MultiplosDeCualquiera();
		
	}

	public static void MultiplosDeCualquiera(){
		
		String a="",ln="",ln2="";
		float n=-3001;
		
		JOptionPane.showMessageDialog(null,"125. Modificar el programa anterior para que el número múltiplo pueda ser leído\ndesde un dispositivo externo.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);

		while (n<-3000  || n>3000) {n= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un número cualquiera"));}

		for (int i=1; i<=(3000/n); i++){
			
			if (i==1000){ln="";}else{ln=", ";}
			if (i%50==0 && i!=0){ln2="\n";}else{ln2="";}
			
			a+=Multiplo(n,i)+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}

