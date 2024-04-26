import javax.swing.JOptionPane;

public class ejercicio105 {
    public static void main(String[] abc){
		
		NotasV2();
		
	}

	public static void NotasV2(){
		
		double[] n= new double[4];
		
		JOptionPane.showMessageDialog(null,"105. Desarrolle el código fuente de un programa que permita ingresar cuatro notas\nsobre 20 con decimales, obtener su promedio y visualizar “APROBADO”, si su\npromedio es mayor a 14.5; caso contrario su promedio sea menor a 14.5 y mayor a\n10 visualizará “SUPLETORIO”. Si la nota promedio es menor a 10 mostrará\n“PERDIDO EL AÑO”.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i]=-1;
			
			while (n[i]<0 || n[i]>20){n[i] = Redondear(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la nota N°"+(i+1)+" (0-20) ")),4);}
			
		}
		
		if (Redondear(Promedio(n),1)>=14.5){
		
			JOptionPane.showMessageDialog(null,"APROBADO","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (Redondear(Promedio(n),1)<14.5 && Redondear(Promedio(n),1)>=10){
			
			JOptionPane.showMessageDialog(null,"SUPLETORIO","Output",JOptionPane.ERROR_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"AÑO PERDIDO","Output",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

}

