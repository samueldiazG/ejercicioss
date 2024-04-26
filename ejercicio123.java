import javax.swing.JOptionPane;

public class ejercicio123 {
    public static void main(String[] abc){
		
		CapitalFinal();
		
	}

	public static void CapitalFinal(){
		
		float ca=0,in=0,di=0;
		
		JOptionPane.showMessageDialog(null,"123. Programa que calcula el capital final de un interés simple de forma diaria, de\nnacuerdo a los datos dados por el usuario(capital, interés y días). El resultado se\nmostrará en pantalla.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (ca<=0){ca = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el cápital"));}
		while (in<=0){in = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el interes (%)"));in=in/100;}
		while (di<=0){di = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad de días"));}
		
		JOptionPane.showMessageDialog(null,"El capital final es de "+InteresSimple(ca,in,di)+"$","Output",JOptionPane.INFORMATION_MESSAGE);
        
		
	}
	
}
