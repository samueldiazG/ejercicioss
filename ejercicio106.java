import javax.swing.JOptionPane;

public class ejercicio106 {
    public class MaximoComunDivisor_106toEjercicio extends FuncionaesNumericas{
	
	public static void main(String[] args){
		
		MaximoComunDivisor();
		
	}

	public static void MaximoComunDivisor(){
		
		int[] n= new int[2];
		
		JOptionPane.showMessageDialog(null,"106. Crear un programa que encuentre el máximo común divisor de dos números\nusando el algoritmo de Euclides : Dado dos números enteros positivos m y n, tal\nque m > n, para encontrar su máximo común divisor, es decir, el mayor entero\npositivo que divide a ambos: - Dividir m por n para obtener el resto r (0 = r < n) ;\n- Si r = 0, el MCD es n.; - Si no, el máximo común divisor es MCD(n,r).","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i]=0;
			
			while (n[i]<=0){n[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite dos números enteros mayores a cero"));}
			
		}
		
		JOptionPane.showMessageDialog(null,"El máximo común divisor de los dos números es "+MCD(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
}
