import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {		
		
		double toplam;
		
		Scanner degerAl = new Scanner(System.in);
		
		//kullanıcıdan değerleri alma
		System.out.print("kaç km yol gidilecek : ");
		int km = degerAl.nextInt();
		
		toplam = 10+(km*2.20);
		
		toplam = (toplam<20)? 20 : toplam; 
		
		System.out.println("ödenecek tutat : " + toplam);

	}

}
