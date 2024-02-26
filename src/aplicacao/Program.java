
package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		System.out.print("How many students for course A?: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			int num = sc.nextInt();
			set.add(num);
			/*
			 * set.add(new Usuario(sc.nextInt())); -> para poder usar a instanciação do
			 * objeto, eu teria que declarar o Set do tipo 'Usuario' que é o tipo do objeto
			 */
		}

		System.out.print("How many students for course B?: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			int num = sc.nextInt();
			set.add(num);
			/*
			 * set.add(new Usuario(sc.nextInt())); -> O uso do método add recuperando a
			 * entrada via scanner não é recomendadado, pois em caso de erro não seria
			 * possível tratar a exceção ou o dado inválido. Funciona desde que as entradas
			 * sempre esteja corretas e, não é uma boa prática.
			 */
		}

		System.out.print("How many students for course C?: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			int num = sc.nextInt();
			set.add(num);
		}

		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
