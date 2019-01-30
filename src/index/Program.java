package index;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import pack.Barcos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int x[] = new int[3];
		int y[] = new int[3];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = aleatorio.nextInt(10);
			y[i] = aleatorio.nextInt(10);
			
			if (i > 0) {
				for(int j = 0; j < i; j++) {
					do {
						if (x[i] == x[j] && y[i] == y[j]) {
							x[i] = aleatorio.nextInt(10);
							y[i] = aleatorio.nextInt(10);
						}
					} while(x[i] == x[j] && y[i] == y[j]);
						
				}
			}
		}
		
		Barcos jogo = new Barcos(x[0], y[0], x[1], y[1], x[2], y[2]);
		
		jogo.mostrarMar();
		
		int i = 1;
		int chances = 3;
		
		do {
			System.out.println();
			
			int nAleatorio = aleatorio.nextInt(10);
			int n = jogo.getX()[i-1] - nAleatorio;
			System.out.println("Para localizar o posicionamento da " + i + "# linha resolva o calculo abaixo");
			System.out.print(n + " + " + nAleatorio + " = ");
			int escolhaX = sc.nextInt();
			
			nAleatorio = aleatorio.nextInt(10);
			n = jogo.getY()[i-1] - nAleatorio;
			System.out.println("Para localizar o posicionamento da " + i + "# coluna resolva o calculo abaixo");
			System.out.print(n + " + " + nAleatorio + " = ");
			int escolhaY = sc.nextInt();
				
			System.out.println();
			
			int resultado = jogo.mostrarMar(escolhaX, escolhaY);
			i += resultado;
			if(resultado == 0)
				chances--;
			
			System.out.printf("%nChances: " + chances + "%n");
		}while (chances > 0 && i < 4);
		
		System.out.printf("FIM DE JOGO!%nResultado: ");
		
		if (chances == 0) {
			System.out.print("Derrota");
		}
		else {
			System.out.print("Vitoria");
		}
		
		sc.close();

	}

}