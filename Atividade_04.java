package FORMATIVA_LAP_22_05;

public class Atividade_04 {

	public static void main(String[] args) {
		int bingo[] = new int [20];
		
		for (int i=0; i<20; i++) 
		{
			int numero;
			numero = (int)Math.round(Math.random()* 100);
			bingo[i] = numero;
			System.out.println(bingo[i]);
		}

	}

}
