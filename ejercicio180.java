import javax.swing.JOptionPane;

public class ejercicio180 {
    public static void main(String[] abc){
		
		Fiesta();
		
	}

	public static void Fiesta(){
		
		int n=0,op=0,h=0,m=0;
		
		JOptionPane.showMessageDialog(null,"180. ¿A una fiesta asistieron personas de diferentes edades y sexos. Construir un\nalgoritmo dadas las edades y sexos de las personas? Calcular :\n● Cuántas personas asistieron a la fiesta .\n● Cuántos hombres y cuántas mujeres.\n● Promedio de edades por sexo.\n● La edad de la persona más joven que asistió\n● No se permiten menores de edad a la fiesta.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	
		while (n<=1){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de personas que asistieron a la fiesta"));}

		double[] edad = new double[n];
		int[] bup = new int[n];
		int[] parts;
		double[] hombre;
		double[] mujer;
		double ph = 0;
		double pm = 0;
		
		String[] genero = {"Hombre","Mujer"};
		
		m=edad.length-1;
		
		for (int i=0; i<edad.length; i++){
			
			op = JOptionPane.showOptionDialog(null,"¿Qué genero tiene la persona N°"+(i+1)+"?", "Seleccionar",JOptionPane.DEFAULT_OPTION,3,null,genero, genero[0]);
			
			if (op==0){
			
				edad[h]=0;
				while (edad[h]<18){edad[h] = Redondear(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la edad de la persona  N°"+(i+1)+" (Mayor igual a 18)")),1);}
				
				parts = Partir(edad[h]+"");
				bup[h] =parts[0];
				
				h++;
				
			}else{
				
				edad[m]=0;
				while (edad[m]<18){edad[m] = Redondear(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la edad de la persona  N°"+(i+1)+" (Mayor igual a 18)")),1);}
				
				parts = Partir(edad[m]+"");
				bup[m] = parts[0];
				
				m--;
				
			}
			
		}
		
		if (m!=edad.length-1){
			
			hombre = new double[h];
			
			for (int i=0; i<h; i++){
			
				hombre[i]=edad[i];
				
			}
			
			ph = Redondear(Promedio(hombre),4);
			
		}
		
		if (h!=edad.length){
			
			mujer = new double[edad.length-h];
		
			for (int i=h; i<edad.length; i++){
			
				mujer[i-h]=edad[i];
				
			}
			
			pm = Redondear(Promedio(mujer),4);
			
		}	
		
		JOptionPane.showMessageDialog(null,"Personas asistidas: "+n+"\nHombres asistidos: "+h+"\nMujeres asistidas: "+(edad.length-h)+"\nPromedio de edades de hombres: "+ph+"\nPromedio de edades de mujeres: "+pm+"\nPersona con la menor edad es de: "+Menor(bup),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static double Redondear(Object promedio, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }

    private static Object Promedio(double[] mujer) {
        throw new UnsupportedOperationException("Unimplemented method 'Promedio'");
    }

}
