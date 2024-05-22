package FORMATIVA_LAP_22_05;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double  lado_quadrao, area;
		
		System.out.print("informe o valor do lado do quadrado :");
		lado_quadrao = ler.nextDouble();
		
		area = (lado_quadrao * lado_quadrao);
		
		System.out.println(" A Area é " + area);

	}

}
