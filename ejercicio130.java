import javax.swing.JOptionPane;

public class ejercicio130 {
    public static void main(String[] abc){
		
		MensualidadPrestamo();
		
	}

	public static void MensualidadPrestamo(){
		
		float ca=0;
		
		JOptionPane.showMessageDialog(null,"130. Programa que calcule el monto total a pagar por mes, si el monto será pagado\nen un plazo de 12 ó 24 meses, tomando en cuenta que por cada mes se aplica un\n2% de interés sobre el saldo. Adicionalmente mostrar el total a pagar.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (ca<=0){ca = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el prestamo"));}
		
		JOptionPane.showMessageDialog(null,"La cuota mensual es de "+(InteresSimple(ca,0.02f,24*30)/24)+"$","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static int InteresSimple(float ca, float f, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'InteresSimple'");
    }
	
}
