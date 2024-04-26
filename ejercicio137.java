import javax.swing.JOptionPane;

public class ejercicio137 {
    public static void main(String[] abc){
		
		FormulaGeneral();
		
	}

	public static void FormulaGeneral(){
		
		float a=0,b=0,c=0;
		
		JOptionPane.showMessageDialog(null,"137. Dada la fórmula: obtener\nel resultado de x, los valores de a, b y c serán tecleados por el usuario.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (a==0){a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a para 0 = ax^2 + bx + c"));}
		b = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite b para 0 = "+a+"x^2 + bx + c"));
		c = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite c para 0 = "+a+"x^2 + "+b+"x + c"));
		
		JOptionPane.showMessageDialog(null,"El programa sufrirá una pequeña pausa, esto es completamente normal","Output",JOptionPane.INFORMATION_MESSAGE);//horas/minima/tarifa/incremento

		double[] x = Bhaskara(a,b,c);
		
		JOptionPane.showMessageDialog(null,a+"x^2 + "+b+"x + "+c+" = 0\n\nx1 = "+Redondear(x[0],4)+"\nx2="+Redondear(x[1],4),"Output",JOptionPane.INFORMATION_MESSAGE);//horas/minima/tarifa/incremento
		
	}
	
}

