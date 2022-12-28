
public class FibonacciSerisi {

	public static void main(String[] args) {
		
		int sayi1=0 , sayi2=1;
		
		int toplam =0;
		System.out.print(sayi1+" ");
		System.out.print(sayi2+" ");
		for (int i = 0; i < 10; i++) {
			toplam = sayi1 + sayi2;			
			System.out.print(toplam+" ");
			
			sayi1=sayi2;
			sayi2=toplam;
		}

	}

}
