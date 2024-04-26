import javax.swing.JOptionPane;

public class ejercico179 {
    public static void main(String[] abc){
		
		Notas3Materias();
		
	}

	public static void Notas3Materias(){
		
		double[] n = new double[3];
		float[] bup = new float[n.length];
		String[] m = {"Matemáticas","Inglés","Español"};
		int co=0,indice=0;
		
		JOptionPane.showMessageDialog(null,"179. Pedir 3 calificaciones de un alumno (matemáticas, inglés y español).\n● Mostrar el promedio.\n● El total de materias aprobadas, el total de materias reprobadas.\n● Mostrar el nombre de la materia con menor calificación.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
			
			n[i]=0;
			while (n[i]<=0 || n[i]>5){n[i] = Redondear(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota de "+m[i]+" (1-5)")),4);}
			if (n[i]>=3){co++;}
			bup[i] = Float.parseFloat(n[i]+"");
		}
		
		bup = Ordenar(bup);
		
		for (int i=0; i<n.length; i++){
			
			if (bup[bup.length-1]==n[i]){
				
				indice = i;
				break;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null,"Promedio de notas: "+Redondear(Promedio(n),4)+"\nMaterias aprovadas: "+co+"\nMaterias reprovadas: "+(n.length-co)+"\nMateria con menor calificación: "+m[indice],"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static double Redondear(Object object, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'Redondear'");
    }

    private static Object Promedio(double[] n) {
        throw new UnsupportedOperationException("Unimplemented method 'Promedio'");
    }

    private static float[] Ordenar(float[] bup) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Ordenar'");
    }

}
