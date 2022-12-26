import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		//username=patika ,password=12345
		String username="patika",password="12345";
		String usernamegiris,passwordgiris;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("kullanıcı adı giriniz : ");
		usernamegiris=scan.nextLine();
		
		System.out.println("şifre adı giriniz : ");
		passwordgiris=scan.nextLine();
		
		if (username.equals(usernamegiris) && password.equals(passwordgiris)) {
			System.out.println("giriş başarılı");
		} 		
		else {
			System.out.println("bilgileriniz yanlış");
			
			System.out.println("şifrenizi sıfırlama ister misiniz? (1-Evet , 2-Hayır) :");
			int secenek = scan.nextInt();
			scan.nextLine();
			switch (secenek) {
			case 1:				
				System.out.println("yeni şifre giriniz : ");
				String newpassword=scan.nextLine();
				if (newpassword.equals(password)) {
					System.out.println("yeni şifre eski şifre ile aynı olamaz.");
					break;
				} 
				else {
					System.out.println("şifreniz değiştirildi.");
					password=newpassword;
					break;
				}
			case 2:
				System.out.println("şifre değiştirme işlemi kabul edilmedi. Programadan çıkılıyor. ");
				break;
				
			default:
				System.out.println("yanlış giriş yapıldı.");
				break;
			}
		}
		
	}

}
