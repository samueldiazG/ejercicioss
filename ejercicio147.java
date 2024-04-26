import javax.swing.JOptionPane;

public class ejercicio147 {
    public static void main(String[] abc){
		
		CincoEstudiantesExamen();
		
	}

	public static void CincoEstudiantesExamen(){
		
		int es=0,au=0,ue=0;
		float ta=0;
		
		JOptionPane.showMessageDialog(null,"147. En una clase de 5 alumnos se han realizado tres exámenes y se requiere\ndeterminar el número de:\na) Alumnos que aprobaron todos los exámenes\nb) Alumnos que aprobaron al menos un examen\nc) Alumnos que aprobaron únicamente el último examen.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (es<=1){es = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de examenes realizados por los estudiantes (>=2)"));}
		
		float[][] n= new float[5][es];
		
		for (int f=0; f<n.length; f++){
			
			for (int c=0; c<n[f].length; c++){
				
				n[f][c]=-1;
				while (n[f][c]<0 || n[f][c]>5){n[f][c] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la nota (0-5) del examen N°"+(c+1)+" del estudiante N°"+(f+1)+""));}
				
			}
			
		}
		
		for (int f=0; f<n.length; f++){
			
			for (int c=0; c<n[f].length; c++){
				
				if (n[f][c]>=3){ta+=1.0f/n[f].length;}
				
			}
			
		}
		
		int[] parts = Partir(""+ta);
		
		for (int f=0; f<n.length; f++){
			
			for (int c=0; c<n[f].length; c++){
				
				if (n[f][c]>=3){au+=1;break;}
				
			}
			
		}
		
		for (int f=0; f<n.length; f++){
			
			for (int c=0; c<n[f].length; c++){
				
				if (n[f][c]>=3 && c!=n[f].length-1){break;}
				if (n[f][c]>=3 && c==n[f].length-1){ue+=1;}
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null,"Alumnos que aprobaron todos los exámenes: "+parts[0]+"/"+n.length+"\nAlumnos que aprobaron al menos un examen: "+au+"/"+n.length+"\nAlumnos que aprobaron únicamente el último examen: "+ue+"/"+n.length,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static int[] Partir(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Partir'");
    }
	
}
