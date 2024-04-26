import javax.swing.JOptionPane;

public class ejercicio185 {
     public static void main(String[] args) {
		
		GenerarCURP();
        
    }
	
	public static void GenerarCURP(){
		
		String apellidoPaterno="";
        String apellidoMaterno="";
        String nombre="";
        String fechaNacimiento="";
        String sexo="";
        String entidadNacimiento="";
        String curp="";
		
		JOptionPane.showMessageDialog(null,"185. Programa que de acuerdo a los datos capturados por el usuario genere la\nCURP (Clave Única de Registro de Población).\n○ Primera letra del segundo apellido.\n○ Primera letra del nombre de pila.\n○ Fecha de nacimiento (2 últimos dígitos del año, 2 del mes y 2 del día de\nnacimiento).\n○ Letra del sexo (F o M).\n○ Dos letras correspondientes a la entidad de nacimiento; en el caso de\nextranjeros, se marca como NE (Nacido Extranjero).\n○ Primera consonante interna del primer apellido.\n○ Primera consonante interna del segundo apellido.\n○ Primera consonante interna del nombre.\n○ Dígito verificador del 0-9 para fechas de nacimiento hasta el año 1999 y\nA-Z para fechas de nacimiento a partir del 2000.\n○ Homoclave, para evitar duplicaciones.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		do{apellidoPaterno = IgnoreTilde(JOptionPane.showInputDialog(null,"Digite su apellido paterno"));}while(FuncionaesNumericas.Allowed(apellidoPaterno)==true);

		do{apellidoMaterno = IgnoreTilde(JOptionPane.showInputDialog(null,"Digite su apellido materno"));}while(FuncionaesNumericas.Allowed(apellidoMaterno)==true);

		do{nombre = IgnoreTilde(JOptionPane.showInputDialog(null,"Digite nombre"));}while(FuncionaesNumericas.Allowed(nombre)==true);

		do{fechaNacimiento = JOptionPane.showInputDialog(null,"Digite su fecha de nacimiento en formato AAAA/MM/DD");}while(FuncionaesNumericas.Allowed(fechaNacimiento)==true);

		do{sexo = JOptionPane.showInputDialog(null,"Digite su sexo (M/F)").toUpperCase();}while(FuncionaesNumericas.Allowed(sexo)==true && (sexo.equals("M")==false || sexo.equals("F")==false));

		do{entidadNacimiento = JOptionPane.showInputDialog(null,"Digite la entidad de nacimiento (2 letras)").toUpperCase();}while(FuncionaesNumericas.Allowed(entidadNacimiento)==true && entidadNacimiento.length()!=2);

        // Generar CURP
        curp = apellidoPaterno.substring(0, 1) + obtenerPrimeraConsonante(apellidoPaterno.substring(1))
                + apellidoMaterno.substring(0, 1) + nombre.substring(0, 1) + fechaNacimiento.substring(2)
                + fechaNacimiento.substring(4, 6) + fechaNacimiento.substring(6) + sexo + entidadNacimiento
                + obtenerPrimeraConsonante(apellidoPaterno.substring(1)) + obtenerPrimeraConsonante(apellidoMaterno.substring(1))
                + obtenerPrimeraConsonante(nombre.substring(1));
		
		JOptionPane.showMessageDialog(null,"El CURP es: " + curp,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

    private static String IgnoreTilde(String showInputDialog) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'IgnoreTilde'");
    }

    public static String obtenerPrimeraConsonante(String cadena){
		
        String primeraConsonante = "";
		
        for (int i = 1; i < cadena.length(); i++){
			
            char letra = cadena.charAt(i);
			
            if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
				
                primeraConsonante = String.valueOf(letra);
				
                break;
				
            }
			
        }
		
        return primeraConsonante;
		
    }
}


