package OrdenacaoVelocidade;

import Controll.QuickSort;
import Edu.Ede.Marge.OrdenacaoMarge;
import Edu.Ede.calc.Ordenacao;

public class Controller {
	public double tempoQuick(int [] x) {
		QuickSort qs = new QuickSort();
		double tempoInicial= System.nanoTime();
		qs.quickSort(x, 0, x.length-1);
		double tempoFinal= System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		return tempoTotal;
		
	}
	
	public double tempoMarge(int[] x) {
		OrdenacaoMarge marge = new OrdenacaoMarge();
		double tempoInicial= System.nanoTime();
		marge.mergeSort(x, 0, x.length-1);
		double tempoFinal= System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		return tempoTotal;

		
	}
	public double tempoBuble(int[] x) {
		Ordenacao buble = new Ordenacao();
		double tempoInicial= System.nanoTime();
		buble.BubleSort(x);
		double tempoFinal= System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial)/ Math.pow(10, 9);
		return tempoTotal;

	}
}
