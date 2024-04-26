import javax.swing.JOptionPane;

public class ejercicio166 {
    public static void main(String[] abc){

		IndiceMasaCorporal();
		
	}

	public static void IndiceMasaCorporal() {
		
	    float h=0,m=0;
	    
	    JOptionPane.showMessageDialog(null,"166. Programa que determine el IMC (Índice de Masa Corporal) de una persona.\nIMC=kg / estMetros2 . Y determine :","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	    
	    while(m<=0){m = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite su peso (kg)"));}
		while(h<=0){h = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite estatura (m)"));}
	    
	    JOptionPane.showMessageDialog(null,"Su indice de pasa corporal es "+Redondear((m/(h*h)),4)+" kg/m^2","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static String Redondear(float f, int i) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }
	
}
