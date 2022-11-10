package lesson.november9;

import java.util.Random;

public class Question66 {

	public static void main(String[] args) {
		
	
	String[] sinif = {
            "İrfan Mert Namsal",
            "Oğuz Furkan TOPRAK",
            "Fatih Çetin",
            "Melihcan ÖZTÜRK",
            "Mustafa Can Mavili",
            "Oğuz TAŞGIN",
            "Buse Çankaya",
            "Sevcan Aslan",
            "Metehan Ölçer",
            "Merve Adler",
            "Mert Taser",
            "Abdulkadir Dilmen",
            "Muhammed Furkan Türkmen",
            "Furkan Çitilci",
            "Ali Öğütçen"
    };
	//program başladığında bu array içinden rastgele bir isim çıktısı versin.
	
	
		Random random = new Random();  //Random() kısmı bunun constructor ı new ile biz yeni nesne üretiyoruz.
		int sayi = random.nextInt(sinif.length);
		System.out.println("Şanslı kişi: " + sinif[sayi]);
	
		int sayi2 = (int) (Math.random()*sinif.length);
		System.out.println("Şanslı kişi: " + sinif[sayi2]);
}	
	
	
}
