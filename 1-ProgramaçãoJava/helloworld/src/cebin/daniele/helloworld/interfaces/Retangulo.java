package cebin.daniele.helloworld.interfaces;

public class Retangulo implements FiguraGeometrica {

	Ponto esquerdoSuperior;
	Ponto direitoInferior;

	public Retangulo(Ponto esqSup, Ponto dirInf) {

		/*
		 * if(esqSup.y < dirInf.y || dirInf.x < esqSup.x){ throw new
		 * IllegalArgumentException(); }
		 */
		esquerdoSuperior = esqSup;
		direitoInferior = dirInf;
	}

	public double area() {
		return (Math.abs(direitoInferior.x - esquerdoSuperior.x) * Math
				.abs(esquerdoSuperior.y - direitoInferior.y)) / 2.0;
		// Math.abs => módulo

	}

	@Override
	public String toString() {
		return "Retângulo";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * (direitoInferior.x - esquerdoSuperior.x) + 2
				* (esquerdoSuperior.y - direitoInferior.y);
	}

	public Ponto[] vertices() {
		return new Ponto[] { esquerdoSuperior, direitoInferior,
				new Ponto(esquerdoSuperior.x, direitoInferior.y),
				new Ponto(direitoInferior.x, esquerdoSuperior.y) };
	}
}
