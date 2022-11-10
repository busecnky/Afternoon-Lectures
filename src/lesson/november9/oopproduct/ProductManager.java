package lesson.november9.oopproduct;

public class ProductManager {

	//bunların önünden static leri silersek eğer mainde ProductManager.showInfo(product1); şeklinde ulaşamayız.
	//o zaman bu classtan bir obje oluşturmalıyız.
	//sonra onu manager.showProduct(product1); şeklinde çağırırız.
	
	//static olduğunda heap te yer ediyo ve bu programı kapatana kadar bellekte yer kaplıyo.
	//Ama eğer static yapmazsak biz onu obje oluşturup çağırıyoruz sadece o zaman kullanıyo oluyoruz.
	//bu da belleği şişirmememizi sağlıyor.
	
	
	public void showInfo(Product product) {
//		product1.bilgileriGoster(); eğer Product classında olsaydı böyle çağırcaktık ama şimdi yorumladık karışmasın diye.
		System.out.println("Name: " + product.getName());
		System.out.println("Product ID: " + product.getProductId());
		System.out.println("Unit Price: " + product.getUnitPrice());
		System.out.println("Unit in Stock: " + product.getUnitInStock());
	}
	
	//veriTabanınaKaydet()
	//asus veritabanına kaydedildi diye console a çıktı versin
	
	public void veriTabaninaKaydet(Product product) {
		System.out.println( product.getName() + " veri tabanına kaydedildi.");
	}
	
	//sepeteEkle()
	//asus sepete eklendi diye console a çıktı versin
		
		public void sepeteEkle(Product product) {
			System.out.println( product.getName() + " sepete eklendi.");
		}
	
	
	//urunu güncellicez ödevde
		//manager.urunuGuncelle(product2, "HP");
		//ProductManager.bilgileriGoster(product2);
		
		public void urunuGuncelle(Product product , String isim ) {
		product.setName(isim);
		}
		
		
}
