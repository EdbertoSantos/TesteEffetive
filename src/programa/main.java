package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Pessoas.pessoas;

public class main {

	public static void main(String[] args) {

		String path = "C:\\Program Files\\Java\\teste.txt";
		
		List<pessoas> list = new ArrayList<pessoas>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				
				String[] vet = line.split(";");
				Integer NUMERO_DA_VENDA = Integer.parseInt(vet[0]);
				String NOME_DO_CLIENTE = vet[1];
				String DATA_DA_VENDA = vet[2];
				String VALOR_DA_VENDA = vet[3];
				
				pessoas ps = new pessoas(NUMERO_DA_VENDA, NOME_DO_CLIENTE, DATA_DA_VENDA, VALOR_DA_VENDA);
				list.add(ps);
				
				line = br.readLine();
			}	
			
			System.out.println("PRODUCTS:");
			for (pessoas ps : list) {
				System.out.println(ps);
				System.out.println("hello");

			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}