import javax.swing.JOptionPane;

public class ejercicio160 {
    public static void main(String[] abc){

		HminSegV3();
		
	}

	public static void HminSegV3(){
		
	    float n=0;
	    
	    JOptionPane.showMessageDialog(null,"160. Programa que dado un tiempo en segundos, calcula los días, horas y minutos\nque le corresponden.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	    
	    while(n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un tiempo (seg)"));}
	    
	    JOptionPane.showMessageDialog(null,n+" seg = "+Redondear((n/60),4)+" mim\n\n"+n+" seg = "+Redondear(((n/60)/60),4)+" h\n\n"+n+" seg = "+Redondear((((n/60)/60)/24),4)+" d","Output",JOptionPane.INFORMATION_MESSAGE);
		
	    
	}

    private static float Redondear(float f, int i) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }
	
}
