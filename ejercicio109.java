import javax.swing.JOptionPane;

public class ejercicio109 {
    public static void main(String[] args){
		
		DescuentoV3();
		
	}

	public static void DescuentoV3(){
		
		float n=0,d=0;
		
		JOptionPane.showMessageDialog(null,"109. Programa que aplique un descuento de 10% sobre el monto de una venta (dado\npor el usuario), sólo si ésta es mayor a 1000 pesos. Mostrar el monto neto de la\nventa.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el monto"));}
		
		d=n;
		
		if (n>1000){
			
			d=n-(n*0.1f);
			
		}

		JOptionPane.showMessageDialog(null,"El monto neto es "+d+"$","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}

