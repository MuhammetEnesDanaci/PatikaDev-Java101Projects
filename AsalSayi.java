package patikaUygulamalar;

public class AsalSayi {

	public static void main(String[] args) {
		
		int sayac = 0;
		for (int i = 2; i <= 10000; i++) {
			int kontrol = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					kontrol = 1;
					break;
				}
			}
			
			if(kontrol == 0) {
				System.out.println(i);
				sayac++;
			}
		}

	}

}
