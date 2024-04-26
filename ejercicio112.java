import javax.swing.JOptionPane;

public class ejercicio112 {
    public static void main(String[] abc){
		
		MenuViajes();
		
	}

	public static Object opcion;
	public static Object [] Transporte = {"Seleccione","a) Cartagena. [$150]","b) Barranquilla. [$320]","c) Sincelejo. [$120]","d) Valledupar. [$90]","e) Santa Marta.[$110]"};
	public static Object [] Destino = {"","Cartagena","Barranquilla","Sincelejo","Valledupar","Santa Marta"};
	
	
	public static void MenuViajes(){
		
		int[] pago = {0,150,320,120,90,110};

		int n=0;
		
		JOptionPane.showMessageDialog(null,"112. Programa que muestre en pantalla el siguiente menú de\nopciones : Línea de autobuses ADO, seleccione su\ndestino:\n\ta) Cartagena. [$150]\n\tb) Barranquilla. [$320]\n\tc) Sincelejo. [$120]\n\td) Valledupar. [$90]\n\te) Santa Marta.[$110]\nTomando en cuenta el menú anterior, obtener la opción seleccionada por el usuario\ny muestre el mensaje según corresponda:\n\tSu destino es “Cartagena”, tiempo de traslado 2 hrs, costo $200.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{

			opcion = JOptionPane.showInputDialog(null,"Línea de autobuses ADO, seleccione su destino", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Transporte, Transporte[0]);
			
		}while(opcion==Transporte[0]);
		
		JOptionPane.showMessageDialog(null,"Su destino es "+Destino[GetPositionObject(opcion,Transporte)]+", tiempo de traslado 2 h. Costo "+pago[GetPositionObject(opcion,Transporte)]+" $.","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}

