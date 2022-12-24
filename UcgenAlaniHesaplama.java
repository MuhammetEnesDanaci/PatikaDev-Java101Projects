import java.util.Scanner;

public class UcgenAlaniHesaplama {

	public static void main(String[] args) {
		//değişkenler tanımlandı
		int kenar1,kenar2,kenar3;
				
		Scanner degerAl = new Scanner(System.in);
				
		//kullanıcıdan değerleri alma
		System.out.print("1. kenarı girin : ");
		kenar1 = degerAl.nextInt();
		
		System.out.print("2. kenarı girin : ");
		kenar2 = degerAl.nextInt();
		
		System.out.print("3. kenarı girin : ");
		kenar3 = degerAl.nextInt();
		
		double cevre = (kenar1+kenar2+kenar3);
		
		double u = cevre/2;
		
		double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		
		System.out.println("Üçgenin alanı = "+alan);
		
	}

}
