import javax.swing.JOptionPane;

public class ejercicio169 {
    public static void main(String[] args) {
	
		Etapas();
		
	}

	public static void Etapas() {
	    
	    int n=0;
	    
		JOptionPane.showMessageDialog(null,"169. Hacer un programa donde de acuerdo al año de nacimiento de una persona,\nindique en qué etapa de su vida están, (niñez1-12, adolescencia13-18,\njuventud19-30, adultes31-60, vejez60-100). Solo edades entre 1 y 100 años.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
        
        while(n<=0 || n>100){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad"));}
    	
    	if (n>=1 && n<=12){

    	    JOptionPane.showMessageDialog(null,"Está en la niñez.","Output",JOptionPane.INFORMATION_MESSAGE);
			
    	}else if (n>=13 && n<=18){

    	    JOptionPane.showMessageDialog(null,"Está en la adolescencia.","Output",JOptionPane.INFORMATION_MESSAGE);
    	    
    	}else if (n>=19 && n<=30){
 
			JOptionPane.showMessageDialog(null,"Está en la juventud.","Output",JOptionPane.INFORMATION_MESSAGE);
			
    	}else if (n>=31 && n<=60){
 
    	    JOptionPane.showMessageDialog(null,"Está en la adultez.","Output",JOptionPane.INFORMATION_MESSAGE);
			
    	}else if (n>=61 && n<=100){
 
    	    JOptionPane.showMessageDialog(null,"Está en la vejez.","Output",JOptionPane.INFORMATION_MESSAGE);
			
    	}
		
	}
	
}
