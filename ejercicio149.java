import javax.swing.JOptionPane;

public class ejercicio149 {
	
public static void main(String[] abc){
		
		JuegoV2();
		
	}

	public static void JuegoV2(){
		
		int azar = (int)(Math.random()*100+1);
		int tries=0;
		int n=0;
		
		JOptionPane.showMessageDialog(null,"149. Realice un programa que solicite al usuario que piense un número entero entre\nel 1 y el 100. El programa debe generar un número aleatorio en ese mismo rango\n[1-100], e indicarle al usuario si el número que dígito es menor o mayor al número\naleatorio, así hasta que lo adivine. Y por último mostrarle el número de intentos que\nle llevó.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
       
        do{
			n=0;
			tries+=1;
           
			while (n<=1 || n>100){n = Integer.parseInt(JOptionPane.showInputDialog(null,"Adivine el número entero positivo (1-100)"));}
           
            if (n<azar){
				
                JOptionPane.showMessageDialog(null,"Digite un número más grande","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}else if (n>azar){
				
				JOptionPane.showMessageDialog(null,"Digite un número más pequeño","Output",JOptionPane.INFORMATION_MESSAGE);
				
			}
           
        }while (n!=azar);
		
        JOptionPane.showMessageDialog(null,"Correcto! El númera era "+azar+". Le tomó "+tries+" intentos adivinar","Output",JOptionPane.INFORMATION_MESSAGE);
       
    }
	
}
