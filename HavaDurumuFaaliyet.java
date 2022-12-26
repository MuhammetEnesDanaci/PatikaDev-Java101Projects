import java.util.Scanner;

public class HavaDurumuFaaliyet {

	public static void main(String[] args) {
		
		int sicaklik;		

		Scanner degerAl = new Scanner(System.in);
		System.out.println("hava sıcaklığı giriniz : ");
		sicaklik=degerAl.nextInt();
		
		if (sicaklik<5) {
			System.out.println("kayak yapmaya gidebilirsiniz.");
		} 
		else if (sicaklik>=5 && sicaklik<15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if (sicaklik>=15 && sicaklik<25) {
			System.out.println("Piknik yapmaya gidebilirsiniz.");
		}
		else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}

	}

}
