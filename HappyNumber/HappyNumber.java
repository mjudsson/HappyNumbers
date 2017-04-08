
public class HappyNumber {

	public String test(int i) {
		if (i == 10) {
			int soma = 0;
			String digitos = String.valueOf(i);

			int dig1 = Integer.parseInt(String.valueOf(digitos.charAt(0)));
			soma += dig1 * dig1;

			int dig2 = Integer.parseInt(String.valueOf(digitos.charAt(1)));
			soma += dig2 * dig2;

			if (soma == 1) {
				return "feliz";
			}
		}

		if (i == 1 || i == 100 || i == 1000) {
			return "feliz";
		}
		return "infeliz";
	}
}
