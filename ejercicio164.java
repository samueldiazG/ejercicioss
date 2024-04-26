import javax.swing.JOptionPane;

public class ejercicio164 {
    public static void main(String[] abc){
		
		OperacionesV3();
		
	}
	
	public static void OperacionesV3(){
		
		double[] n= new double[2];
		String[] a= {"un","otro"};
		
		JOptionPane.showMessageDialog(null,"163. Algoritmo que de acuerdo a 2 números ingresados (AyB), muestra el resultado\nde la suma, resta, multiplicación, división y residuo entre ambos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for(int i=0; i<n.length; i++){
		
			n[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite "+a[i]+" número cualquiera"));
			
		}
	
		JOptionPane.showMessageDialog(null,n[0]+" + "+n[1]+" = "+Redondear(Sumatoria(n),4)+"\n\n"+n[0]+" - "+n[1]+" = "+Redondear(Resta(n),4)+"\n\n"+n[0]+" x "+n[1]+" = "+Redondear(Multiplicacion(n),4)+"\n\n"+n[0]+"/"+n[1]+" = "+Redondear((n[0]/n[1]),4)+"\n\n"+n[0]+" % "+n[1]+" = "+Redondear((n[0]%n[1]),4)+"","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static double Redondear(Object sumatoria, int i) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }

    private static Object Sumatoria(double[] n) {
    
        throw new UnsupportedOperationException("Unimplemented method 'Sumatoria'");
    }
}
