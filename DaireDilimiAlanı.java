import java.util.Scanner;

public class DaireDilimiAlanı {

	public static void main(String[] args) {
		
		//değişkenler tanımlandı
		double yaricap,aci,daireDilimAlani,pi;
		pi=3.14;
		
		Scanner degerAl = new Scanner(System.in);
		
		//kullanıcıdan değerleri alma
		System.out.print("yarıcap giriniz : ");
		yaricap = degerAl.nextDouble();
		
		System.out.print("Açı giriniz : ");
		aci = degerAl.nextDouble();
		
		daireDilimAlani = (pi*(yaricap*yaricap)*aci)/360;
		
		System.out.println("Daire diliminin alanı : "+daireDilimAlani);
		

	}

}
