package pack;

public abstract class Mar {

	protected char[][] parametro = new char[10][10];

	public char[][] getParametro() {
		return parametro;
	}

	protected void setParametro(char[][] parametro) {
		this.parametro = parametro;
	}

	protected void addMar() {
		for (int i = 0; i < parametro.length; i++) {
			for (int j = 0; j < parametro[i].length; j++) {
				parametro[i][j] = '?';
			}
		}
	}

	public void mostrarMar() {
		addMar();
		
		System.out.print("     ");
		for (int i = 0; i < getParametro().length; i++) {
			System.out.print(i + "  ");
		}
		
		System.out.printf("%n%n");

		for (int i = 0; i < getParametro().length; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < getParametro()[i].length; j++) {
				System.out.printf("|" + getParametro()[i][j] + "|");
			}
			
			System.out.println();
		}

	}

}