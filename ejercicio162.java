import javax.swing.JOptionPane;

public class ejercicio162 {
    public static void main(String[] abc){
		
		TablaMultiplicarV3();
		
	}

	public static void TablaMultiplicarV3(){
		
		int n=0;
		
		JOptionPane.showMessageDialog(null,"162. Realizar un programa que muestre por pantalla la tabla de multiplicar de\ncualquier número positivo menor a 10.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<1 || n>10){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número natural entre 1 y 10 para visualizar su tabla"));}
		
		JOptionPane.showMessageDialog(null,Tabla(n,1,10),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static Object Tabla(int n, int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'Tabla'");
    }
	
}
