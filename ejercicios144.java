import javax.swing.JOptionPane;

public class ejercicios144 {
    public static void main(String[] abc){
		
		SecuenciaParesMilV3();
		
	}

	public static void SecuenciaParesMilV3(){
		
		String a="",ln="",ln2="",a2="";
		
		JOptionPane.showMessageDialog(null,"143. Programa que realice la suma de los números pares comprendidos entre 1 y el\n100.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=50; i++){
			
			if (i==50){ln=" = ";}else{ln=" + ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=(2*i)+""+ln+ln2;
			
			if (i==50){ln=" = ";}else{ln=" x ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a2+=(2*i-1)+""+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a+ParesSumatoria(50)+"\n\n"+a2+ImparesMultiplicacion(50),"Output",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
}
