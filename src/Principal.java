import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner (System.in);
			int extremo1=0;
			int extremo2=0;
			System.out.print("Ingrese el extremo izquierdo del intervalo ");
			extremo1 = sc.nextInt();
			
			System.out.print("Ingrese el extremo derecho del intervalo ");
			extremo2 =sc.nextInt();
			
			double FxenA=Math.exp(-extremo1)+2 -extremo1;
			System.out.println("FXENA ES "+ FxenA);
			double FxenB=Math.exp(-extremo2)+2 -extremo2;
			System.out.println("FXENB ES "+ FxenB);
			
			if((FxenA*FxenB)>0) {
				System.out.println("No existe Raíz ");
			}
			else {
				System.out.println("Existe Raíz ");
				double xn= extremo1;
				System.out.println("xn "+ xn);
				
				double fxn=Math.exp(-xn)+2 -xn;
				System.out.println("fxn "+ fxn);
				
				double fpxn = -Math.exp(xn) -1;
				System.out.println("fpxn "+ fpxn);
				
				double xn1 = (xn) -(fxn/fpxn);
				System.out.println("xn1 "+ xn1);
				
				System.out.print("XN1 ES: "+xn1);
				while (Math.abs(xn1-xn)>0.001) {
					xn=xn1;
					fxn=Math.exp(-xn)+2 -xn;
					fpxn = Math.exp(-xn) -1;
					xn1 = (xn) -(fxn/fpxn);
					System.out.print("XN1 ES: "+xn1+"\n");
				}
			}
			
			
			
	}

}
