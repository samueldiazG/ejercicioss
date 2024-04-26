import javax.swing.JOptionPane;

public class ejercicio165 {
    public static void main(String[] abc){

		HminSegV4();
		
	}

	public static void HminSegV4() {
		
	    float mim=0,seg=0,h=0;
	    
	    JOptionPane.showMessageDialog(null,"93. Desarrolle el código fuente de un tiempo ingresado en minutos, visualizarlo por\npantalla en horas, minutos y segundos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	    
		while(seg<=0){seg = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un tiempo (seg)"));}
	    while(mim<=0){mim = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un tiempo (min)"));}
		while(h<=0){h = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un tiempo (h)"));}
	    
	    JOptionPane.showMessageDialog(null,seg+" seg = "+seg+" seg\n\n"+mim+" min = "+Redondear((mim*60),4)+" seg\n\n"+h+" h = "+Redondear((h*60*60),4)+" seg","Output",JOptionPane.INFORMATION_MESSAGE);
		
	    
	}
	
}
