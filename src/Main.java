import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		BigDecimal q = new BigDecimal(353), raizPrimitivaDe_q = new BigDecimal(3);
		BigDecimal chavePublica_Alice, chavePublica_Bob;
		
		Pessoa alice = new Pessoa(97);
		Pessoa bob = new Pessoa(233);
		
		chavePublica_Alice = alice.calculoChavePublica(q, raizPrimitivaDe_q);
		chavePublica_Bob = bob.calculoChavePublica(q, raizPrimitivaDe_q);
		
		alice.calculoChaveSecretaComum(q, chavePublica_Bob, alice.getChavePrivada());
		bob.calculoChaveSecretaComum(q, chavePublica_Alice, bob.getChavePrivada());
		
		

		

	}
}
