import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ejercicio173 {
    public static void main(String[] abc){

		CajaRegistradora();
		
	}

	public static void CajaRegistradora() {
		
		List<Integer> can = new ArrayList<>();
		List<Float> pre = new ArrayList<>();
		int cantidad=0,bupc=0;
	    float total=0,bupp=0;
	    
	    JOptionPane.showMessageDialog(null,"173. Crear un programa que lea cantidades y precios y al final indique el total de la\nfactura.\n○ Primero se preguntará : Introduzca la cantidad vendida\n○ Después se pregunta: Introduzca el precio\n○ La lectura termina cuando en la cantidad se introduzca un cero.\n○ Mostrar el total a pagar y la cantidad total de productos.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
	
		do{
			
			bupc =-1;
			while(bupc<0){bupc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad del producto N°"+(can.size()+1)));}
			can.add(bupc);
			
			if (bupc>0){
			
				bupp =0;
				while(bupp<=0){bupp = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el precio del producto N°"+(pre.size()+1)));}
				pre.add(bupp);
				
				total+=can.get(can.size()-1)*pre.get(pre.size()-1);
				
			}
			
		}while(can.get(can.size()-1)!=0);

		for (int i=0; i<pre.size(); i++){
			
			cantidad+=can.get(i);
			
		}

	    JOptionPane.showMessageDialog(null,"Cantidad total de productos vendidos = "+cantidad+"\n\nTotal a pagar = "+total+"$","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
