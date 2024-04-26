import javax.swing.JOptionPane;

public class ejercicio104 {
    public static void main(String[] abc){
		
		Raizcualquiera();
		
	}

	public static void Raizcualquiera(){
		
		float x=0;
		
		JOptionPane.showMessageDialog(null,"104. Crear un programa que halle la raíz cuadrada de un número. Ejemplo el usuario\ndeberá indicar el número (por ejemplo y el índice de la raíz ( 3 por ejemplo para la\nraíz cúbica). NOTA. Hallar la raíz cúbica de 2 es lo mismo que elevar 2 a 1/3.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (x<=0){x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el radicando x para 2Raiz(x)"));}
		
		JOptionPane.showMessageDialog(null,"El programa sufrirá una pequeña pausa, esto es completamente normal","Output",JOptionPane.INFORMATION_MESSAGE);//horas/minima/tarifa/incremento

		JOptionPane.showMessageDialog(null,"2Raiz("+x+") = "+Redondear(Raiz(x,2.0f),4),"Output",JOptionPane.INFORMATION_MESSAGE);

		
	}

    private static String Redondear(Object raiz, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }

    private static Object Raiz(float x, float f) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Raiz'");
    }
	
}

