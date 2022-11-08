package lesson.november8;

public class Main {

	public static void main(String[] args) {

		Araba araba1 = new Araba();
		araba1.marka = "Toyota";
		araba1.model = "Corolla";
		//araba2.yas = Araba.arabaYasi(araba1);
		araba1.uretimYili = 2022;
		araba1.motorGucu = "1300";
		araba1.motorHacmi = "105";
		araba1.motorTipi = "Benzin";
		araba1.renk = "Beyaz";
		
		Araba araba2 = new Araba();
		araba2.marka = "Maserati";
		araba2.model = "SM1";
		//araba2.yas = Araba.arabaYasi(araba2);
		araba2.uretimYili = 2009;
		araba2.motorGucu = "1300";
		araba2.motorHacmi = "105";
		araba2.motorTipi = "Benzin";
		araba2.renk = "Parlement Mavisi";
		
		//Mertin çözümü
//		int yas = Araba.arabaYasi(araba1);
//		String[] arr = new String[6];
//		arr[0] = araba1.marka;
//		arr[1] = String.valueOf(yas);
//		arr[2] = araba1.motorGucu;
//		arr[3] = araba1.motorHacmi;
//		arr[4] = araba1.marka;
//		arr[5] = araba1.motorTipi;
//		araba1.arabaBilgileri(arr);
		
		
		Araba[] arabalar = {araba1, araba2};
		
		for(int i = 0; i<arabalar.length; i++) {
			araba1.arabaBilgileri(arabalar[i]);
			System.out.println("================");
		}
		
		
		//Mertin çözümü bitti
		
		
		//Abdulkadir çözümü
		//39. satır burası içinde geçerli o satır sayesinde çalışıyor burası
		for (Araba item : arabalar) {
			araba1.arabaBilgileri(item);
			System.out.println("================");
		}
		
		
	}

}
