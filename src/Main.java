import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Long chavePrivada_Bob, chavePublica_Bob, chavePrivada_Alice, chavePublica_Alice;
		
		Pessoa Bob = new Pessoa();
		Bob.setChavePrivada(sc.nextLong());
		Bob.calculoChavePublica();
		System.out.println(Bob.getChavePublica());
		System.out.println((Math.pow(3, 97)) % 353);

	}
}
