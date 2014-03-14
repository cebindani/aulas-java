package helloworld;

public class Ponto {
	int x;
	int y;
	
	double distanciaAte(Ponto outro){
		return Math.sqrt(Math.pow(this.x - outro.x, 2)+Math.pow(this.y-outro.y, 2));
		//o uso do this. é apenas para afirmar que está instanciando ele mesmo
	}

}
