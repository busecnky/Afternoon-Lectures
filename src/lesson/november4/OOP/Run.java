package lesson.november4.OOP;

public class Run {
	
	public static void main(String[] args) {
	
		//calisanlar sınıfında new anahtar kelimesiyle calisan1 adında bir 
		Calisanlar calisan1 = new Calisanlar();
		calisan1.ad = "Ali";
		calisan1.soyad = "Öğütçen";
		calisan1.departman = "Yazılım";
		calisan1.cinsiyet = "Erkek";
		calisan1.dogumTarihi = "1995";
		calisan1.yas = 27;
		
		
		System.out.println("Ad: " + calisan1.ad + "\nSoyad: " + calisan1.soyad);
		
		
		Urun urun1 = new Urun();
		urun1.urunAdi = "Şampuan";
		urun1.urunBarkodNumarasi = 1234;
		urun1.urunFiyati = 12.99;
		urun1.urunKategori = "Kişisel Bakım";
		
		urun1.bilgileriGoster();
		
		
		//Urun classındaki her şey 
		
		
		
		
	}
}
