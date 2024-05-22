package FORMATIVA_LAP_22_05;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double  valor1, valor2, soma, sub, multi, div;
		String operaçao;

		System.out.print("informe o valor :");
		valor1 = ler.nextDouble();

		System.out.print("informe o valor :");
		valor2 = ler.nextDouble();

		System.out.print("informe a operação soma , multplicação , subtração e divisão:");
		operaçao = ler.next();

		if (operaçao.equals("soma")) {
			soma=(valor1+valor2);
			System.out.println(" resultado de soma é =" + soma);
		}
		else if (operaçao.equals("subtração")) {
			sub=(valor1-valor2);
			System.out.println(" resultado de sulbtração é =" + sub);
		}
		else if (operaçao.equals("multiplicação")) {
			multi=(valor1*valor2);
			System.out.println(" resultado de multiplicação é =" + multi);
		}
		else if (operaçao.equals("divisão")) {
			div=(valor1/valor2);
			System.out.println(" resultado de multiplicação é =" + div);
		}
		else {
			System.out.println(" Essa operação não existe " );
		}

	}

}
