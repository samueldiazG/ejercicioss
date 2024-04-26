import javax.swing.JOptionPane;

public class ejercicio171 {
    public static void main(String[] args) {

		MenuConversiones();
		
	}
 
	public static void MenuConversiones() {
	    
		Object opcion;
		Object [] Operacion = {"Seleccione","Libras a kilogramos","Millas a kilómetros","Galones a litros","Farenheit a centígrados","Salir"};
		
		float n=0;
		
		JOptionPane.showMessageDialog(null,"171. Programa que permita la conversión de unidades (peso, distancia, temperatura)\nmostrando un menú para el usuario como el siguiente:\n● 1 – Libras a kilogramos\n● 2 – Millas a kilómetros\n● 3 – Galones a litros\n● 4 – Farenheit a centígrados\n● 5 - Salir","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
		
			do{

				opcion = JOptionPane.showInputDialog(null,"¿Qué desea calcular?", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Operacion, Operacion[0]);
				
			}while(opcion==Operacion[0]);
		
			if (opcion==Operacion[1]){
				
				while (n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite las libras a convertir"));}
				
				JOptionPane.showMessageDialog(null,n+" lb = "+(n/2)+" kg","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
				
				n=0;
				
			}else if (opcion==Operacion[2]){
				
				while (n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite las millas marinas a convertir"));}
				
				JOptionPane.showMessageDialog(null,n+" mi = "+(n*1.6f)+" kg","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
				
				n=0;
				
			}else if (opcion==Operacion[3]){
				
				while (n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite los galones a convertir"));}
				
				JOptionPane.showMessageDialog(null,n+" gal = "+(n*3.785)+" l","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
				
				n=0;
				
			}else if (opcion==Operacion[4]){
				
				n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite los grados Farenheit a convertir"));
				
				JOptionPane.showMessageDialog(null,n+"°F = "+((n-32f)*(5f/9f))+"°C","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
				
				n=0;
				
			}
			
		}while(opcion!=Operacion[Operacion.length-1]);
		
	}
}
