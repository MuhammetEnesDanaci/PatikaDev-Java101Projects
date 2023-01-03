import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		System.out.print("dizi kaç elemanlı olacak : ");
		int elemanSayisi = degerAl.nextInt();
		int[] dizi = new int[elemanSayisi];
		int eleman;
		
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print((i+1) +". elemanı girin :");
			eleman = degerAl.nextInt();
			dizi[i] = eleman;
		}
		
		System.out.println(Arrays.toString(dizi));
		
		Arrays.sort(dizi);
		
		System.out.println("dizinin sıralanmış hali");
		System.out.println(Arrays.toString(dizi));

	}

}
