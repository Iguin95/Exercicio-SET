/*Na contagem de votos de uma eleição, são gerados vários registros
de votação contendo o nome do candidato e a quantidade de votos
(formato .csv) que ele obteve em uma urna de votação. Você deve
fazer um programa para ler os registros de votação a partir de um
arquivo, e daí gerar um relatório consolidado com os totais de cada
candidato.*/

package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: "); 
		// "C:\Users\Igor\OneDrive\Desktop\in.txt"
		String path = sc.nextLine();
		System.out.println("-----------------------");
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)) ){
			String linha = br.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(",");
				String nomes = campos[0];
				Integer votos = Integer.parseInt(campos[1]);
				
				System.out.println(linha);
				
				if(map.containsKey(nomes)) {
					int votosTotal = map.get(nomes);
					map.put(nomes, votos + votosTotal);
				}else {
					map.put(nomes, votos);
				}
				
				linha = br.readLine();
			}
			System.out.println("-----------------------");
			
			for(String chave : map.keySet()) {
				System.out.println(chave + ": " + map.get(chave));
			}
			System.out.println("-----------------------");
			
			boolean contem = map.containsKey("Bob Brown");
			System.out.println("Contém? " + contem);
			
			
		}catch(IOException e) {
			System.out.println("Erro na leitura do arquivo: " + e.getMessage());
		}
		
		sc.close();

	}

}
