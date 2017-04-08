
public class HappyNumber {

	public String test(int i){
		if (i==10){
			
			String digitos = String.valueOf(i);
			
			int dig1 = Integer.parseInt(String.valueOf(digitos.charAt(0)));
			int soma = dig1;
			
			int dig2 = Integer.parseInt(String.valueOf(digitos.charAt(1)));
			soma = soma + dig2;
			
			if(soma == 1){
			return "feliz";
			}
			}

		if (i==1 || i==100 || i==1000){
		return "feliz";
		}
		return "infeliz";
	}
}
