package cl.grivera;
import java.util.*;

public class Patrones {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.printf("Ingresa un número: ");
		int n = ingreso.nextInt();
		ingreso.close();
		//CICLO 1
		int i;
		for(i=0;i<n;i++) {
			if(i%2==0)
				System.out.printf("*");
			else
				System.out.printf(".");
		}
		System.out.printf("\n");
		ingreso.close();

		//CICLO 2
		int f = 1;
		for (i=0;i<n;i++){			
			if (f<4) {

				System.out.print(f);
				f = f+1;
			}else{
				System.out.print(f);
				f=1;
			}
		}
		System.out.printf("\n");
		//CICLO 3
		int g = 0;
		for (i=0;i<n;i++){			
			if (g==0) {
				System.out.print("|");
				g++;
			}
			else if (g==1) {
				System.out.print("|");
				g++;
			}
			else if (g==2) {
				System.out.print("*");
				g=0;
			}

		}
		
	}

}


