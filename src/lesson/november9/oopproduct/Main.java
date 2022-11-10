package lesson.november9.oopproduct;


public class Main {

	public static void main(String[] args) {

		//id String tutcaz.
		//id, price, stock, name olan bir product sınıf yazalım
		//bilgileriGoster methodu yazalım
		
		//products arrayi oluşturalım
		//oluşturduğumuz productları bu arrayin içine atalım
		//Daha sonra bu array i yazdıralım
		
		//farklı bi pakette bi sınıf oluşturcaz
		//o sınıfın içinde random id üretcez
		//mainde id set edicez
		
		
		Product[] productDizi = new Product[2];
		
		
		String randomId = lesson.november9.oopproduct2.GenerateRandomId.generateId(); //yukarıda import etmezsek eğer bu şekilde yapabiliriz
		
		//get demeden önce set etmemiz lazım
		//setterlar ile biz bunların değerlerini set ediyoruz sonra get ile ulaşıyoruz.
		Product product1 = new Product();
		product1.setName("Asus");
		product1.setProductId(randomId); //yukarıda import ettiğimiz için böyle oldu
		product1.setUnitPrice(3000);
		product1.setUnitInStock(100);
	
		Product product2 = new Product();
		product2.setName("Asus");
		product2.setProductId(randomId);
		product2.setUnitPrice(4000);
		product2.setUnitInStock(150);
		
		
		//System.out.println(product1.getProductId());
		
		//veya
		
		//product1.bilgileriGoster("Asus", "112233", 3000, 100);
		
		
	
		productDizi[0] = product1;
		productDizi[1] = product2;
		
		System.out.println("********************");
		System.out.println("showInfo from ProductManager çıktısı: " );
		
		//Product manager classındaki bütün metotlar staticti.
		//Aşağıdaki şekilde biz ulaşabiliyorduk
		
		
//		ProductManager.showInfo(product1);
//		ProductManager.veriTabaninaKaydet(product1);
//		ProductManager.sepeteEkle(product1);
//		
//		ProductManager.showInfo(product2);
//		ProductManager.veriTabaninaKaydet(product2);
//		ProductManager.sepeteEkle(product2);
		
		
		//Fakat biz gelip eğer staticleri silersek yukarıdakiler hata veriyor.
		//bunu düzeltmek için  Project Manager class ından bir obje oluşturmalıyız.
		
		ProductManager manager = new ProductManager();
		
		manager.showInfo(product1);
		manager.veriTabaninaKaydet(product1);
		manager.sepeteEkle(product1);
		
		manager.showInfo(product2);
		manager.veriTabaninaKaydet(product2);
		manager.sepeteEkle(product2);
		
		//aynısını veriyor.
		System.out.println("********************");
		System.out.println("****Ürün Güncelleme Ödev*****");
		//Ödev kısmı için
		manager.urunuGuncelle(product1,"HP");
		manager.showInfo(product1);
		manager.urunuGuncelle(product2, "HP");
		manager.showInfo(product2);
		
			System.out.println("********************");
		
		//Aşağıdakileri hata vermesin diye yoruma aldık çünkü product içindeki bilgileriGosteri yorumladık. Yorumu açarsak bunları açınca hata gider.
		//(productDizi[0].bilgileriGoster(); // --> product1.bilgileriGetir()
		
//		for (int i = 0; i < productDizi.length; i++) {
//			productDizi[i].bilgileriGoster();
//		}
		
	
		
		//forEach ile çözümü
//		for(Product index: productDizi) {
//			index.bilgileriGoster();
//		}
		

//		
//		System.out.println("********************");
//		product1.bilgileriGoster();
//		product2.bilgileriGoster();
	}
}
