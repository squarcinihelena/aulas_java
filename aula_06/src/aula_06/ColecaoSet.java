package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maça");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maça");
		frutas.add("maça");
		
		System.out.println(frutas);
		//cuidado q qd eh minusuculo ele entende como outro elemento
		
		for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		
		System.out.println("morango existe na coleçao? " + frutas.contains("Morango"));
		
		//remove elemento da coleçao
		frutas.remove("Morango");
		
		//criar um iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		
		//listar os dados apos a exclusao de um elemtno
		while(iFrutas.hasNext()) { //enquanto ifurtas tiver next elemento
			System.out.println(iFrutas.next()); //mostra o next elemetno
		} //DETALHE ele cria o iterator com os dados q vc tem ATE o momento, entao n deixe de atualizar
		
		//criamos a coleçao arraylist
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//add todos os elementos da coleçao set(frutas) na coleçao arraylist frutasList
		frutasList.addAll(frutas);
		
		//ordenmamos frutas list em ordem crescente
		frutasList.sort(null);
		
		//exibimos frutasList em ordem crescente
		System.out.println("Exibir os dados do ArrayList");
		frutasList.forEach(System.out::println);
		
		//ATENÇAO msm depois de tudo isso o set continua funcionadno
		//vc deixa eles intactos e copia e transforma em um array list 
	}

}
