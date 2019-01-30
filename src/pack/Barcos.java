package pack;

public final class Barcos extends Mar {

	private int x[] = new int[3];
	private int y[] = new int[3];

	public Barcos(int x1, int y1, int x2, int y2, int x3, int y3) {

		x[0] = x1;
		x[1] = x2;
		x[2] = x3;

		y[0] = y1;
		y[1] = y2;
		y[2] = y3;

	}

	public int[] getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

	protected byte comparador(int x, int y) {
		parametro[x][y] = 'X';
		
		for(int i = 0; i < this.x.length; i++) {
			if (this.x[i] == x) {
				for(int j = 0; j < this.y.length; j++) {
					if (this.y[j] == y) {
						parametro[x][y] = 'V';
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public byte mostrarMar(int x, int y) {
		byte situacao = comparador(x, y);
		
		System.out.print("     ");
		for (int i = 0; i < getParametro().length; i++) {
			System.out.print(i + "  ");
		}
		
		System.out.printf("%n%n");

		for (int i = 0; i < parametro.length; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < parametro[i].length; j++) {
				System.out.printf("|" + getParametro()[i][j] + "|");
			}
			System.out.println();
		}

		return situacao;
		
	}

}