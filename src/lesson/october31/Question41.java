package lesson.october31;

public class Question41 {

	public static void main(String[] args) {

		//dizide eğer a ile biten bir kelime varsa o kelimeyi "?" ile değiştirelim
		
		//1. indexi değişti --> ?
		
		String[] dizi = {"Amerika", "Almanya", "İsveç", "Türkiye", "Danimarka"};
		
		for (int i=0; i<dizi.length; i++ ) {
			if (dizi[i].endsWith("a")){
				dizi[i] = "?";
				String yeniDizi = dizi[i];
				System.out.println(i + ". indexi değişti --> " + yeniDizi);
			}
		}
	
		
	}

}
