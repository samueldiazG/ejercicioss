import javax.swing.JOptionPane;

public class ejercicio113 {
    public static void main(String[] abc){
		
		Monterrey();
		
	}

	public static void Monterrey(){
		
		
		Object opcion;
		Object [] Transporte = {"Seleccione","Motocicleta","Automóvil","Pickup"};
		
		float n=-1;
		
		JOptionPane.showMessageDialog(null,"113. Programa que calcule el costo estimado de gasolina para viajar a la ciudad de\nMonterrey (distancia=500km) para uno de los 3 transportes siguientes a elegir:\n1) Motocicleta\n2) Automóvil\n3) Pickup\nTomando en cuenta que cada vehículo tiene un rendimiento de :\nMotocicleta=20km/lt , Auto=10km/lt , Pickup=5km/lt .\nComo resultado debe mostrar el gasto total de gasolina.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{

			opcion = JOptionPane.showInputDialog(null,"¿Qué transporte desea tomar para ir a Monterrey?", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Transporte, Transporte[0]);
			
		}while(opcion==Transporte[0]);
		
		if (opcion==Transporte[1]){
			
			JOptionPane.showMessageDialog(null,"Una motocicleta consumiría "+(500/20)+" l de gasolina","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (opcion==Transporte[2]){
			
			JOptionPane.showMessageDialog(null,"Un automóvil consumiría "+(500/10)+" l de gasolina","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else if (opcion==Transporte[3]){
			
			JOptionPane.showMessageDialog(null,"Una pickup consumiría "+(500/5)+" l de gasolina","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
}
