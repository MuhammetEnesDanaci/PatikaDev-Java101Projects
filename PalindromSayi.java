import java.util.Scanner;

public class PalindromSayi {
	
	static boolean isPalindrom(int number) {
		
		int temp = number;
		int reverseNumber = 0;
		int lastNumber;
		
		while (temp != 0) {
			lastNumber = temp % 10 ;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp = temp / 10;
			
		}
		if (reverseNumber == number) {
			System.out.println(number + " sayısı palindromdur");
			return true;
		}
		else {
			System.out.println(number + " sayısı palindrom değildir");
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in);
		System.out.println("bir sayı girin : ");
		int sayi = degerAl.nextInt();
		isPalindrom(sayi);
		
	}

}
