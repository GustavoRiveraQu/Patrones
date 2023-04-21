package cl.grivera;
import java.util.*;

public class PatronesAnidados {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int n = ingreso.nextInt();
		System.out.println(System.lineSeparator());
		ingreso.close();
		patron1(n);
		patron2(n);
		patron3(n);
		patron4(n);
	}
	
	public static void patron1(int n) {

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i == 0)
					System.out.printf("*");
				else if (i == n-1)
					System.out.printf("*");
				else if (j == 0|| j==n-1) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.print(System.lineSeparator());
		}
		System.out.print(System.lineSeparator());
	}
	public static void patron2(int n) {

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i == 0) {
					System.out.printf("*");
				}else if (i == n-1) {
					System.out.printf("*");
				}else if (i==n-j-1) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.print(System.lineSeparator());	
		}
		System.out.print(System.lineSeparator());
	}
	
	public static void patron3(int n) {

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {

				if (i==n-j-1) {
					System.out.printf("*");
				}else if (i == j) {
					System.out.printf("*");	
				}else {
					System.out.printf(" ");
				}
			}
			System.out.print(System.lineSeparator());	
		}
		System.out.print(System.lineSeparator());
	}
	
	public static void patron4(int n) {

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i == 0 && j < n-1) {
					System.out.printf("*");	
				}
				else if (i == n-1 && j > 0) {
					System.out.printf("*");	
				}
				else if (i > 0 && i < n-1 && j > 0 && j < n-1) {
					System.out.printf("*");
				}
				else{
					System.out.printf(" ");
				}
			}
			System.out.print(System.lineSeparator());
		}
	}
}
