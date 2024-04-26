import javax.swing.JOptionPane;

public class ejercicio142 {
    public static void main(String[] abc){
		
		XALaYV2();
		
	}

	public static void XALaYV2(){
		
		float x=0;
		float y=0;
		double h;
		
		JOptionPane.showMessageDialog(null,"142. Programa para elevar un número N a la potencia X, ambos datos serán\notorgados por el usuario.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		x = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la base"));
		y = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el exponente"));
		
		JOptionPane.showMessageDialog(null,"El programa sufrirá una pequeña pausa, esto es completamente normal","Output",JOptionPane.INFORMATION_MESSAGE);//horas/minima/tarifa/incremento
		
		h=TaylorPotencia(x,y);//La función TaylorPotencia() se encuentra en la clase "FuncionaesNumericas"
		
		if (Double.isNaN(h)==true){
			
			JOptionPane.showMessageDialog(null,x+"^"+y+" = "+h,"Error",JOptionPane.ERROR_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,x+"^"+y+" = "+Redondear(h,7),"Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
	
}
