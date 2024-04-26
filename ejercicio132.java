import javax.swing.JOptionPane;

public class ejercicio132 {
    public static void main(String[] abc){
		
		CajeroAutomatico();
		
	}

	public static void CajeroAutomatico(){
		
		Object opcion;
		Object [] Accion = {"Seleccione","Deposito","Retiro","Salir"};
		float s=1000;
		float wd=-1;
		float dep=-1;
		
		JOptionPane.showMessageDialog(null,"132. Programa que simula un cajero automático con un saldo inicial de $1000 y que\npida al usuario elegir entre las opciones 1.-Depósito 2.Retiro 3.Salir . En cada\ndepósito y en cada retiro se pedirá la cantidad a retirar ó a depositar. Al elegir salir,\nel programa mostrará el saldo final en pantalla.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
		
			do{

				opcion = JOptionPane.showInputDialog(null,"¿Qué ación desea hacer?", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Accion, Accion[0]);
				
			}while(opcion==Accion[0]);
			
			if (opcion==Accion[1]){
				
				while (dep<0){dep = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad a depositar"));}
				s+=dep;
				JOptionPane.showMessageDialog(null,"Nuevo saldo es "+s+"$","Output",JOptionPane.INFORMATION_MESSAGE);
				dep=-1;
				
			}else if (opcion==Accion[2]){
				
				while (wd<0 || wd>s){
					
					wd = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad a retirar"));
					
					if (wd>s){
						
						JOptionPane.showMessageDialog(null,"No puede retirar más de su saldo actual ("+s+"$)","Output",JOptionPane.INFORMATION_MESSAGE);
						
					}
					
				}
				
				s-=wd;
				JOptionPane.showMessageDialog(null,"Nuevo saldo es "+s+"$","Output",JOptionPane.INFORMATION_MESSAGE);
				wd=-1;
			}
			
		}while (opcion!=Accion[3]);
		
	}
	
}

