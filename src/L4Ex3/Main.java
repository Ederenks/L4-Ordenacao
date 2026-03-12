package L4Ex3;

import Controll.QuickSort;

public class Main {

	public static void main(String[] args) {
		QuickSort op = new QuickSort();
		int [] vet = {31,32,33,34,99,98,97,96};
		vet = op.quickSort(vet, 0, vet.length-1);
		for (int x:vet) {
			System.out.print(x +" ");
		}
	}

}
