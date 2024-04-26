import javax.swing.JOptionPane;

public class ejercicio131 {
    public static void main(String[] abc){
		
		SalarioNominas();
		
	}

	public static void SalarioNominas(){
		
		float m=0;
		int h=0;
		
		JOptionPane.showMessageDialog(null,"131. Programa que calcule la nómina de los trabajadores de una empresa a los\ncuales se les paga por hora de acuerdo a una tarifa, ambos datos capturados por\nteclado, tomando en cuenta que las horas excedentes a 40 serán pagadas al doble\n(horas extra).","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (h<=0){h = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite las horas trabajadas de los trabajadores"));}
		while (m<=0){m = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la tarifa de pago por hora"));}
	
		JOptionPane.showMessageDialog(null,"La de cada trabajador es de "+Sueldo(h,40,m,1.0f)+"$","Output",JOptionPane.INFORMATION_MESSAGE);//horas/minima/tarifa/incremento
		
	}

    private static String Sueldo(int h, int i, float m, float f) {
        throw new UnsupportedOperationException("Unimplemented method 'Sueldo'");
    }
	
}
