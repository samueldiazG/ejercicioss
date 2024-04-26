import javax.swing.JOptionPane;

public class ejercicio150 {
    public static void main(String[] abc){
		
		GoldbachMasOMenos();
		
	}

	public static void GoldbachMasOMenos(){
		
		int n=0;
		boolean si=false;
		String a="";
		
		JOptionPane.showMessageDialog(null,"150. Realice un programa que calcule la descomposición en factores primos de un\nnúmero entero. Por ejemplo: 20 = 2*2*5.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
 
		while (n<=1){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo (>1)"));}
		a=n+" = ";	
		
        for (int i=1; i<=n; i++) {
			
            while (n%nPrimo(i)==0){
				
				a+=nPrimo(i)+" x ";
                n/=nPrimo(i);//La función nPrimo() se encuentra en la clase "FuncionaesNumericas"
				
            }
			
        }
		
		a=fu.DeleteChar(a,a.length()-1);//La función DeleteChar() se encuentra en la clase "FuncionesUtilidades"
		
		JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);
       
    }
	
}
