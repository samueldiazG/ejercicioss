import javax.swing.JOptionPane;

public class ejercicio175 {
    public static void main(String[] abc){
		
		FechaDateV3();
		
	}

	public static void FechaDateV3(){
		
		int[] n=new int[3];
		int[][] condición= {{0,9999999},{0,12},{0,31}};
		int[] p = {1,1,0};
		int[] t = {0,12,30};
		int[] co = {9999999+1,13,2};
		boolean[] b = {true,true,true};
		String[] ti = {"año","mes","día"};
		String[] tiem = {"AAAA","MM","DD"};
		
		JOptionPane.showMessageDialog(null,"175. Programa que dada la fecha actual en formato (AAAA-MM-DD), determine la\nfecha del día anterior.","Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<n.length; i++){
		
			while (n[i]<=condición[i][0] || n[i]>condición[i][1]){n[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el "+ti[i]+" ("+tiem[i]+")"));}
			
		}
		
		for (int i=n.length-1; i>=0; i--){

			if (n[i]<co[i] && b[i+p[i]]==b[i]){
				
				if (p[i]==1 && i!=0){
					
					if (n[i]-1==0){

						n[i]=t[i];
						b[i]=true;
						
					}else{

						n[i]-=1;
						b[i]=false;
						
					}
					
				}else if (i==0){
					
					n[i]-=1;
					
				}else{
					
					n[i]=t[i];
					b[i]=true;
					
				}
				
			}else if (i==n.length-1){
				
				n[i]-=1;
				b[i]=false;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null,"Ayer fue el "+BigDate(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
