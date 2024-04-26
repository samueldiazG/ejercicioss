import javax.swing.JOptionPane;

public class ejercicio174 {
    public static void main(String[] args) {

		NombreSesion();
		
	}
 
	public static void NombreSesion() {
	    
		String a="",n="";
		String [] parts;
		Object opcion;
		Object [] Area = {"Seleccione","Administración","Gerencia","Contaduria","Asesoria"};
		String [] A = {"","administración","gerencia","contaduria","asesoria"};
		
		JOptionPane.showMessageDialog(null,"174. Programa que de acuerdo a el nombre real del usuario y el área o\ndepartamento de un empleado, genere un nombre de usuario para inicio de sesión,\ntomando como base el siguiente ejemplo : Administración , Juan Lopez Perez =\nadlzjuanpz","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
			
			a = JOptionPane.showInputDialog(null,"Digite su nombre y sus dos apellidos");
		
			parts = Separar(a,' ');
			
		}while(parts.length<3);
		
		do{

			opcion = JOptionPane.showInputDialog(null,"Seleccione su departamento", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Area, Area[0]);
			
		}while(opcion==Area[0]);
		
		n=""+A[GetPositionObject(opcion,Area)].charAt(0)+A[GetPositionObject(opcion,Area)].charAt(1)+(parts[1].charAt(0)+"").toLowerCase()+
		(parts[1].charAt(parts[1].length()-1)+"").toLowerCase()+parts[0].toLowerCase()+(parts[2].charAt(0)+"").toLowerCase()+
		(parts[2].charAt(parts[2].length()-1)+"").toLowerCase()+"";
		
		JOptionPane.showMessageDialog(null,"Su nombre de usuario es: "+n,"Ourput",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
