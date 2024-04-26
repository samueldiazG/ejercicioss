import javax.swing.JOptionPane;

public class ejercicio140 {
    public static void main(String[] args) {

		MenuOperacioness();
		
	}
 
	public static void MenuOperacioness() {
	    
		Object opcion;
		Object [] Operacion = {"Seleccione","Sumatoria","Factorial","Salir"};
		
		int n=-1;
		String a="",ln="",ln2="";
		
		JOptionPane.showMessageDialog(null,"140. Crear un programa que muestre un menú como este:\n○ 1) Salir\n○ 2) Sumatoria\n○ 3) Factorial\nTras mostrar el menú, el programa debe leer un número del 1 al tres si se\nelige 1, el programa acaba. Si se elige 2 se calcula la sumatoria del\nnúmero (ej: 5 = 1+2+3+4+5), si se elige 3 se calcula el factorial (en ambos\ncasos el programa pedirá escribir el número sobre el que se calcula el\nsumatorio o el factorial). Tras calcular el sumatorio o el factorial e indicar\nel resultado, el programa volverá a mostrar el menú y así sucesivamente.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{
		
			do{

				opcion = JOptionPane.showInputDialog(null,"¿Qué desea calcular?", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Operacion, Operacion[0]);
				
			}while(opcion==Operacion[0]);
		
			if (opcion==Operacion[1]){
				
				while (n<=0){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el fin de la sumatoria"));}
				
				for (int i=1; i<=n; i++){
					
					if (i==n){ln=" = ";}else{ln=" + ";}
					if (i%50==0 && i!=1){ln2="\n";}else{ln2="";}
					
					a+=i+ln+ln2;
					
				}
				
				JOptionPane.showMessageDialog(null,a+n_Sumatoria(n),"Output",JOptionPane.INFORMATION_MESSAGE);
				n=-1;
				a="";
				
			}else if (opcion==Operacion[2]){
				
				while (n<0 || n>170){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite n para n!"));}//Despues del 170! los valores se vuelven infinitos
		
				JOptionPane.showMessageDialog(null,n+"! = "+Factorial(n),"Output",JOptionPane.INFORMATION_MESSAGE);
				n=-1;
				
			}
			
		}while(opcion!=Operacion[3]);
		
	}
}
