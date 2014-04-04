package br.com.dextra.helloworld;

import java.util.ArrayList;

public class Aula10marco {

	public static void main(String[] args) {

		// int vetor[] = new int[5];
		int[] vetor = { 0, 3, 7, 5, 4 };
		// int j = i[0] + i[3];

		// for (int i=0; i<vetor.length;i++) {
		// System.out.println("Valor na posição "+i+": "+vetor[i]);
		//
		// }

		/* Uso do foreach */

		for (int i : vetor) {
			System.out.println("Valor no array: " + i);
		}

		/*
		 * Orientação objeto
		 */
		Ponto a = new Ponto(1, 2);
		a.x = 1;
		a.y = 2;

		Ponto b = new Ponto(4, 6);
		b.x = 4;
		b.y = 6;

		Ponto[] pontos = { a, b };
		ArrayList<Ponto> list = new ArrayList();
		/**
		 * ArrayList cresce de acordo com o necessário
		 * 
		 */
		list.add(a);
		list.add(b);
//		list.add(new Ponto());
		// Object c=list.get(0);
		Object c = (Ponto) list.get(0); //Assim eu transformei o c no tipo Ponto (casting)

		System.out.println(); // imprime linha vazia

		System.out.println("Distancia: " + a.distanciaAte(b));
		System.out.println(b);

	}

}
