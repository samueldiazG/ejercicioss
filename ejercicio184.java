import javax.swing.JOptionPane;

public class ejercicio184 {
    public static void main(String[] abc){
		
		GenerarRFC();
		
	}

	public static void GenerarRFC(){
		
		String nombre="";
		String fecha="";
		String rfc = "";
		
		JOptionPane.showMessageDialog(null,"","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{nombre = IgnoreTilde(JOptionPane.showInputDialog(null,"Digite su nombre completo")).toUpperCase();}while(FuncionaesNumericas.Allowed(nombre)==true);
	
		do{fecha = JOptionPane.showInputDialog(null,"Digite su fecha de nacimiento o creación de la empresa (DD/MM/AAA)");}while(FuncionaesNumericas.Allowed(fecha)==true);

        String[] parts = Separar(nombre,' ');
        String iniciales = "";
		
        for (int i=0; i<parts.length; i++){
			
            iniciales += parts[i].charAt(0);
			
        }

        String[] partsFecha = Separar(fecha,'/');
        String AAAA = partsFecha[2].substring(2);
        String MM = partsFecha[1];
        String DD = partsFecha[0];

        String clave = "";
		
        for (int i=0; i<3; i++){
			
            int Azar = (int) (Math.random() * 36);
			
            if (Azar<10){
				
                clave+=Azar;
				
            }else{
				
                clave += (char) ('A' + Azar-10);
				
            }
			
        }

        rfc = iniciales + AAAA + MM + DD + clave;
		
		JOptionPane.showMessageDialog(null,"El RFC generado es: " + rfc,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}

