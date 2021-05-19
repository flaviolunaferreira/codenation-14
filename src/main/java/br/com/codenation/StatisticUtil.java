package br.com.codenation;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0;
		for (int i : elements) {
			soma = soma + elements[i];
		}
		return soma / elements.length;
	}

	public static int mode(int[] elements) {
		return 0;
	}

	public static int median(int[] elements) {
		return 0;
	}
}