package br.com.dextra.helloworld;

public class Retangulo extends FiguraGeometrica{
	Ponto esquerdoSuperior;
	Ponto direitoInferior;

	public Retangulo(Ponto esqSup, Ponto dirInf) {
		
		/*if(esqSup.y < dirInf.y || dirInf.x < esqSup.x){
			throw new IllegalArgumentException();
		}*/
		esquerdoSuperior = esqSup;
		direitoInferior = dirInf;
	}

	double area() {
		return (Math.abs(direitoInferior.x - esquerdoSuperior.x) * Math.abs(esquerdoSuperior.y - direitoInferior.y)) / 2.0;
//		Math.abs => módulo
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Retângulo: "+ super.toString();
	}
}
