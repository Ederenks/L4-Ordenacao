package L4Ex1;

import Edu.Ede.Marge.OrdenacaoMarge;

public class Main {
	public static void main(String[] args) {
	int [] vet= {74 , 20, 74 ,87, 81, 16, 25, 99, 44, 58};
	int i = vet.length;
	 OrdenacaoMarge op = new OrdenacaoMarge();
	 vet =op.mergeSort(vet, 0, i -1 );
	 
	 for ( int x:vet ) {
		 System.out.print(i + " ");
	 }
	}
}
