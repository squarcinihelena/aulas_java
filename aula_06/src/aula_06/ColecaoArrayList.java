package aula_06;
 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
 
public class ColecaoArrayList {
 
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		//Criamos coleção Array list
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		//Adicionando valores na Array List
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		/*System.out.println("Digite um número real: ");
		double input = leia.nextDouble();
		
		numeros.add(input);*/
		
		//Listando os valores da Coleção Array List
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		
		System.out.println("Indice do numero 9.0: " + numeros.indexOf(9.0));
		
		System.out.println("O numero numero 9.0 existe na coleção? " + numeros.contains(9.0));
		
		System.out.println("Qual valor esta armazenado no indice 2? " + numeros.get(2));
		
		//Alterar valor de um elemento
		numeros.set(2, 10.0);
		
		//Exibe os dados atualizados, através do método forEach
		System.out.println("Exibe os dados após a atualização");
		numeros.forEach(System.out::println);
		
		//Excluir um elemento da lista, com base no indice
		numeros.remove(2);
		
		//Excluir um elemento da lista, com base no elemento
		numeros.remove(2.0);
		
		//Exibe os dados atualizados, através do método forEach
		System.out.println("Exibe os dados após a exclusão");
		numeros.forEach(System.out::println);
		
		System.out.println("tamanho da coleçao: " + numeros.size());
		
		//limpar a coleçao
		numeros.clear();
		
		System.out.println("a coleçao esta vazia? " + numeros.isEmpty());
		
		//ordenar coleçao em ordem crescente
		numeros.sort(null);
		
		//ordenar em ordem decrescente //mas vc sempre vai precisar ordenar no null antes do reverse
		numeros.sort(Comparator.reverseOrder());

		
		leia.close();
 
	}
 
}
 