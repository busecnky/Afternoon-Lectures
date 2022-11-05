package lesson.november4.OOP;

public class Urun {

	public String urunAdi;
	public int urunBarkodNumarasi;
	public double urunFiyati;
	public String urunKategori;
	
	public void bilgileriGoster() {
		System.out.println("Ürün " + urunAdi);
		System.out.println("Ürün barkod numarası " + urunBarkodNumarasi);
		System.out.println("Ürün Fiyatı " + urunFiyati);
		System.out.println("Ürün Kategorisi " + urunKategori);
	}
	
}
