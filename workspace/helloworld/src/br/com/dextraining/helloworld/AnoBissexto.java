/**
 * 
 */
package br.com.dextraining.helloworld;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano=0;
		bissexto(ano);
		
	}

	static boolean bissexto(int ano) {
		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			return true;

		}
		else return false;
	}
}
