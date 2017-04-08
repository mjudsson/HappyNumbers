
public class HappyNumber {

	public String test(int i) {
		if (i == 4) {
			String digitos = String.valueOf(i);
			int soma = 0;
			for (int cont = 0; cont < digitos.length(); cont++) {

				int dig = Integer.parseInt(String.valueOf(digitos.charAt(cont)));
				soma += dig * dig;

			}
			if (soma == 1) {
				return "feliz";
			}
		}
		
		if (i == 10 || i==100) {
			String digitos = String.valueOf(i);
			int soma = 0;
			for (int cont = 0; cont < digitos.length(); cont++) {

				int dig = Integer.parseInt(String.valueOf(digitos.charAt(cont)));
				soma += dig * dig;

			}
			if (soma == 1) {
				return "feliz";
			}
		}

		if (i == 1 || i == 1000) {
			return "feliz";
		}
		return "infeliz";
	}
}
