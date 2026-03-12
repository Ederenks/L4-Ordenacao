package L4Ex2;

import Controll.QuickSort;

public class Main {
	public Main() {
		super();	
	}
	
	public static void main(String[]args) {
		QuickSort op = new QuickSort();
		int [] vet = {44,43,42,41,40,39,38};
		vet = op.quickSort(vet, 0, vet.length - 1);
		for (int x: vet) {
			System.out.print(x + " ");
		}
	}
}
