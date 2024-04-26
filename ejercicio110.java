import javax.swing.JOptionPane;

public class ejercicio110 {
    public static void main(String[] args){
		
		TemperaturaFriaONo();
		
	}

	public static void TemperaturaFriaONo(){
		
		float n=-1;
		
		JOptionPane.showMessageDialog(null,"110. Programa que escriba en pantalla un comentario con respecto a la temperatura\ndel día. Tomando en cuenta que Mucho Frío ( 0 -10) , Frío (11-18)\n, Templado (19-25), Calor(26-40).","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		while (n<0 || n>40){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite una temperatura (°C)"));}
		
		if (n>=0 && n<=10){
			
			JOptionPane.showMessageDialog(null,"Mucho frío","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (n>10 && n<=18){
			
			JOptionPane.showMessageDialog(null,"Frío","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (n>18 && n<=25){
			
			JOptionPane.showMessageDialog(null,"Templado","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (n>25 && n<=40){
			
			JOptionPane.showMessageDialog(null,"Caluroso","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}

}

