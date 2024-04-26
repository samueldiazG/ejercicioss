import javax.swing.JOptionPane;

public class ejercicio178 {
    public static void main(String[] abc){
		
		CostoLlamada();
		
	}

	public static void CostoLlamada(){
		
		int n = 0;
		float costo = 0;
		
		JOptionPane.showMessageDialog(null,"Dada la duración en minutos de una llamada, calcular el costo,\nconsiderando.\n● El costo de los primeros 3 minutos es de $3.00.\n● Después de tres minutos el costo por cada minuto será del 50% adicional\nal costo base de $3.\n● Después de 7 minutos, cada minuto adicional se cobrará al 100% del\ncosto base de $3 .","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		
		while (n<=0){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tiempo de duración de la llamada (min)"));}
		
		if (n<=3){
			
            costo = 3.0f;
			
        }else if (n<= 7){
			
            costo = 3.0f+(n-3)*3.0f*0.5f;
			
        }else{
			
            costo = 3.0f+4*3.0f*0.5f+(n-7)*3.0f;
			
        }
		
		JOptionPane.showMessageDialog(null,"El costo de la llamada es de "+costo+"$","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
