import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int sayi;
		double toplam = 0;
		System.out.println("dizi kaç elemanlı olsun : ");
		Scanner degerAl = new Scanner(System.in);
		
		sayi = degerAl.nextInt();
		
		int dizi[] = new int[sayi];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (i+1);
		}
		
		for (int i : dizi) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < dizi.length; i++) {
			toplam = toplam + (1/(double)dizi[i]);
		}
		
		System.out.println("harmonik ortalama : " + toplam);
	}

}
