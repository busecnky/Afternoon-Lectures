package lesson.november1;

public class Question47 {

	public static void main(String[] args) {

		// Mülakat soruları

		// jdk jre jvm bunlar arasındaki fark ve nasıl çalışıyorlar arka planda ne
		// yapıyorlar

		// int ve Integer farkı

		// Araştır bunları

		// JRE, JDK kullanılarak yaratılan Java kodunu, JVM'de çalıştırmak üzere gereken
		// kitaplıklarla birleştirir ve daha sonra, ortaya çıkan programı yürüten
		// JVM'nin bir eşgörünümünü oluşturur. JVM'ler birden çok işletim sistemi için
		// kullanılabilir ve JRE ile yaratılan programlar tüm sistemlerde çalışır.

		// JRE(Java Runtime Enviroment) ise java programlama dili ile yazılmış olan
		// uygulama ve appletlerin çalışmasını sağlayan bileşenler ile JVM e
		// kütüphaneler sağlar.Derlenmiş byte codelar direk olarak CPU üzerinde
		// çalışmazlar. CPU tarafından anlaşılması için aradaki JVM bytecode ları
		// okunabilir makine kodları olarak yorumlar. Aslında; java bytecode ların bütün
		// platformalarda çalışması JRE sayesindedir. İçerisinde; JVM, Core kitaplıkları
		// ve Java yazılımında yazılan uygulamaları ve küçük uygulamaları çalıştırmak
		// için diğer ek bileşenleri içerir. JRE’nin görevi Java kodları derlendikten
		// sonra bir ara dil olarak kabul edilen Java bayt kodlarını oluşturmaktır. Bu
		// bayt kodlar bütün işletim sistemleri için aynıdır.

		//JDK(Java Development Kit) ise java da geliştirme yapmak isteyen her developer ın mutlaka 
//		indirmesi gereken bir bileşendir. Kısaca java için SDK(Software Development Kit) 
//		diyebiliriz. Hem yorumlayıcı hem de derleyici görevini üstlenmektedir.JRE ile birlikte 
//		appletleri ve uygulamaları geliştirirken zorunlu olan debuggers ve compilers gibi 
//		geliştirme araçlarını da bünyesinde bulundurur.

//O zaman Özetle şu şekilde düşünebiliriz:
//
//JRE=JVM + Java Kütüphaneleri
//
//JDK=JRE + Compiler + debugger
	}

}
