
public class SpinWord {
	public String spinWords(String sentence) {
		String nova = "";
		String resposta = "";
		String palavra[] = sentence.split(" ");
		for (int i = 0; i < palavra.length; i++) {
			nova = "";
			if (palavra[i].length() >= 5) {
				for (int j = palavra[i].length(); j > 0; j--) {
					nova += palavra[i].charAt(j - 1);
				}
				palavra[i] = nova;
			}

		}
		for (int k = 0; k < palavra.length; k++) {
			if (k + 1 == palavra.length) {
				resposta += palavra[k];
				break;
			}
			if (palavra.length == 1) {
				resposta += palavra[k];
				break;
			}
			resposta += palavra[k] + " ";
		}

		return resposta;
	}
}
