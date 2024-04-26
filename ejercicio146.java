import javax.swing.JOptionPane;

public class ejercicio146 {
    public static void main(String[] abc){
		
		SerieFibonacciV2();
		
	}

	public static void SerieFibonacciV2(){
		
		int n=0;
		String a="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"146. Programa que muestre la serie Fibonacci de un número límite indicado por\nteclado","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite hasta que indice n queiere ver la sucesión Fibonacci"));}
		
		for (int i=1; i<=n; i++){
			
			if (i==n){ln="";}else{ln=", ";}
			if (i%25==0){ln2="\n";}else{ln2="";}
			a+=Fibonacci(i)+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static String Fibonacci(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'Fibonacci'");
    }
	
}
