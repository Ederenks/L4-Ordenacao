package OrdenacaoVelocidade;

import Controll.QuickSort;
import Edu.Ede.Marge.OrdenacaoMarge;
import Edu.Ede.calc.Ordenacao;
import java.util.Random;

public class Main {
	public Main() {
		super();
	}
	public static void main(String[]args) {
		Random random = new Random();
		int [] vet = new int[1500];
		for(int i=0;i<vet.length;i++) {
			vet[i] = random.nextInt(100);
			System.out.print(vet[i] + " ");
		}
		Controller op = new Controller();
		double a =op.tempoQuick(vet);
		double b =op.tempoMarge(vet);
		double c =op.tempoBuble(vet);
		
		System.out.println("\nQuickSort ==> " +a+"s");
		System.out.println("MergeSort ==> " +b+"s");
		System.out.println("BubleSort ==> " +c+"s");
	}
	


}
