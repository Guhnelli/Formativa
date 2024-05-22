package FORMATIVA_LAP_22_05;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double  celsius, fahrenheit;
		
		System.out.print("informe o valor em fahrenheit :");
		fahrenheit = ler.nextDouble();
		
		celsius = ((fahrenheit - 32)* 5)/9;
		
		System.out.println(" A temperatura convertida em celsius " + celsius);
	}

}
