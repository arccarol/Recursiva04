package view;

import java.util.Scanner;

import controller.Recursiva04;

public class Principal {

	public static void main(String[] args) {
		int[] vt= new int [10];
		int n;
		try (Scanner leia = new Scanner(System.in)) {
			for ( n = 0; n <10; n++) {
				System.out.println("Digite os números");
				vt[n]=leia.nextInt();
			}
		}
		int resultado = Recursiva04.totalnegativo(vt,n);
		System.out.println("o total de numeros negativos  é  " + resultado);

	}

}