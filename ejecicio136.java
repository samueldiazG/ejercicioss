import javax.swing.JOptionPane;

public class ejecicio136 {
    public static void main(String[] abc){
		
		Reloj();
		
	}

	public static void Reloj(){
		
		JOptionPane.showMessageDialog(null,"136. Programa que simule en pantalla, el funcionamiento de un reloj digital , con el\nformato Horas:Minutos:segundos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for(int h=0; h<=24; h++){
		
			for (int m=0; m<=59; m++){
				
				for (int s=0; s<=59; s++){
					
					System.out.print("\r"+h+":"+m+":"+s);
					try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
					
				}
			}
		}
		
	}
	
}
